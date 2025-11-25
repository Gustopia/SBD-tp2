public class Gerente {
    public static void menuGerente() {
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

            int choice = ReadIntInput.readIntInput();

            switch (choice) {
                case 1:
                    System.out.println("\n>>> Executando: Criar/Atualizar dados dos médicos veterinários, tutores e respetivos animais");
                    criarAtualizar();
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Atualizar horário com supervisão de veterinários");
                    atualizarHorario();
                    break;
                case 3:
                    System.out.println("\n>>> Executando: Exportar ficha e histórico clínicos para XML/JSON");
                    exportarFicha();
                    break;
                case 4:
                    System.out.println("\n>>> Executando: Importar ficha e histórico clínicos de XML/JSON");
                    importarFicha();
                    break;
                case 5:
                    System.out.println("\n>>> Executando: Lista de animais que ultrapassaram a expectativa de vida");
                    listaAnimais();
                    break;
                case 6:
                    System.out.println("\n>>> Executando: Lista de tutores com animais com excesso de peso");
                    listaTutores();
                    break;
                case 7:
                    System.out.println("\n>>> Executando: Tutores com mais agendamentos cancelados no último trimestre");
                    agendamentosCancelados();
                    break;
                case 8:
                    System.out.println("\n>>> Executando: Quantidade de agendamentos por serviço na próxima semana");
                    numAgendametos();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

     // 4.1
    private static void criarAtualizar(){
    }
    
    // 4.2
     private static void atualizarHorario(){
    }

    // 4.3
     private static void exportarFicha(){
    }
    
    // 4.4
     private static void importarFicha(){
    }
    
    // 4.5
     private static void listaAnimais(){
    }
    
    // 4.6
     private static void listaTutores(){
    }

    // 4.7
     private static void agendamentosCancelados(){
    }

    // 4.8
     private static void numAgendametos(){
    }
}
