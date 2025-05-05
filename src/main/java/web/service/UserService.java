package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> retrieveAllUsers();
    void registerOrModifyUser(User user);
    void eraseUser(Long id);
}
