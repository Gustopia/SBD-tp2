import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
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

        int choice = readIntInput();

        switch (choice) {
            case 1:
                menuRececionista();
                break;
            case 2:
                menuVeterinario();
                break;
            case 3:
                menuTutor();
                break;
            case 4:
                menuGerente();
                break;
            case 0:
                running = false;
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }



    private static void menuVeterinario() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n--- MENU VETERINÁRIO ---");
            System.out.println("1. Implementar controlo autocomplete para encontrar fichas de animais");
            System.out.println("2. Consultar registo clínico de um animal com idade e escalão etário");
            System.out.println("3. Visualizar árvore genealógica de um animal");
            System.out.println("4. Lista de chamada dos animais com agendamento");
            System.out.println("5. Atualizar histórico clínico do animal");
            System.out.println("6. Agendar/Cancelar serviços veterinários");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Selecione uma opção: ");

            int choice = readIntInput();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> Executando: Implementar controlo autocomplete para encontrar fichas de animais");
                    // Implementar funcionalidade 2.1 aqui
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Consultar registo clínico de um animal com idade e escalão etário");
                    // Implementar funcionalidade 2.2 aqui
                    break;
                case 3:
                    System.out.println("\n>>> Executando: Visualizar árvore genealógica de um animal");
                    // Implementar funcionalidade 2.3 aqui
                    break;
                case 4:
                    System.out.println("\n>>> Executando: Lista de chamada dos animais com agendamento");
                    // Implementar funcionalidade 2.4 aqui
                    break;
                case 5:
                    System.out.println("\n>>> Executando: Atualizar histórico clínico do animal");
                    // Implementar funcionalidade 2.5 aqui
                    break;
                case 6:
                    System.out.println("\n>>> Executando: Agendar/Cancelar serviços veterinários");
                    // Implementar funcionalidade 2.6 aqui
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void menuTutor() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n--- MENU TUTOR ---");
            System.out.println("1. Consultar ficha e histórico clínicos dos animais incluindo serviços agendados");
            System.out.println("2. Agendar/Reagendar/Rejeitar consultas para animais com ficha clínica");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Selecione uma opção: ");

            int choice = readIntInput();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> Executando: Consultar ficha e histórico clínicos dos animais incluindo serviços agendados");
                    // Implementar funcionalidade 3.1 aqui
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Agendar/Reagendar/Rejeitar consultas para animais com ficha clínica");
                    // Implementar funcionalidade 3.2 aqui
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void menuGerente() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n--- MENU GERENTE ---");
            System.out.println("1. Criar/Atualizar dados dos médicos veterinários, tutores e respetivos animais");
            System.out.println("2. Atualizar horário com supervisão de veterinários");
            System.out.println("3. Exportar ficha e histórico clínicos para XML/JSON");
            System.out.println("4. Importar ficha e histórico clínicos de XML/JSON");
            System.out.println("5. Lista de animais que ultrapassaram a expectativa de vida");
            System.out.println("6. Lista de tutores com animais com excesso de peso");
            System.out.println("7. Tutores com mais agendamentos cancelados no último trimestre");
            System.out.println("8. Quantidade de agendamentos por serviço na próxima semana");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Selecione uma opção: ");

            int choice = readIntInput();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> Executando: Criar/Atualizar dados dos médicos veterinários, tutores e respetivos animais");
                    // Implementar funcionalidade 4.1 aqui
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Atualizar horário com supervisão de veterinários");
                    // Implementar funcionalidade 4.2 aqui
                    break;
                case 3:
                    System.out.println("\n>>> Executando: Exportar ficha e histórico clínicos para XML/JSON");
                    // Implementar funcionalidade 4.3 aqui
                    break;
                case 4:
                    System.out.println("\n>>> Executando: Importar ficha e histórico clínicos de XML/JSON");
                    // Implementar funcionalidade 4.4 aqui
                    break;
                case 5:
                    System.out.println("\n>>> Executando: Lista de animais que ultrapassaram a expectativa de vida");
                    // Implementar funcionalidade 4.5 aqui
                    break;
                case 6:
                    System.out.println("\n>>> Executando: Lista de tutores com animais com excesso de peso");
                    // Implementar funcionalidade 4.6 aqui
                    break;
                case 7:
                    System.out.println("\n>>> Executando: Tutores com mais agendamentos cancelados no último trimestre");
                    // Implementar funcionalidade 4.7 aqui
                    break;
                case 8:
                    System.out.println("\n>>> Executando: Quantidade de agendamentos por serviço na próxima semana");
                    // Implementar funcionalidade 4.8 aqui
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static int readIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Por favor, insira um número: ");
            }
        }
    }