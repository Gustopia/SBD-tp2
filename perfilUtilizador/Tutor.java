package perfilUtilizador;
import util.ReadIntInput;

public class Tutor {
     public static void menuTutor() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n--- MENU TUTOR ---");
            System.out.println("1. Consultar ficha e histórico clínicos dos animais incluindo serviços agendados");
            System.out.println("2. Agendar/Reagendar/Rejeitar consultas para animais com ficha clínica");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Selecione uma opção: ");

            int choice = ReadIntInput.readIntInput();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> Executando: Consultar ficha e histórico clínicos dos animais incluindo serviços agendados");
                    consultarFicha();
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Agendar/Reagendar/Rejeitar consultas para animais com ficha clínica");
                    agendarReagendar();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

     // 3.1
    private static void consultarFicha(){
    }

    // 3.2
    private static void agendarReagendar(){
    }
}
