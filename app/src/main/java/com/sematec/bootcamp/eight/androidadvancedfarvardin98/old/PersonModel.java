package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old;

import androidx.annotation.NonNull;

public class PersonModel {

    String name;
    String family;
    int age;
    String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @NonNull
    @Override
    public String toString() {
        return "name is :" + name + " ," + "family is :" + family;
    }
}