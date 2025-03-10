package fr.ynov.java.medium;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Person {
    private final String name;
    private Date birthday;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;

    public static void main(String[] args) {
        Person person1 = new Person("lilian",new Date(2000,3,2),"male",1.30f,1.1f,Nationality.FRENCH);
        person1.printPersonAttribut();
    }

    enum Nationality {
        FRENCH,AMERICAN,JAPAN,SPANISH
    }

    public Person(String name,Date birthday, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public Void printPersonAttribut() {
        System.out.println("Name: " + name + "\nAge: " + Getage() + "\nGender: " + gender +"\nHeight: " + height + "\nWeight: " + weight + "\nNationality: " + nationality);
        return null;
    }

    public int Getage() {
        return LocalDate.now().getYear()-birthday.getYear();
    }
}
