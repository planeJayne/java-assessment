package org.humanity;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    //fields
    String name;
    LocalDate birthDate;
    boolean isVegetarian;


    //constructor
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(String name, LocalDate birthDate, Boolean isVegetarian) {
        this.name = name;
        this.birthDate = birthDate;
        this.isVegetarian = isVegetarian;
    }

    //getters
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(getName() + " is eating their favorite food.");
    }

    public void eat(Food favoriteFood) throws VegetarianException {
        if (isVegetarian == true && (favoriteFood == Food.CHICKEN || favoriteFood == Food.FISH)) {
            throw new VegetarianException("You are a vegetarian, please select a vegetarian favorite food.");
        } else {
            System.out.println(getName() + " is eating " + favoriteFood.toString().toLowerCase());
        }
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }


    public Boolean getVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Name: " + name + " BirthDate: " + birthDate + " isVegetarian: " + isVegetarian;
    }
}