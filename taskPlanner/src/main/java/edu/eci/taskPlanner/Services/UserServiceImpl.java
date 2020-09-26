package edu.eci.taskPlanner.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.taskPlanner.Model.User;
import edu.eci.taskPlanner.Persistence.TaskPlannerPersistence;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    
    private TaskPlannerPersistence taskPlanner = new TaskPlannerPersistence();

    @Override
    public List<User> getAll() {
        return taskPlanner.getAllUsers();
    }

    @Override
    public User getById(String userId) {
        return taskPlanner.getUserById(userId);
    }

    @Override
    public User create(User user) throws Exception {
        return taskPlanner.createUser(user);
    }

    @Override
    public User update(User user) {
        return taskPlanner.updateUser(user);
    }

    @Override
    public void remove(String userId) {
        taskPlanner.removeUser(userId);
    }
}