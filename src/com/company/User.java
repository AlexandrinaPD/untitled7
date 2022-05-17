package com.company;

public class User{
    private String login;
    private String password;
    private String name;
    private Positions positions = Positions.ANONYMOUS;

    public User(String login, String password, String name, Positions ANONYMOUS) {
        this.login = login;
        this.password = password;
        this.name = name;
        positions = ANONYMOUS;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Positions getPositions() {
        return positions;
    }

    public void setPositions(Positions positions) {
        this.positions = positions;
    }
}
