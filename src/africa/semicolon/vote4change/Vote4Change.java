package africa.semicolon.vote4change;

import africa.semicolon.vote4change.Controllers.UserController;
import africa.semicolon.vote4change.Controllers.VoteController;
import africa.semicolon.vote4change.data.models.Candidate;
import africa.semicolon.vote4change.dtos.requests.CastVoteRequest;
import africa.semicolon.vote4change.dtos.requests.LoginUserRequest;
import africa.semicolon.vote4change.dtos.requests.RegisterUserRequest;
import africa.semicolon.vote4change.dtos.responses.CastVoteResponse;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import java.util.Random;

public class Vote4Change {
    private static final String ADMIN_VIN = "0908";
    private static final String ADMIN_PASSWORD = "SHOP9KICKS.";
    private static String vin = "";
    private static String password = "";

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        while (true) {
            int choice = showLoginMenu();
            switch (choice) {
                case 1 -> {
                    RegisterUserRequest registerRequest = registerUser();
                    UserController userController = new UserController();
                    Object registerResponse = userController.registerUser(registerRequest);
                    JOptionPane.showMessageDialog(null, registerResponse);
                }
                case 2 -> {
                    LoginUserRequest loginRequest = loginUser();
                    UserController userController2 = new UserController();
                    Object loginResponse = userController2.loginUser(loginRequest);
                    if (loginResponse instanceof String) {
                        JOptionPane.showMessageDialog(null, loginResponse);
                    } else {
                        boolean isAdmin = vin.equals(ADMIN_VIN) && password.equals(ADMIN_PASSWORD);
                        showMainMenu(isAdmin);
                    }
                }
                case 3 -> System.exit(0);
            }
        }
    }

    private static int showLoginMenu() {
        String[] options = {"Register", "Login", "Exit"};
        int choice = JOptionPane.showOptionDialog(null, "Welcome to Vote4Change!\nPlease choose an option:", "Vote4Change", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        return choice + 1;
    }

    private static RegisterUserRequest registerUser() {
        String firstName = JOptionPane.showInputDialog(null, "Enter your first name:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
        String lastName = JOptionPane.showInputDialog(null, "Enter your last name:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
        String stateOfBirth = JOptionPane.showInputDialog(null, "Enter your state of birth:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
        String dateOfBirth = JOptionPane.showInputDialog(null, "Enter your date of birth:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
        String phoneNumber = JOptionPane.showInputDialog(null, "Enter your phone number:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
        String vin = JOptionPane.showInputDialog(null, "Enter your VIN:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
        JPasswordField passwordField = new JPasswordField();
        JOptionPane.showConfirmDialog(null, passwordField, "Create your password:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        return new RegisterUserRequest(firstName, lastName, stateOfBirth, dateOfBirth, phoneNumber, vin, password);
    }

    private static LoginUserRequest loginUser() {
        String vin = JOptionPane.showInputDialog(null, "Enter your VIN:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
        JPasswordField passwordField = new JPasswordField();
        JOptionPane.showConfirmDialog(null, passwordField, "Enter your password:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        Vote4Change.vin = vin;
        Vote4Change.password = password;
        return new LoginUserRequest(vin, password);
    }

    private static void showMainMenu(boolean isAdmin) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (isAdmin) {
            showAdminMenu();
        } else {
            showUserMenu();
        }
    }

    private static void showAdminMenu() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String[] options = {"Collate Election Result", "Rig Election", "Logout"};
        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Independent National Electoral Commission", "Vote4Change", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0 -> {
                    JProgressBar progressBar = new JProgressBar();
                    progressBar.setIndeterminate(true);
                    JOptionPane.showMessageDialog(null, progressBar, "Collating Election Result", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Election result collated successfully.", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                }
                case 1 -> {
                    JOptionPane.showInputDialog(null, "Enter candidate name (1. Atiku Abubakar, 2. Rabiu Musa Kwankwaso, 3. Peter Obi, 4. Bola Tinubu):", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showInputDialog(null, "Enter number of votes to add:", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Election rigged successfully.", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "You were credited with ₦500,000,000,000.", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "You have logged out.", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                    main(null);
                }
            }
        }
    }

    private static void showUserMenu() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String[] options = {"Cast Vote", "Candidates Info", "Election Result", "Customize Vote4Change", "Logout"};
        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "2023 Presidential Election", "Vote4Change", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0 -> {
                    String candidateInput = JOptionPane.showInputDialog(null, "Please enter the number of the candidate you want to vote for:\n1. Atiku Abubakar (PDP)\n2. Rabiu Musa Kwankwaso (NNPP)\n3. Peter Obi (LP)\n4. Bola Tinubu (APC)", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                    CastVoteRequest voteRequest = new CastVoteRequest(candidateInput);
                    VoteController voteController = new VoteController();
                    CastVoteResponse voteResponse = voteController.castVote(voteRequest);
                    JOptionPane.showMessageDialog(null, voteResponse.getMessage());
                }
                case 1 -> {
                    String candidatesInfo = "";
                    candidatesInfo += "Peter Obi (61 years) - Peter Gregory Obi CON is a Nigerian businessman and politician who served as governor of Anambra from March to November 2006, February to May 2007, and June 2007 to March 2014.\n";
                    candidatesInfo += "Bola Tinubu (70 years) - Chief Bola Ahmed Adekunle Tinubu is a Nigerian accountant and politician who served as governor of Lagos State from 1999 to 2007 and senator for Lagos West during the brief Third Republic.\n";
                    candidatesInfo += "Atiku Abubakar (76 years) - Atiku Abubakar GCON is a Nigerian politician and businessman who served as the vice president of Nigeria from 1999 to 2007 during the presidency of Olusegun Obasanjo.\n";
                    candidatesInfo += "Rabiu Kwankwaso (66 years) - Mohammed Rabi'u Musa Kwankwaso, FNSE FNIQS is a Nigerian politician who was the Governor of Kano state from 1999 to 2003 and 2011 to 2015.\n";
                    JOptionPane.showMessageDialog(null, candidatesInfo, "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                }
                case 2 -> {
                    Candidate[] candidates = {
                            new Candidate("Atiku Abubakar", "PDP"),
                            new Candidate("Rabiu Musa Kwankwaso", "NNPP"),
                            new Candidate("Peter Obi", "LP"),
                            new Candidate("Bola Tinubu", "APC")
                    };
                    Random rand = new Random();
                    Candidate winner = candidates[rand.nextInt(candidates.length)];
                    String result = String.format("The Winner of the 2023 Presidential Election is %s", winner.getName());
                    JOptionPane.showMessageDialog(null, result, "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                }
                case 3 -> {
                    String[] themeOptions = {"O.S Default", "Dark Mode", "Light Mode"};
                    int themeChoice = JOptionPane.showOptionDialog(null, "Select Vote4Change theme:", "Vote4Change", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, themeOptions, themeOptions[0]);
                    switch (themeChoice) {
                        case 0 -> UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        case 1 -> {
                            try {
                                UIManager.setLookAndFeel(new FlatDarkLaf());
                            } catch (UnsupportedLookAndFeelException e) {
                                JOptionPane.showMessageDialog(null, "Unable to set the Dark Mode theme. Using the default theme instead.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        case 2 -> {
                            try {
                                UIManager.setLookAndFeel(new FlatLightLaf());
                            } catch (UnsupportedLookAndFeelException e) {
                                JOptionPane.showMessageDialog(null, "Unable to set the Light Mode theme. Using the default theme instead.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "You have logged out.", "Vote4Change", JOptionPane.INFORMATION_MESSAGE);
                    main(null);
                }
            }
        }
    }
}