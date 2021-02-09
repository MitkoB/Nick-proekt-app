package com.example.nick.service;

import com.example.nick.model.User;

public interface LoginService {
    User login(String username, String password);

}
