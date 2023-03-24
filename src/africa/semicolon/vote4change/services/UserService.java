package africa.semicolon.vote4change.services;

import africa.semicolon.vote4change.dtos.requests.LoginUserRequest;
import africa.semicolon.vote4change.dtos.requests.RegisterUserRequest;
import africa.semicolon.vote4change.dtos.responses.LoginUserResponse;
import africa.semicolon.vote4change.dtos.responses.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest request);
    LoginUserResponse loginUser(LoginUserRequest request);
}