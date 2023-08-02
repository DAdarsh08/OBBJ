package com.SBI;

import com.SBI.utilities.Validations;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    Gender gender;
    String address;

    public Person(String name, int age, Gender gender, String address) throws InvalidAgeException {
        Validations.validateAge(age);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person() throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the age");
        age = Integer.parseInt(sc.nextLine());
        Validations.validateAge(age);
        System.out.println("enter the Gender");
        gender = Gender.valueOf(sc.nextLine());
        System.out.println("enter the Address");
        address = sc.nextLine();
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
