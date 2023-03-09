package dtos.responses;

import data.models.User;

public class LoginUserResponse {
    private final boolean loginSuccessful;
    private final String message;
    private final User user;

    public LoginUserResponse(boolean loginSuccessful, String message, User user) {
        this.loginSuccessful = loginSuccessful;
        this.message = message;
        this.user = user;
    }

    public boolean isLoginSuccessful() {
        return loginSuccessful;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}