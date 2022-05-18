package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("user1", "qwerty1", "User1", Positions.DIRECTOR);
        User user2 = new User("User2", "qwerty2", "User2", Positions.ADMINISTRATOR);
        User user3 = new User("User3", "qwerty3", "User3", Positions.MANAGER);
        User user4 = new User("User4", "qwerty4", "User4", Positions.CLIENT);
        User user5 = new User("User5", "qwerty5", "User5", Positions.ANONYMOUS);

        User[] users = {user1, user2, user3, user4, user5};
        Store store = new Store("Magaz", "https://magaz.com.ua", users);


        while (store.getAuthorizedUser() == null) {
            tryLogin(store);
        }


    }

    public static void tryLogin(Store store) {
        System.out.println("Введите логин: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        if (store.login(login, password)) {
            System.out.println("Пользователь " + store.getAuthorizedUser().getName() + " " + store.getAuthorizedUser().getPositions().name());
        } else {
            System.out.println("Пользователь с логином " + login + " не найден или не правильный пароль");
        }
    }
}
