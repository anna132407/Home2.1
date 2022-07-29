import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bet bet = new Bet();
        Exception BetException = new Exception("Не корректно введены данные из клавиатуры");
        int var = 0;
        for(;;) {
            System.out.println("Введите ставку \n");
            var = Integer.parseInt(scanner.nextLine());
            try {
                if (var <= 0)  throw BetException;
            } catch (Exception e) {
                System.out.println("Message: " + e.getMessage());
                e.printStackTrace();
            }
            System.out.println("Для завершения нажмите q. Для продолжения нажмите любую клавишу");
            Storage.stavki.add(var);
            Storage.stavki.removeIf(i -> (i == 0 || i < 0));
            String a = scanner.nextLine();
            char i = a.charAt(0);
            if (i == 'q') break;
        }
        System.out.println(Storage.stavki);

    }

}
