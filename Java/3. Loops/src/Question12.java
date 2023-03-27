import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gender = sc.next();

        switch (gender) {
            case "M" -> System.out.println("Male");
            case "F" -> System.out.println("Female");
            default -> System.out.println("Unknown gender");
        }
    }
}
