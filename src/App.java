import java.util.Scanner;
import Usuarios.CadastroClientes; 
//Arquivo geral da aplicação
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("================== BEM VINDO AO EVENTORGANIZATION ==================");
        System.out.println("=============================== MENU ================================");
        System.out.println("");
        System.out.println("================== 1 = ARÉA DE CLIENTES");
        System.out.println("================== 2 = ARÉA DE EVENTOS");

        System.out.println("OBS: ESCOLHA O NÚMERO DA OPÇÃO DESEJADA :)");

        String opcao = scanner.nextLine();
        switch (opcao) {

            case "1":
                CadastroClientes cadastroClientes = new CadastroClientes(); 
                cadastroClientes.cadastrarCliente();
                break;
            case "2":
                System.out.println("Ops, opção em desenvolvimento!");
                break;
            case "3":
                System.out.println("Ops, opção em desenvolvimento!");
            break;


            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}
