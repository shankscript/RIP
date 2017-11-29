package com.shanks.rest.dao;
import com.shanks.rest.model.Login;
import com.shanks.rest.model.User;
public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}