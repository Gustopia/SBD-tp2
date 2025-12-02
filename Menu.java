import perfilUtilizador.Gerente;
import perfilUtilizador.Rececionista;
import perfilUtilizador.Tutor;
import perfilUtilizador.Veterinario;
import util.ReadIntInput;

public class Menu {
    private static boolean running = true;

    public static void main(String[] args) {
        while (running) {
            showMainMenu();
        }
        System.out.println("Sistema encerrado. Até logo!");
    }

    private static void showMainMenu() {
        System.out.println("\n=== SISTEMA VETERINÁRIO ===");
        System.out.println("1. Rececionista");
        System.out.println("2. Veterinário");
        System.out.println("3. Tutor");
        System.out.println("4. Gerente");
        System.out.println("0. Sair");
        System.out.print("Selecione uma opção: ");

        int choice = ReadIntInput.readIntInput();

        switch (choice) {
            case 1:
                Rececionista.menuRececionista();
                break;
            case 2:
                Veterinario.menuVeterinario();
                break;
            case 3:
                Tutor.menuTutor();
                break;
            case 4:
                Gerente.menuGerente();
                break;
            case 0:
                running = false;
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }
}