package edu.eci.taskPlanner.Persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.eci.taskPlanner.Model.Task;
import edu.eci.taskPlanner.Model.User;

public class TaskPlannerPersistence {

    private List<User> users = new ArrayList<User>();
    private List<Task> tasks = new ArrayList<Task>();

    public TaskPlannerPersistence() {
        User usuario1 = new User("01", "jonatan@mail.com", "jonatan123", "Jonatan Gonzalez");
        User usuario2 = new User("02", "andrea@gmail.com", "andrea123", "Andrea Mendoza");
        User usuario3 = new User("03", "pedro@mail.com", "pedro123", "Pedro Ruiz");
        users = Arrays.asList(usuario1,usuario2,usuario3);

        String dueDate1 = "18-09-2020";
        Task task1 = new Task("01","Done","View login", dueDate1, usuario1);

        String dueDate2 = "25-09-2020";
        Task task2 = new Task("02","Ready","View logout", dueDate2, usuario2);

        String dueDate3 = "02-10-2020";
        Task task3 = new Task("03","In progress","View Admin", dueDate3, usuario3);

        tasks = Arrays.asList(task1,task2,task3);
    }
    
    public List<User> getAllUsers() {
        return  users;
    }

    public User getUserById(String userId) {
        for (User u : users) {
            if( u.getId().equals(userId)){
                return u;
            }
        }
		return null;
    }

    public User createUser(User user) throws Exception {
        for (User u : users) {
            if( u.getId().equals(user.getId())){
                throw new Exception("Id User already exist !");
            }else{
                users.add(user);
            }
        }
        return user;
    }

    public User updateUser(User user) {
        for (User u : users) {
            if( u.getId().equals(user.getId())){
                u.setEmail(user.getEmail());
                u.setName(user.getName()); 
            }
        }
        return user;
    }

    public void removeUser(String userId) {
        for (User u : users) {
            if( u.getId().equals(userId)){
                users.remove(u); 
            }
        }
    }
    
}