package part2;

public class ReplaceAll {
    public static void main(String[] args) {
        String test = "Hello Grenor";
        System.out.println(test.replaceAll("[ ]",""));
        System.out.println(test.replaceAll("[eo]",""));
        System.out.println(test.replaceAll("[HlGrn]",""));
    }
}
