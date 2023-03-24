package africa.semicolon.vote4change.data.repositories;

import africa.semicolon.vote4change.data.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final ArrayList<User> users = new ArrayList<>();

    @Override
    public User addUser(User user) {
        user.setVin(String.valueOf(users.size() + 1));
        users.add(user);
        return user;
    }

    @Override
    public User getUser(String vin) {
        for (User user : users) {
            if (user.getVin().equals(vin)) {
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
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public void deleteUser(String vin) {
        users.removeIf(user -> user.getVin().equals(vin));
    }
}