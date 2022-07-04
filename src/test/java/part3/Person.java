package part3;
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










//    String name = "Grenor";
//    int age = 32;
//
//    public void move() {
//        System.out.println("Person move");
//    }
//
//    public void talk() {
//        System.out.println("Person talk");
//    }
//
//    public Person() {
//
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//
//        Person person1 = new Person();
//
//        Person person2 = new Person(Grenor , 32);
//
//    }
//}


    //    public static void main(String[] args) {
//        part3.Person Grenor = new Person(Grenor, 32);
//    }
//
//    static class Person {
//        private String name;
//        private int age;
//
//        public person1(Object grenor, int i) {
//            System.out.println("Person move");
//        }
//
//        static class person2 {
//            private String name;
//            private int age;
//
//            public person2() {
//                System.out.println("Person talk");
//            }
//
//            public person2(Object grenor, int i) {

//            }
            //    String name = "Grenor";
            //    int age = 32;
            //    double weight = 69;

//        void move() {
//            System.out.println("Person рухається");
//        }
//
//        void talk() {
//            System.out.println("Person говорить");
//        }
//    }
//}
