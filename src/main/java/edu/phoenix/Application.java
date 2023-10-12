package edu.phoenix;

import edu.phoenix.dao.Database;
import edu.phoenix.model.User;

public class Application {

  public static void main(String[] args) {
    User user_1 = new User("Petya", "Petek", "123455");
    Database.getUser("Petek", "122");
  }
}
