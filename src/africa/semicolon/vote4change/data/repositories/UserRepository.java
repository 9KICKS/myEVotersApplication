package africa.semicolon.vote4change.data.repositories;

import africa.semicolon.vote4change.data.models.User;
import java.util.List;

public interface UserRepository {
    User addUser(User user);
    User getUser(String vin);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    void deleteUser(String vin);
}