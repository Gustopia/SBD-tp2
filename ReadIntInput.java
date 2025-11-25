import java.util.Scanner;

public class ReadIntInput {
     private static final Scanner scanner = new Scanner(System.in);
        public static int readIntInput() {
            while (true) {
                String line = scanner.nextLine();
                try {
                    return Integer.parseInt(line.trim());
                } catch (NumberFormatException e) {
                    System.out.print("Input inválido. Por favor, insira um número: ");
                }
            }
        }
}
