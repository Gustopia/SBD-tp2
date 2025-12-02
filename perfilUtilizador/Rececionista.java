package perfilUtilizador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import jdbc.DBConfig;

import util.ReadIntInput;

public class Rececionista {    
        public static void menuRececionista() {
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
                    criarAtualizar();
                    break;
                case 2:
                    System.out.println("\n>>> Executando: Agendar/Cancelar/Reagendar a prestação de serviços veterinários para um determinado animal");
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

    // 1.1
    private static void criarAtualizar() {
    boolean back = false;
    while (!back) {
        System.out.println("\n--- GESTÃO DE CLIENTES E ANIMAIS ---");
        System.out.println("1. Criar Cliente");
        System.out.println("2. Atualizar Cliente");
        System.out.println("3. Criar Animal");
        System.out.println("4. Atualizar Animal");
        System.out.println("0. Voltar");
        System.out.print("Opção: ");

        int op = ReadIntInput.readIntInput();

        switch (op) {
            case 1 -> criarCliente();
            case 2 -> atualizarCliente();
            case 3 -> criarAnimal();
            case 4 -> atualizarAnimal();
            case 0 -> back = true;
            default -> System.out.println("Opção inválida.");
        }
    }
}
private static void criarCliente() {
    Scanner sc = new Scanner(System.in);

    try (Connection con = DBConfig.conectar()) {

        System.out.print("NIF: ");
        String nif = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Morada: ");
        String morada = sc.nextLine();

        System.out.print("Contactos: ");
        String contactos = sc.nextLine();

        System.out.print("Tipo de cliente (Pessoa/Empresa): ");
        String tipo = sc.nextLine();

        Double capital = null;
        if (tipo.equals("Empresa")) {
            System.out.print("Capital Social: ");
            capital = Double.parseDouble(sc.nextLine());
        }

        System.out.print("Preferência Linguística: ");
        String pref = sc.nextLine();

        String sql = "INSERT INTO Cliente VALUES (?,?,?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, nif);
        pst.setString(2, nome);
        pst.setString(3, morada);
        pst.setString(4, contactos);
        pst.setString(5, tipo);

        if (capital != null)
            pst.setDouble(6, capital);
        else
            pst.setNull(6, java.sql.Types.NUMERIC);

        pst.setString(7, pref);

        pst.executeUpdate();

        System.out.println("✔ Cliente criado com sucesso!");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}private static void atualizarCliente() {
    Scanner sc = new Scanner(System.in);

    try (Connection con = DBConfig.conectar()) {

        System.out.print("NIF do cliente a atualizar: ");
        String nif = sc.nextLine();

        System.out.print("Novo nome: ");
        String nome = sc.nextLine();

        System.out.print("Nova morada: ");
        String morada = sc.nextLine();

        System.out.print("Novos contactos: ");
        String contactos = sc.nextLine();

        System.out.print("Novo tipo (Pessoa/Empresa): ");
        String tipo = sc.nextLine();

        Double capital = null;
        if (tipo.equals("Empresa")) {
            System.out.print("Capital Social: ");
            capital = Double.parseDouble(sc.nextLine());
        }

        System.out.print("Nova preferência linguística: ");
        String pref = sc.nextLine();

        String sql = """
            UPDATE Cliente
            SET nomeCliente=?, moradaCliente=?, contactos=?, tipoCliente=?, capitalSocial=?, prefLinguistica=?
            WHERE nif=?
        """;

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, nome);
        pst.setString(2, morada);
        pst.setString(3, contactos);
        pst.setString(4, tipo);

        if (capital != null)
            pst.setDouble(5, capital);
        else
            pst.setNull(5, java.sql.Types.NUMERIC);

        pst.setString(6, pref);
        pst.setString(7, nif);

        pst.executeUpdate();

        System.out.println("✔ Cliente atualizado!");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
private static void criarAnimal() {
    Scanner sc = new Scanner(System.in);

    try (Connection con = DBConfig.conectar()) {

        System.out.print("ID do Animal: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("NIF do Tutor: ");
        String nif = sc.nextLine();

        System.out.print("Nome do animal: ");
        String nome = sc.nextLine();

        System.out.print("ID da raça: ");
        int idRaca = Integer.parseInt(sc.nextLine());

        System.out.print("Sexo (M/F): ");
        String sexo = sc.nextLine();

        System.out.print("Data nascimento (YYYY-MM-DD): ");
        String data = sc.nextLine();

        System.out.print("Filiacao: ");
        String filiacao = sc.nextLine();

        System.out.print("Estado reprodutivo: ");
        String estado = sc.nextLine();

        System.out.print("Alergias: ");
        String alergias = sc.nextLine();

        System.out.print("Cores: ");
        String cores = sc.nextLine();

        System.out.print("Fotografia (caminho): ");
        String foto = sc.nextLine();

        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.print("Características distintas: ");
        String car = sc.nextLine();

        System.out.print("Nº Microchip: ");
        String chip = sc.nextLine();

        String sql = """
            INSERT INTO Animal
            VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)
        """;

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, id);
        pst.setString(2, nif);
        pst.setString(3, nome);
        pst.setInt(4, idRaca);
        pst.setString(5, sexo);
        pst.setDate(6, java.sql.Date.valueOf(data));
        pst.setString(7, filiacao);
        pst.setString(8, estado);
        pst.setString(9, alergias);
        pst.setString(10, cores);
        pst.setString(11, foto);
        pst.setDouble(12, peso);
        pst.setString(13, car);
        pst.setString(14, chip);

        pst.executeUpdate();

        System.out.println("✔ Animal criado com sucesso!");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
private static void atualizarAnimal() {
    Scanner sc = new Scanner(System.in);

    try (Connection con = DBConfig.conectar()) {

        System.out.print("ID do animal: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Novo nome: ");
        String nome = sc.nextLine();

        System.out.print("Nova fotografia (caminho): ");
        String foto = sc.nextLine();

        System.out.print("Novo peso: ");
        double peso = Double.parseDouble(sc.nextLine());

        String sql = """
            UPDATE Animal
            SET nomeAnimal=?, fotografia=?, peso=?
            WHERE idAnimal=?
        """;

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, nome);
        pst.setString(2, foto);
        pst.setDouble(3, peso);
        pst.setInt(4, id);

        pst.executeUpdate();

        System.out.println("✔ Animal atualizado!");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}



    // 1.2
    private static void agendarCancelar(){
    }
}