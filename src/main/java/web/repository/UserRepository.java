package web.repository;

import web.model.User;
import java.util.List;

public interface UserRepository {
    List<User> getAll();
    void save(User user);
    User getById(Long id);
    void delete(Long id);
}
