//package Big_Homework.part3;
////3.3
////Читачі бібліотеки
////  а) Визначити клас Reader, який зберігає таку інформацію про користувача бібліотеки: ПІБ, номер квитка читача, телефон.
////
////  б) Додати методи takeBooks(), returnBooks().
////
////  - takeBooks() прийматиме два параметри: кількість книг, які вже взяв читач, і кількість книг, які бере читач зараз.
////  Цей метод буде виводити запис у форматі. "Читач Петров взяв сьогодні n книг.
////  Загалом читач взяв "загальна сумма" книг." Опрацювати кейс, коли читач взяв більше ніж 5 книг.
////  За це нарахувати штраф (кожна книжка, яка перевищує ліміт = 50 грн).
////  В даному випадку вивести в консоль повідомлення з текстом "Ліміт перевищенний. Сума штрафу = n грн"
////
////  -returnBooks() прийматиме два параметри: кількість книг, які вже взяв читач,
////  і кількість книг, які повертає читач зараз.
////  Цей метод буде виводити в консоль запис у форматі. "Читач Петров повернув сьогодні книг.
////  Загалом в читача залишається  загальна сумма книг."
////  Опрацювати кейс, коли в читача було (тобто перед повернення) більше 5 книг і нарахувати за це
////  штраф як і в першому випадку, але також нарахувати майбутній штраф, якщо після повернення в
////  читача залишиться більше 5 книг і вивести про це попередження в консоль.
//public class Library {
//    String name = "Grenor";
//    int ticket = 431;
//    String phone = "+380681944978";
//    String penalty;
//
//
//    public void takeBooks(int allBooks, int nowBooks) {
//        System.out.println("Reader " + name + " took today " + nowBooks + " In general, the reader took " + allBooks + " books.");
//        for (int i = 0; i <=5; i++) {
//
//        if (nowBooks>5){
//            System.out.println("Over-limit " + penalty);
//        }
//    }
//    public void returnBooks(int allBooks, int nowReturnBooks) {
//        System.out.println("Reader " + name + " returned today " + nowReturnBooks + "books. " +
//                "In general, remains in the reader " + allBooks + " books.");
//
//    }
//}