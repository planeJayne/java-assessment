package org.humanity.client;


import org.humanity.Food;
import org.humanity.Person;
import org.humanity.VegetarianException;

import java.time.LocalDate;

public class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jay", LocalDate.of(1966, 12, 5));
        Person p2 = new Person("Kathryn", LocalDate.of(1977, 7, 26), true);
        Person p3 = new Person("Craig", LocalDate.of(1950, 11, 15));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.eat();

        System.out.println(p3.getName() + " is " + p3.getAge()+ " years old.");

//        p1.eat(Food.CHICKEN);

        try {
            p2.eat(Food.CHICKEN);
            p2.eat(Food.SALAD);
        } catch (VegetarianException e) {
            System.out.println("Vegetarian exception caught " + e.getMessage());
        }
    }

}