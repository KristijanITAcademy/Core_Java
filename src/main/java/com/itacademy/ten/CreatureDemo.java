package com.itacademy.ten;

import com.itacademy.ten.animal.*;
import com.itacademy.ten.human.Employee;
import com.itacademy.ten.human.Student;

import java.nio.channels.ScatteringByteChannel;
import java.time.LocalDate;

/**
 * SOLID  principi
 *  - single responsibility
 *  - open/close
 *  - liskov substition
 *  - inversion of control
 *  -dependency Inversion
 *
 *  O - open Close principle. Kaa smo jednom dizajnirali klasu ona je zarvorena for modification
 *  Open for extension
 */
public class CreatureDemo {
    public static void main(String[] args) {

        Student student = new Student("Kristijan", "Birkid", LocalDate.now(), "14455254452");
        Dog dog = new Dog("Lesi");
        Cat cat = new Cat("cccat");
        student.setAnimal(dog);
        student.setAnimal(cat);
        student.setAnimal(new Hamster("hrcko"));
        student.setAnimal(new Fish("Fisko"));
        student.setAnimal(new Sheep("Ranka"));


        Employee employee = new Employee("Ante","Antic",LocalDate.now(),2200);
        employee.setAnimal(new Cat("Maca"));
    }
}
