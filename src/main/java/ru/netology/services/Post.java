package ru.netology.services;

// Класс - объект запроса банковской карты
public class Post {
    public String name;                 // Имя заказчика банковской карты
    public String surname;              // Фамилия заказчика
    public String patronymic;           // Отчество заказчика
    public String passport;             // Серия, номер паспорта заказчика
    public String phone;                // Номер телефона заказчика
    public Boolean subscription;        // Признак согласия заказчика на получение новостей по СМС
    public FormDate birthday;           // Поле - объект - дата рождения

    // Объект не содержим методов
}
