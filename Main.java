import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Угадайте число от 1 до 100");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите число: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Некорректный ввод. Завершение.");
                    return;
                }

                int guess = scanner.nextInt();
                attempts++;

                if (guess < secret) {
                    System.out.println("Слишком мало");
                } else if (guess > secret) {
                    System.out.println("Слишком много");
                } else {
                    System.out.println("Вы угадали!");
                    System.out.println("Количество попыток: " + attempts);
                    break;
                }
            }
        }
    }
}
