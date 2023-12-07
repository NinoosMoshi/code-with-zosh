package com.ninos.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.model.dto.AccountResponse;
import com.ninos.model.dto.ActiveAccount;
import com.ninos.model.dto.JwtAuthResponse;
import com.ninos.model.dto.LoginDTO;
import com.ninos.model.dto.LoginResponse;
import com.ninos.model.dto.Mail;
import com.ninos.model.dto.NewPassword;
import com.ninos.model.dto.RegisterDTO;
import com.ninos.model.dto.UserActive;
import com.ninos.model.entity.User;
import com.ninos.service.auth.AuthService;
import com.ninos.service.email.EmailService;
import com.ninos.util.UserCode;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;


    @PostMapping("/register")
    public ResponseEntity<AccountResponse> register(@RequestBody RegisterDTO registerDTO){
        AccountResponse newUser = authService.register(registerDTO);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }


    @PostMapping("/login")
    public ResponseEntity<JwtAuthResponse> login(@RequestBody LoginDTO loginDTO){
        JwtAuthResponse jwtAuthResponse = authService.login(loginDTO);
        return new ResponseEntity<>(jwtAuthResponse, HttpStatus.OK);
    }


    @PostMapping("/active")
    public UserActive getActiveCustomer(@RequestBody LoginDTO loginDTO){
       return authService.getUserActive(loginDTO);
    }


    @PostMapping("/activated")
    public AccountResponse activeAccountUser(@RequestBody ActiveAccount activeAccount){
        return authService.activeAccount(activeAccount);
    }


    @PostMapping("/check-email")
    public AccountResponse checkEmailUser(@RequestBody LoginResponse loginResponse){
       return authService.checkEmail(loginResponse);
    }

    @PostMapping("/reset-password")
    public AccountResponse resetPassword(@RequestBody NewPassword newPassword){
        return authService.resetPassword(newPassword);
    }



}
