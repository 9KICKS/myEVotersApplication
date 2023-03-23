package dtos.requests;

public class RegisterUserRequest {
    private String firstName;
    private String lastName;
    private String stateOfBirth;
    private String dateOfBirth;
    private String phoneNumber;
    private String vin;
    private String password;

    public RegisterUserRequest(String firstName, String lastName, String stateOfBirth, String dateOfBirth, String phoneNumber, String vin, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stateOfBirth = stateOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.vin = vin;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStateOfBirth() {
        return stateOfBirth;
    }

    public void setStateOfBirth(String stateOfBirth) {
        this.stateOfBirth = stateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}