package Big_Homework.part2;
//частина2
//        Робота зі строками
//        1. вивести строку без голосних
//        2. Вивести строку без приголосних
//        3. Вивести речення без пробілів
public class ReplaceAll {
    public static void main(String[] args) {
        String test = "Hello Grenor";
        System.out.println(test.replaceAll("[eo]",""));
        System.out.println(test.replaceAll("[HlGrn]",""));
        System.out.println(test.replaceAll("[ ]",""));
    }
}