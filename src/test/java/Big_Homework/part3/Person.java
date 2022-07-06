package Big_Homework.part3;
//    Клас Person
//    a) поля fullName, age.
//    б) методи move() і talk(), у яких просто виводить в консоль повідомлення -"Person рухається" i "Person говорить".
//    в) Додайте два конструктори - Person() та Person(fullName, age).
//    Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person(), інший – Person (fullName, age).

public class Person {
    String name = "Grenor";
    int age = 32;

    public void move() {
        System.out.println("Person move");
    }

    public void talk(){
        System.out.println("Person talk");
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Grenor", 35);
        person1.move();
        person2.talk();
    }
}