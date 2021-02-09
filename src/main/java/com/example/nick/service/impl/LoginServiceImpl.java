package com.example.nick.service.impl;

import com.example.nick.exception.InvalidUserCredentialsException;
import com.example.nick.model.User;
import com.example.nick.repository.LoginRepository;
import com.example.nick.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    private final LoginRepository loginRepository;

    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public User login(String username, String password) {
        if(username==null || username.isEmpty() || password==null || password.isEmpty())
        {
            throw new IllegalArgumentException();
        }
        return loginRepository.findByUsernameAndPassword(username,password).orElseThrow(InvalidUserCredentialsException::new);
    }
}
