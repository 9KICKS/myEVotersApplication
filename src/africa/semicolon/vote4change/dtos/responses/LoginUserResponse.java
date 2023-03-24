package africa.semicolon.vote4change.dtos.responses;

public class LoginUserResponse {
    private final String message;

    public LoginUserResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}