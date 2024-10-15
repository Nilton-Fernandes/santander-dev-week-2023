package me.dio.service.impl;

import me.dio.model.User;

public interface UserService {

    //criar métodos
    User findById(Long id);

    User create (User userToCreate);
}
