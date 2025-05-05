package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.dao.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> retrieveAllUsers() {
        return userRepository.findAllUsers();
    }

    @Override
    @Transactional
    public void registerOrModifyUser(User user) {
        userRepository.insertOrUpdateUser(user);
    }

    @Override
    @Transactional
    public void eraseUser(Long id) {
        userRepository.removeUser(id);
    }
}
