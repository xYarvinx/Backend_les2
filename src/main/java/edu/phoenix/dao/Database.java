package edu.phoenix.dao;

import edu.phoenix.model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
  static class UserNotFound extends Exception {

  };

  public static List<User> dataBase = new ArrayList<>();

  public static void addUser(String name, String login, String password) {
        dataBase.add(new User(name, login, password));
  }

  public static User getUser(String login, String password) {
    try {
      for (User user_db : dataBase) {
        if (user_db.getLogin().equals(login) && user_db.getPassword().equals(password)) {
          return user_db;
        }
      }
      throw new UserNotFound();
    }
    catch (UserNotFound e) {
      System.out.println("Пользователь не найден!");
      return null;
    }
  }

  public static void deleteUser(String login) {
      dataBase.removeIf(user_db -> user_db.getLogin().equals(login));;
  }

  public static void updateUser(User user) {
    try {
      for (User user_db : dataBase) {
        if (user_db.getLogin().equals(user.getLogin())) {
          user_db.UpdateUser(user);
        }
      }
      throw new UserNotFound();
    }catch(UserNotFound userNotFound) {
        System.out.println("Пользователь не найден");
      }

    }


  }



