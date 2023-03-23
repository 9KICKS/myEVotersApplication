package services;

import dtos.requests.LoginUserRequest;
import dtos.requests.RegisterUserRequest;
import dtos.responses.LoginUserResponse;
import dtos.responses.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest request);
    LoginUserResponse loginUser(LoginUserRequest request);
}