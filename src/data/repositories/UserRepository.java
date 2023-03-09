package data.repositories;

import data.models.User;
import java.util.List;

public interface UserRepository {
    User addUser(User user);

    User getUser(int userId);

    User getUserByUsername(String username);

    List<User> getUsers();

    void deleteUser(int userId);
}