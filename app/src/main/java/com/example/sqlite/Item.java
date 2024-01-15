package com.example.sqlite;

public class Item {
    private String name;
    private String mail;
    private String age;

    public Item(String name, String mail, String age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getAge() {
        return age;
    }
}
