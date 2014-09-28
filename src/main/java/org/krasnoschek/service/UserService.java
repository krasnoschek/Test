package org.krasnoschek.service;


import org.krasnoschek.model.Authority;
import org.krasnoschek.model.User;
import org.krasnoschek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user){
        HashSet<Authority> authorities = new HashSet<>();
        authorities.add(new Authority("USER"));
        return userRepository.save(user);
    }

}
