import java.util.Scanner;

import models.CadastroClientes; 
import models.CadastroEventos;
//Arquivo geral da aplicação
//Esse arquivo será um responsavél por importa todos os outro arquivos 
public class App {
    public static void main(String[] args) {
        //Menu geral da aplicação
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("=================== BEM VINDO AO EVENTORGANIZATION ==================");
        System.out.println("=============================== MENU ================================");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("");
        System.out.println("================== 1 = ARÉA DE CLIENTES");
        System.out.println("================== 2 = ARÉA DE EVENTOS");

        System.out.println("OBS: ESCOLHA O NÚMERO DA OPÇÃO DESEJADA :)");
        //Usuario será direcionado de acordo com sua escolha
        String opcao = scanner.nextLine();
        switch (opcao) {

            case "1":
                CadastroClientes cadastroClientes = new CadastroClientes(); 
                cadastroClientes.cadastrarCliente();
                break;

            case "2":
                System.out.println("Em desvolvimento....");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}
