package pl.sda.intermediate;

import java.math.BigDecimal;

public class Customer {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private BigDecimal salary;
    private static Integer counter = 1;

    {
        this.id = counter++;        //blok inicjalizujacy
    }
    public Customer(String name, String surname, Integer age, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
    }

    public Customer(String name, String surname, int age, String salary) {
        this(name,surname,age,Integer.parseInt(salary));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
