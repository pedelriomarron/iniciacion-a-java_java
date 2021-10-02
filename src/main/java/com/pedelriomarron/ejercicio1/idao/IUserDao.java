package com.pedelriomarron.ejercicio1.idao;

import com.pedelriomarron.ejercicio1.users.User;

import java.util.List;

public interface IUserDao {

    public List<User> getUsers();
    public User getUser(String email);
    public void updateUser(User user);
    public void deleteUser(User user);


}
