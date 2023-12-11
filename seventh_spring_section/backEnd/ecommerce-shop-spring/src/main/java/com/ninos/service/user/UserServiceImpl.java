package com.ninos.service.user;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ninos.exception.UserException;
import com.ninos.model.entity.User;
import com.ninos.repository.UserRepository;
import com.ninos.security.JwtTokenProvider;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;


    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()){
          return user.get();
        }
        throw new UserException("user not found with id: " + userId);
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = jwtTokenProvider.getUsername(jwt);

        User user = userRepository.findByEmail(email).get();

        if(user == null){
            throw new UserException("user not found with email " + email);
        }
        return user;
    }



}
