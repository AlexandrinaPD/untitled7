package com.company;

public enum Positions {
    DIRECTOR("Директор магазина, может управлять кадрами, и ценами"),
    ADMINISTRATOR("Администратор магазина, может добавлять товары и редактировать их описание"),
    MANAGER("Менеджер магазина, может общаться с клиентами"),
    CLIENT("Клиент магазина, может покупать товары и пользоваться дисконтом"),
    ANONYMOUS("Анонимный пользователь, может покупать товары и\\или авторизоваться");

    public String positionsLabel;

    Positions(String positionsLabel) {
        this.positionsLabel = positionsLabel;
        System.out.println("Status: " + name() + " " + positionsLabel);
    }

    public String getPositionsLabel() {
        return positionsLabel;
    }
}
