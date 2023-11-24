package com.example.ecommerce.service.impl;

import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UserServiceImpl {

    private final JwtProvider jwtProvider;
    private final MailSender mailSender;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final PerfumeRepository perfumeRepository;
    private final ReviewRepository reviewRepository;

    @Value("${hostname}")
    private String hostname;

    @Override
    public User findUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAllByOrderByIdAsc();
    }
}
