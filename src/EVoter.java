import Controllers.CandidateController;
import Controllers.UserController;
import Controllers.VoteController;
import dtos.requests.CastVoteRequest;
import dtos.requests.LoginUserRequest;
import dtos.requests.RegisterUserRequest;
import dtos.responses.CastVoteResponse;
import javax.swing.*;

public class EVoter {
    private static final UserController userController = new UserController();
    private static final CandidateController candidateController = new CandidateController();
    private static final VoteController voteController = new VoteController();

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            choice = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    2023 Presidential Election
                                                
                    1 -> Register
                    2 -> Login
                    3 -> Cast vote
                    4 -> Quit application
                                                
                    Enter your choice:
                    """, "E-Voters Application", JOptionPane.INFORMATION_MESSAGE));

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> loginUser();
                case 3 -> castVote();
                case 4 -> JOptionPane.showMessageDialog(null, "Thanks for voting. Remember: Bad officials are elected by good citizens who don’t vote. Come back next poll.", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
                default -> JOptionPane.showMessageDialog(null, "Invalid choice, please try again.", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static void registerUser() {
        String firstName = JOptionPane.showInputDialog(null, "Enter your first name:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        String lastName = JOptionPane.showInputDialog(null, "Enter your last name:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        String stateOfBirth = JOptionPane.showInputDialog(null, "Enter your state of origin:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        String dateOfBirth = JOptionPane.showInputDialog(null, "Enter your date of birth (DD-MM-YYYY):", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        String phoneNumber = JOptionPane.showInputDialog(null, "Enter your phone number:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        String username = JOptionPane.showInputDialog(null, "Enter a username:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        JPasswordField passwordField = new JPasswordField();
        JOptionPane.showConfirmDialog(null, passwordField, "Create password:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        RegisterUserRequest request = new RegisterUserRequest(firstName, lastName, stateOfBirth, dateOfBirth, phoneNumber, username, password);
        Object response = userController.registerUser(request);
        JOptionPane.showMessageDialog(null, response);
    }

    private static void loginUser() {
        String username = JOptionPane.showInputDialog(null, "Enter your username:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        JPasswordField passwordField = new JPasswordField();
        JOptionPane.showConfirmDialog(null, passwordField, "Enter your password:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        LoginUserRequest request = new LoginUserRequest(username, password);
        Object response = userController.loginUser(request);
        JOptionPane.showMessageDialog(null, response);
    }

    private static void castVote() {
        String userID = JOptionPane.showInputDialog(null, "Enter your user ID:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        String candidateID = JOptionPane.showInputDialog(null, "Enter the candidate ID you wish to vote for:", "E-Voters Application", JOptionPane.INFORMATION_MESSAGE);
        try {
            int userId = Integer.parseInt(userID);
            int candidateId = Integer.parseInt(candidateID);
            CastVoteRequest request = new CastVoteRequest(userId, candidateId);
            CastVoteResponse response = voteController.castVote(request);
            JOptionPane.showMessageDialog(null, response.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input, please enter a number.", "E-Voters Application:", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}