package Controllers;

import dtos.requests.LoginUserRequest;
import dtos.requests.RegisterUserRequest;
import services.UserService;
import services.UserServiceImpl;

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