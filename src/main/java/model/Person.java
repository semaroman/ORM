package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Table(name = "persons")
@Entity
public class Person {
    @jakarta.persistence.Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false, length = 16)
    private String phone_number;

    @Column(nullable = false, length = 40)
    private String city_of_living;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phone_number + '\'' +
                ", cityOfLiving='" + city_of_living + '\'' +
                '}';
    }
}
