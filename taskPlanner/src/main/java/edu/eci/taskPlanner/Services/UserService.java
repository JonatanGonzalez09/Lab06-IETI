package edu.eci.taskPlanner.Services;

import java.util.List;

import edu.eci.taskPlanner.Model.User;

/**
 * UserService
 */
public interface UserService {

    List<User> getAll();

    User getById(String userId);
    
    User create(User user) throws Exception;
    
    User update(User user);
    
    void remove(String userId);
    
}