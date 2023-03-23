package services;

import data.models.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImpl;
import dtos.requests.LoginUserRequest;
import dtos.requests.RegisterUserRequest;
import dtos.responses.LoginUserResponse;
import dtos.responses.RegisterUserResponse;
import javax.swing.*;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserRepositoryImpl();
    private final List<User> users = userRepository.getAllUsers();

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        try {
            for (User user : users) {
                if (user.getVin()==(request.getVin())) {
                    JOptionPane.showMessageDialog(null, "VIN already exists, try a valid VIN.");
                    throw new IllegalArgumentException("VIN already exists");
                }
                if (user.getPassword().equals(request.getPassword())) {
                    JOptionPane.showMessageDialog(null, "Password already exists, try a valid password.");
                    throw new IllegalArgumentException("Password already exists");
                }
            }
        String vin = request.getVin();
        for (User user : users) {
            if (user.getVin().equals(vin)) {
                return null;
            }
        }
        User newUser = new User(
                request.getFirstName(),
                request.getLastName(),
                request.getStateOfBirth(),
                request.getDateOfBirth(),
                request.getPhoneNumber(),
                request.getVin(),
                request.getPassword()
        );
        users.add(newUser);
        String message = "User sucessfully created.";
        JOptionPane.showMessageDialog(null, message);
        return new RegisterUserResponse(message, newUser.getVin());
    } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            throw ex;
        }
    }

    @Override
    public LoginUserResponse loginUser(LoginUserRequest request) {
        try {
            for (User user : users) {
                if (user.getUsername().equals(request.getVin()) && user.getPassword().equals(request.getPassword())) {
                    JOptionPane.showMessageDialog(null, "Login successful.");
                }
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Incorrect VIN or password.");
            throw ex;
        }
        return new LoginUserResponse("Login successful.");
    }
}