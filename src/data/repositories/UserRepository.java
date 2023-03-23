package data.repositories;

import data.models.User;
import java.util.List;

public interface UserRepository {
    User addUser(User user);
    User getUser(String vin);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    void deleteUser(String vin);
}