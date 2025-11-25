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
}
