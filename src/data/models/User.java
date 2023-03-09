package data.models;

public class User {
    private int userID;
    private String firstName;
    private String lastName;
    private String stateOfBirth;
    private String dateOfBirth;
    private String phoneNumber;
    private String username;
    private String password;

    public User(String firstName, String lastName, String stateOfBirth, String dateOfBirth, String phoneNumber, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stateOfBirth = stateOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }

    public User(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}