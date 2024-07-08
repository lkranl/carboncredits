package com.eis.carboncredits.services;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.eis.carboncredits.models.User;
import com.eis.carboncredits.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}