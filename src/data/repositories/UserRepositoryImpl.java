package data.repositories;

import data.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final ArrayList<User> users = new ArrayList<>();

    @Override
    public User addUser(User user) {
        user.setUserID(users.size() + 1);
        users.add(user);
        return user;
    }

    @Override
    public User getUser(int userId) {
        for (User user : users) {
            if (user.getUserID() == userId) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public void deleteUser(int userId) {
        users.removeIf(user -> user.getUserID() == userId);
    }
}