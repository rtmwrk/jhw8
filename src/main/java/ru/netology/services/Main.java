package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();                 // Создаем переменную - ссылку на объект "Post"
        post.name = "Иван";                     // Передаем в объект имя заказчика
        post.surname = "Иванов";                // Передаем в объект фамилию заказчика
        post.patronymic = "Иванович";           // Передаем отчество
        post.passport = "4444 № 44444444";      // Передаем серию и номер паспорта
        post.phone = "+7 (999)-999-99-99";      // Передаем номер телефона
        post.subscription = true;               // Выставляем признак - согласия на получение новостей

        post.birthday = new FormDate();         // Создаем ссылку на объект "FormDate"
        post.birthday.day = 13;                 // Передаем в объект день рождения
        post.birthday.month = 6;                // передаем в объект месяц рождения
        post.birthday.year = 1999;              // Передаем в объект год рождения

    }
}