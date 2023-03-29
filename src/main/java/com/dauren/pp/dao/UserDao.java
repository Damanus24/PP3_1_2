package com.dauren.pp.dao;



import com.dauren.pp.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public void updateUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

}
