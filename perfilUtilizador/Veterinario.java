package perfilUtilizador;
import util.ReadIntInput;

public class Veterinario {
     public static void menuVeterinario() {
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

            int choice = ReadIntInput.readIntInput();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> Executando: Implementar controlo autocomplete para encontrar fichas de animais");
                    autoComplete();
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Consultar registo clínico de um animal com idade e escalão etário");
                    consultarRegistoClinico();
                    break;
                case 3:
                    System.out.println("\n>>> Executando: Visualizar árvore genealógica de um animal");
                    visualizarArvore();
                    break;
                case 4:
                    System.out.println("\n>>> Executando: Lista de chamada dos animais com agendamento");
                    listaChamada();
                    break;
                case 5:
                    System.out.println("\n>>> Executando: Atualizar histórico clínico do animal");
                    atualizarHistorico();   
                    break;
                case 6:
                    System.out.println("\n>>> Executando: Agendar/Cancelar serviços veterinários");
                    agendarCancelar();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    // 2.1
    private static void autoComplete(){
    }
    
    // 2.2
     private static void consultarRegistoClinico(){
    }

    // 2.3
     private static void listaChamada(){
    }
    
    // 2.4
     private static void visualizarArvore(){
    }
    
    // 2.5
     private static void atualizarHistorico(){
    }
    
    // 2.6
     private static void agendarCancelar(){
    }
}
