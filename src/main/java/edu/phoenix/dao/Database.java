package edu.phoenix.dao;

import edu.phoenix.model.User;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;

public class Database {
  static class UserNotFound extends Exception {
    public void errorMessage(){
      System.out.println("Пользователь не найден");
    }
  };

  public static List<User> dataBase = new ArrayList<>();

  public static void addUser(String name, String login, String password) {
    try {
        if (getUser(login, password) == null) {
            dataBase.add(new User(name, login, password));
        } else {
            throw new UserNotFound();
        }
    } catch (UserNotFound e){
      e.errorMessage();
    }
  }

  public static User getUser(String login, String password) {
      for (User user_db : dataBase) {
        if (user_db.getLogin().equals(login) && user_db.getPassword().equals(password)) {
          return user_db;
        }
    }
    return null;
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
       userNotFound.errorMessage();
      }

    }


  }



