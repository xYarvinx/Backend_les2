package edu.phoenix;

import edu.phoenix.dao.Database;
import edu.phoenix.model.User;

public class Application {

  public static void main(String[] args) {
    User user_1 = new User("Petya", "Petek", "123455");
    User user_2 = new User("Petya", "Petek", "123455");
    Database.addUser(user_1.getName(), user_1.getLogin(), user_1.getPassword());
    Database.addUser(user_2.getName(),user_2.getLogin(),user_2.getPassword());
    System.out.print(Database.getUser("Petek", "123455"));
  }
}
