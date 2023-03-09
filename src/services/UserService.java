package services;

import data.models.User;
import dtos.requests.LoginUserRequest;
import dtos.requests.RegisterUserRequest;

public interface UserService {
    User registerUser(RegisterUserRequest request);

    User loginUser(LoginUserRequest request);
}