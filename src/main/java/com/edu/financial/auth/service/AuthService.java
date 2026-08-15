package com.edu.financial.auth.service;

import com.edu.financial.auth.model.LoginRequest;
import com.edu.financial.auth.model.LoginResponse;
import com.edu.financial.auth.model.RegisterRequest;
import com.edu.financial.auth.model.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}
