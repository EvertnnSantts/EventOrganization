package models;

import java.util.Scanner;

public class CadastroEventos {

//Obs: Coloque o cadastro de eventos somente em um lugar!
//Para deixar mas organizado o codigo exemplo em cada funcionalidade é necessario so um arquivo no caso "CadastroEventos"
//Também é necesario que cada bloco de comando seja comentado dessa forma facilitado o entedimento dos outro intregrentes
  
 Scanner entrada = new Scanner(System.in);

 public static short usuarioChato = 0; 

 /* Inserir o nome */
 public String inserirNome(String nome) {
  String nomeEvento = nome;

  /*
   * Mostra um erro caso o usuário não inserir nada e caso o usuário insira um
   * nome menor que 3 caracteres.
   */
  if (nomeEvento.isEmpty() && usuarioChato < 1) {
      System.out.println("\nX Erro: O nome do evento está vazio.");
    } else if (nomeEvento.length() < 2 && usuarioChato < 1) {
      System.out.println("\nX Erro: Nome do evento não deve possuir apenas um caractere.");
   usuarioChato = 1;
    } else if (nomeEvento.length() < 3 && usuarioChato == 1) {
       System.out.println("\nX ...Muito menos dois, seu malandro!");
   usuarioChato = 0;
    } else if (nomeEvento.length() < 3 && usuarioChato < 2) {
       System.out.println("\nX Erro: Nome do evento não deve possuir apenas dois caracteres.");
   usuarioChato = 2;
    } else if (nomeEvento.length() < 3 && usuarioChato == 2) {
        System.out.println("\nX Pare de ser teimoso(a)!");
  }

  return nomeEvento;
 }

 /* Inserir o endereco */
 public String inserirEnderecoPais(String endereco) {
  String pais = endereco;

  if (pais.isEmpty()) {
   System.out.println("\nX Erro: Nome do país está em branco.");
  } else if ((pais.isEmpty() || pais.length() < 3) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
   usuarioChato = 4;
  } else if (pais.length() < 3) {
   System.out.println("\nX Erro: Nome do país não deve ser menor que três caracteres.");
  }

  return pais;
 }

 public String inserirEnderecoEstado(String endereco) {
  String estado = endereco;

  if (estado.isEmpty()) {
   System.out.println("\nX Erro: Nome do estado está em branco");
  } else if ((estado.isEmpty() || estado.length() < 3) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
  } else if (estado.length() < 3) {
   System.out.println("\nX Erro: Nome do estado deve estar em extenso.");
  }

  return estado;
 }

 public String inserirEnderecoCEP(String endereco) {
  String cep = endereco;

  if (cep.isEmpty()) {
   System.out.println("\nX Erro: CEP está vazio.");
  } else if ((cep.isEmpty() || cep.length() < 9) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
  } else if (cep.length() < 9) {
   System.out.println("\nX Erro: O CEP deve estar escrito neste formato: 12345-678.");
  } else if (cep.length() > 9) {
   System.out.println("\nX Erro: Número do CEP inválido.");
  }

  return cep;
 }

 public String inserirEnderecoComplemento(String endereco) {
  String complemento = endereco;

  if (complemento.isEmpty()) {
   System.out.println("\nX Erro: Complemento está em branco.");
  } else if ((complemento.isEmpty() || complemento.length() < 3) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
  } else if (complemento.length() < 3) {
   System.out.println("\nX Erro: Complemento não deve ter menos que três caracteres.");
  }

  return complemento;
 }

 public String inserirEnderecoNumero(String endereco) {
  String numero = endereco;

  if (numero.isEmpty()) {
   System.out.println("\nX Erro: Número do complemento está em branco.");
  } else if ((numero.isEmpty() || numero.length() < 3) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
  } else if (numero.length() < 3) {
   System.out.println("\nX Erro: Número do complemento não deve ser menor que três caracteres.");
  }

  return numero;
 }
 public String inserirEnderecoRua(String endereco) {
  String rua = endereco;

  if (rua.isEmpty()) {
   System.out.println("\nX Erro: Nome da rua está vazio.");
  } else if ((rua.isEmpty() || rua.length() < 10) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
  } else if (rua.length() < 10) {
   System.out.println("\nX Erro: Nome da rua muito curto");
  }

  return rua;
 }

 /* Inserir categoria */
 public String inserirCategoria(String categoria) {
  String nomeCategoria = categoria;

  if (nomeCategoria.isEmpty()) {
   System.out.println("\nX Erro: Categoria está vazio.");
  } else if ((nomeCategoria.isEmpty() || nomeCategoria.length() < 10) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
  } else if (nomeCategoria.length() < 10) {
   System.out.println("\nX Erro: Categoria não deve ser menor que 3 caracteres.");
  }

  return nomeCategoria;
 }

 /* Inserir horário */
 public String inserirHorario(String horario) {
  String hora = horario;

  if (hora.isEmpty()) {
   System.out.println("\nX Erro: Horário está vazio.");
  } else if ((hora.isEmpty() || hora.length() < 10) && usuarioChato >= 1) {
   System.out.println("\nX Pare com isso.");
  } else if (hora.length() < 5) {
   System.out.println("\nX Erro: Horário incompleto.");
  }

  return hora;
 }

 /* Inserir descrição */
 public String inserirDescricao(String descricao) {
  return descricao;
 }
}
