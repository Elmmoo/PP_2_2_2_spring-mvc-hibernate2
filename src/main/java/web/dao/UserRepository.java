package web.dao;

import web.model.User;
import java.util.List;

public interface UserRepository {
    List<User> findAllUsers();
    void insertOrUpdateUser(User user);
    User fetchUserById(Long id);
    void removeUser(Long id);
}
