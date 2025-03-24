package eventos.test;

import java.util.Scanner;
import eventos.classes.CadastroEventos;

public class CadastroEventosTest {
 /*
  * "Mas Kaio, esse código tá uma bosta"
  * EU SEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEI
  */
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  CadastroEventos cadastro = new CadastroEventos();

  System.out.println("\n> Deseja cadastrar um novo evento? (S/N)");
  String continuar = entrada.nextLine();

  String confirmacao = "n";

  while (continuar.equalsIgnoreCase("s")) {
   while (confirmacao.equalsIgnoreCase("n")) {

    /* Nome do evento */
    String nomeEvento;
    do {
     System.out.println("\n> Digite o nome do evento");
     nomeEvento = entrada.nextLine();
     cadastro.inserirNome(nomeEvento);
    } while (nomeEvento.isEmpty() || nomeEvento.length() < 3);
    System.out.println("\nNome do evento: " + nomeEvento);

    /* Endereço do evento */
    String pais;
    do {
     System.out.println("\n> Insira o país de endereço do evento");
     pais = entrada.nextLine();
     cadastro.inserirEnderecoPais(pais);
    } while (pais.isEmpty() || pais.length() < 3);

    String estado;
    do {
     System.out.println("\n> Insira o estado (em extenso) de endereço do evento");
     estado = entrada.nextLine();
     cadastro.inserirEnderecoPais(estado);
    } while (estado.isEmpty() || estado.length() < 3);

    String cep;
    do {
     System.out.println("\n> Insira o CEP (Exemplo: 12345-678)");
     cep = entrada.nextLine();
     cadastro.inserirEnderecoCEP(cep);
    } while (cep.isEmpty() || cep.length() < 9);

    String complemento;
    do {
     System.out.println("\n> Insira o complemento de endereço do evento");
     complemento = entrada.nextLine();
     cadastro.inserirEnderecoComplemento(complemento);
    } while (complemento.isEmpty() || complemento.length() < 4);

    String numero;
    do {
     System.out.println("\n> Insira o número do complemento");
     numero = entrada.nextLine();
     cadastro.inserirEnderecoNumero(numero);
    } while (numero.isEmpty() || numero.length() < 3);

    String rua;
    do {
     System.out.println("\n> Insira a rua onde o evento será");
     rua = entrada.nextLine();
     cadastro.inserirEnderecoRua(rua);
    } while (rua.isEmpty() || rua.length() < 10);

    String enderecoEvento = rua + ", " + complemento + " " + numero + " (" + cep
      + "), " + estado + ", " + pais;
    System.out.println("\nEndereço completo: " + enderecoEvento);

    /* Categoria do evento */
    String categoriaEvento;
    do {
     System.out.println("\n> Insira a categoria do evento");
     categoriaEvento = entrada.nextLine();
     cadastro.inserirCategoria(categoriaEvento);
    } while (categoriaEvento.isEmpty() || categoriaEvento.length() < 3);
    System.out.println("\nCategoria: " + categoriaEvento);

    /* Horário do evento */
    String horarioEvento;
    do {
     System.out.println("\n> Insira o horário do evento (Exemplo: 23:59)");
     horarioEvento = entrada.nextLine();
     cadastro.inserirHorario(horarioEvento);
    } while (horarioEvento.isEmpty() || horarioEvento.length() < 5);
    System.out.println("\nHorário: " + horarioEvento);

    /* Descrição do evento */
    System.out.println("\n> Insira a descrição do evento.");
    String descricaoEvento = entrada.nextLine();
    cadastro.inserirDescricao(descricaoEvento);
    System.out.println("\nDescrição: " + descricaoEvento);

    /* Exibição do resultado */
    System.out.println("\n\nNome do evento: " + nomeEvento);
    System.out.println("Endereço do evento: " + enderecoEvento);
    System.out.println("Categoria: " + categoriaEvento);
    System.out.println("Horário do evento: " + horarioEvento);
    System.out.println("Descrição do evento: " + descricaoEvento);

    System.out.println("\n> Estas informações estão corretas? (S/N)");
    confirmacao = entrada.nextLine();
   }

   System.out.println("\n> Deseja cadastrar um novo evento? (S/N)");
   continuar = entrada.nextLine();
   confirmacao = "n";
  }

  entrada.close();
 }
}