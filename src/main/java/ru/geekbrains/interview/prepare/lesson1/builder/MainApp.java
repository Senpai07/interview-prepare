package ru.geekbrains.interview.prepare.lesson1.builder;

public class MainApp {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .setFirstName("Александр")
                .setMiddleName("Сергеевич")
                .setLastName("Пушкин")
                .setCountry("Россия")
                .setAddress("Москва")
                .setPhone("84953456712")
                .setAge(34)
                .setGender("M")
                .build();

        System.out.println(myPerson);
    }
}
