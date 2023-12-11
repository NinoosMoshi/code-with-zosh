package com.ninos.service.user;

import com.ninos.exception.UserException;
import com.ninos.model.entity.User;

public interface UserService {

    User findUserById(Long userId) throws UserException;

    User findUserProfileByJwt(String jwt) throws UserException;

}
