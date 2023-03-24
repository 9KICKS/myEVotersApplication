package africa.semicolon.vote4change.dtos.requests;

public class LoginUserRequest {
    private final String vin;
    private final String password;

    public LoginUserRequest(String vin, String password) {
        this.vin = vin;
        this.password = password;
    }

    public String getVin() {
        return vin;
    }

    public String getPassword() {
        return password;
    }
}