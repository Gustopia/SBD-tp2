public class Rececionista {    
        private static void menuRececionista() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n--- MENU RECECIONISTA ---");
            System.out.println("1. Criar/Atualizar dados dos tutores e dos respetivos animais incluindo fotografia");
            System.out.println("2. Agendar/Cancelar/Reagendar a prestação de serviços veterinários para um determinado animal");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Selecione uma opção: ");

            int choice = ReadIntInput.readIntInput();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> Executando: Criar/Atualizar dados dos tutores e dos respetivos animais incluindo fotografia");
                    // Implementar funcionalidade 1.1 aqui
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Agendar/Cancelar/Reagendar a prestação de serviços veterinários para um determinado animal");
                    // Implementar funcionalidade 1.2 aqui
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
