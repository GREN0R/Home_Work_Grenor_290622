package part3;

public class Libroury {
    String name = "Grenor";
    int ticket = 431;
    String phone = "+380681944978";

    public void takeBooks(int allBooks, int nowBooks) {
        System.out.println("Читач " + name + " взяв сьогодні " + nowBooks + " Загалом читач взяв " + allBooks + " книг.");
    }
    public void returnBooks(int allBooks, int nowReturnBooks){
        System.out.println("Читач " + name + " повернув сьогодні " + nowReturnBooks + "книг. " +
                "Загалом в читача залишається " + allBooks + " книг.");

    }
}
