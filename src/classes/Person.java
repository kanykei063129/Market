package classes;

import java.math.BigDecimal;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private BigDecimal money;
    private String pasword;
    private List<String> count;

    public Person(String name, int age, BigDecimal money, String pasword, List<String> count) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.pasword = pasword;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public List<String> getCount() {
        return count;
    }

    public void setCount(List<String> count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", pasword='" + pasword + '\'' +
                ", count=" + count +
                "\n----------------------\n";
    }
}


