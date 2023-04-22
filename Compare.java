import java.util.Scanner;
public class Compare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę ");
        int secondNumber = scanner.nextInt();

        boolean result = firstNumber > secondNumber;

        System.out.println(result);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
    }
}
