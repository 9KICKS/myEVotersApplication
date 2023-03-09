package services;

import data.models.User;
import dtos.requests.LoginUserRequest;
import dtos.requests.RegisterUserRequest;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public User registerUser(RegisterUserRequest request) {
        String username = request.getUsername();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null;
            }
        }
        User newUser = new User(
                request.getFirstName(),
                request.getLastName(),
                request.getStateOfBirth(),
                request.getDateOfBirth(),
                request.getPhoneNumber(),
                request.getUsername(),
                request.getPassword()
        );
        users.add(newUser);
        return newUser;
    }

    @Override
    public User loginUser(LoginUserRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}