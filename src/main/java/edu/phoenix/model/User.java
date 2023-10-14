package edu.phoenix.model;

public class User {
  private String name;
  private String login;
  private String password;

  public void UpdateUser (User user) {
    this.name = user.getName();
    this.password = user.getPassword();
  }

  public User(String name, String login, String password) {
    this.name = name;
    this.login = login;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }
}
