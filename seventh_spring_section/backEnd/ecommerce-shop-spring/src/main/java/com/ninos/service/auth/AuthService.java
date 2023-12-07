package com.ninos.service.auth;

import com.ninos.model.dto.AccountResponse;
import com.ninos.model.dto.ActiveAccount;
import com.ninos.model.dto.JwtAuthResponse;
import com.ninos.model.dto.LoginDTO;
import com.ninos.model.dto.LoginResponse;
import com.ninos.model.dto.NewPassword;
import com.ninos.model.dto.RegisterDTO;
import com.ninos.model.dto.UserActive;
import com.ninos.model.entity.User;

public interface AuthService {

    AccountResponse register(RegisterDTO registerDTO);
    JwtAuthResponse login(LoginDTO loginDTO);

    UserActive getUserActive(LoginDTO loginDTO);
    User getByEmail(String email);
    AccountResponse activeAccount(ActiveAccount activeAccount);
    AccountResponse checkEmail(LoginResponse loginResponse);
    AccountResponse resetPassword(NewPassword newPassword);


}
