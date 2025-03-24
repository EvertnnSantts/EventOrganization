package models;

import java.util.Scanner;

//Obs: A versão passada esteva funcionado de formma individual: os arquivos "listagem.java", "Usuario.java"
//Devido a isso foi necesserio ser reformulado. A versão a baixo é só um teste
//Aréa responsavel por: João
public class CadastroClientes {
    public void cadastrarCliente() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Cliente " + nome + " cadastrado com sucesso!");
        scanner.close();
    }
}
