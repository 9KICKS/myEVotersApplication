package africa.semicolon.vote4change.Controllers;

import africa.semicolon.vote4change.dtos.requests.LoginUserRequest;
import africa.semicolon.vote4change.dtos.requests.RegisterUserRequest;
import africa.semicolon.vote4change.services.UserService;
import africa.semicolon.vote4change.services.UserServiceImpl;

public class UserController {
    private final UserService userService = new UserServiceImpl();

    public Object registerUser(RegisterUserRequest request) {
        try {
            return userService.registerUser(request);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }

    public Object loginUser(LoginUserRequest request) {
        try {
            return userService.loginUser(request);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}