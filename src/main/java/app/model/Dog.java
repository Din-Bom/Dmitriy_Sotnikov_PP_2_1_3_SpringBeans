package app.model;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog extends Animal {
    private int age;
    private String name;

    public Dog() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
