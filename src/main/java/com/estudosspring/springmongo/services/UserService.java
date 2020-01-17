package com.estudosspring.springmongo.services;

import com.estudosspring.springmongo.domain.User;
import com.estudosspring.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository  userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
