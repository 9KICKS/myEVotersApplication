package africa.semicolon.vote4change.dtos.responses;

public class RegisterUserResponse {
    private String user;
    private String message;

    public RegisterUserResponse(String message, String user) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}