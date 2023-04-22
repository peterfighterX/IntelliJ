import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek:");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Nie możesz kupić alkoholu");
        } else if (age > 18) {
            System.out.println("Dziękuję za zakupy, zapraszam ponownie");
        }
    }
}
