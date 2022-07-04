package part3;

public class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone(123564364, "Sumsung", 101.5);
        Phone p2 = new Phone(321543545, "Redmi", 102.5);
        Phone p3 = new Phone(345656565, "LG", 103.5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.receiveCall("Grenor");
        p1.getNumber(32443656);
        p2.receiveCall("Petro");
        p2.getNumber(25346345);
        p3.receiveCall("Sveta");
        p3.getNumber(23434656);
    }
}
