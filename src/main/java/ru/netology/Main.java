package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate formDate = new FormDate();

        post.name = "Иван";
        post.passport = "1234 №123456";
        post.patronymic = "Иванович";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;
    }
}