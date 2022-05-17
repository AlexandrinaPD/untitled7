package com.company;

public class Store {
    private String name;
    private String url;
    private User[] users;
    private User authorizedUser;

    public Store(String name, String url, User[] users) {
        this.name = name;
        this.url = url;
        this.users = users;
        this.authorizedUser = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public boolean isLogin(String login, String password) {
        if (login == null || password == null) {
            return false;
        }
        for (User user : users) {
            if (user != null && user.getLogin() != null && user.getPassword() != null &&
                    user
                            .getLogin()
                            .equalsIgnoreCase(login.toLowerCase()) &&
                    user
                            .getPassword()
                            .equalsIgnoreCase(password.toLowerCase())) {
                authorizedUser = user;
                return true;
            }
        }
        return false;
    }
}
