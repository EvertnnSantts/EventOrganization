package models;
import java.util.Scanner;

//import das funcionalidade:
import models.CadastroEventos;

// O "MenuGeral" será responsavel por gerenciar os menus necessarios da aplicação;"
public class MenuGeral {
    private static Scanner scanner = new Scanner(System.in);

    public void MenuInicial() {
        // Menu inicial da aplicação
        System.out.println("");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("=================== BEM VINDO AO EVENTORGANIZATION ==================");
        System.out.println("=============================== MENU ================================");
        System.out.println("=====================================================================");
        System.out.println("======================== 1 = ARÉA DE CLIENTES =======================");
        System.out.println("======================== 2 = ARÉA DE EVENTOS  =======================");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("OBS: ESCOLHA O NÚMERO DA OPÇÃO DESEJADA :)");

        // Usuário será direcionado de acordo com sua escolha.
        String opcao = scanner.nextLine();
        switch (opcao) {
            case "1":
                MenuClientes(); // O usuario deve ser direcionado para "ARÉA DE CLIENTES".
                break;
            case "2":
                MenuEventos(); // O usuario deve ser direcionado para "ARÉA DE EVENTOS".
                break;
            default:
                System.out.println("Opção inválida!");
                MenuInicial(); // Caso o usuario venha não seguir as regras, aplicação vai reniciar o "MenuInicial".
                break;
        }
    }

    // Menu da area de clientes
    public void MenuClientes() {
        System.out.println("");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("========================== ARÉA DE CLIENTES =========================");
        System.out.println("=============================== MENU ================================");
        System.out.println("====================== 1 = CADASTRAR CLIENTES =======================");
        System.out.println("====================== 2 = LISTAS DE CLIENTES =======================");
        System.out.println("====================== 3 = VOLTAR PARA O INICIO =====================");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("OBS: ESCOLHA O NÚMERO DA OPÇÃO DESEJADA :)");

        // Usuário será direcionado de acordo com sua escolha
        String opcao = scanner.nextLine();
        switch (opcao) {
            case "1":
                System.out.println("Ops, funcionalidade em desenvolvimento :("); // O usuario deve ser direcionado para "CADASTRAR CLIENTES".
                break;

            case "2":
                System.out.println("Ops, funcionalidade em desenvolvimento :("); // O usuario deve ser direcionado para "LISTAS DE CLIENTES".
                break;

            case "3":
                MenuInicial(); // O usuario deve ser direcionado para "MENU INICIAL".
                break;

            default:
                System.out.println("Ops, não entendi :(");
                System.out.println("Tente novamente!");
                MenuClientes(); // Caso o usuario venha não seguir as regras o sistema vai reniciar o "MenuClientes".
                break;
        }
    }

    // Menu da area de eventos
    public void MenuEventos() {
        System.out.println("");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("========================== ARÉA DE EVENTOS ==========================");
        System.out.println("=============================== MENU ================================");
        System.out.println("====================== 1 = EVENTOS CADASTRADOS ======================");
        System.out.println("====================== 2 = LISTAS DE PARTICIPANTES ==================");
        System.out.println("====================== 3 = EVENTOS EM ANDAMENTO =====================");
        System.out.println("====================== 4 = CANCELAMENTOS DE PARTICIPAÇÃO ============");
        System.out.println("====================== 5 = VOLTAR PARA O INICIO =====================");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("OBS: ESCOLHA O NÚMERO DA OPÇÃO DESEJADA :)");

        // Usuário será direcionado de acordo com sua escolha.
        String opcao = scanner.nextLine();
        switch (opcao) {
            case "1":
                CadastroEventos cadastroEventos = new CadastroEventos();  
                cadastroEventos.CadastroEventos(); // O usuario deve ser direcionado para "EVENTOS CADASTRADOS".
                break;

            case "2":
                System.out.println("Ops, funcionalidade em desenvolvimento :("); // O usuario deve ser direcionado para "LISTAS DE PARTICIPANTES".
                break;

            case "3":
                System.out.println("Ops, funcionalidade em desenvolvimento :("); // O usuario deve ser direcionado para " EVENTOS EM ANDAMENTO".
                break;

            case "4":
                System.out.println("Ops, funcionalidade em desenvolvimento :("); // O usuario deve ser direcionado para "CANCELAMENTOS DE PARTICIPAÇÃO".
            break;

            case "5":
                MenuInicial(); // O usuario deve ser direcionado para "MENU INICIAL".
                break;

            default:
                System.out.println("Ops, não entendi :(");
                System.out.println("Tente novamente!");
                MenuEventos(); // Caso o usuario venha não seguir as regras, o sistema vai reniciar o "MenuEventos".
                break;
        }
    }

    // Aqui é necessario uma revisão:
    public static void main(String[] args) {
        MenuGeral menuGeral = new MenuGeral();
        menuGeral.MenuInicial();
        scanner.close();
    }

    //exibição do menuEventos em outros arquivos
    public class MenuEventos {
    public void exibirMenu() {
    }
}
}
