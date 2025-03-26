package models; /* Pra dizer que a classe tá na pasta models */

import java.util.Scanner; /* Importando a Scanner pra usá-la. */

public class CadastroEventos /* <- Nome da classe */ {
  static Scanner entrada = new Scanner(System.in); /* Inicializando a Scanner para uso */
  
  public static void main(String[] args) /* "Livrai-nos de todo mal, a main()." */ {
    System.out.println("\n> Deseja cadastrar um novo evento? (S/N)");
    String continuar = entrada.nextLine(); /* Confirmação pra caso o usuário tenha digitado errado. */

    String[] evento = new String[6]; /* Declaração de um array para armazenar as 6 informações do evento. */

    String confirmacao = "n"; /* Declaranto esta variável pra isso funcionar. */
    
    while (continuar.equalsIgnoreCase("s")) {
      while (confirmacao.equalsIgnoreCase("n")) {
        evento[0] = inserirNome(evento[0]); /* O método para inserir o nome é chamado no primeiro espaço do evento[]. */

        String[] enderecoEvento = new String[8]; /* Declaração de um array para armazenar as 8 informações do endereço. */

        enderecoEvento[0] = inserirEnderecoPais(enderecoEvento[0]); /* O método para inserir o país de endereço é chamado no primeiro espaço do array. */

        enderecoEvento[1] = inserirEnderecoEstado(enderecoEvento[1]); /* O método para inserir o estado de endereço é chamado no segundo espaço do array. */

        enderecoEvento[2] = inserirEnderecoCidade(enderecoEvento[2]); /* O método para inserir a cidade de endereço é chamado no terceiro espaço do array. */

        enderecoEvento[3] = inserirEnderecoCEP(enderecoEvento[3]); /* O método para inserir o CEP do endereço é chamado no quarto espaço do array. */

        enderecoEvento[4] = inserirEnderecoBairro(enderecoEvento[4]); /* O método para inserir o bairro do endereço é chamado no quinto espaço do array. */

        enderecoEvento[5] = inserirEnderecoComplemento(enderecoEvento[5]); /* O método para inserir o complemento do endereço é chamado no sexto espaço do array. */

        enderecoEvento[6] = inserirEnderecoNumero(enderecoEvento[6]); /* O método para inserir o número do endereço é chamado no sétimo espaço do array. */

        enderecoEvento[7] = inserirEnderecoRua(enderecoEvento[7]); /* O método para inserir a rua do endereço é chamado no oitavo espaço do array. */

        /* Armazenamento do endereço do evento no segundo espaço do evento[]. */
        evento[1] = enderecoEvento[7] + ", " + enderecoEvento[5] + " " + enderecoEvento[6] + " (" + enderecoEvento[3] + "), " + enderecoEvento[4] + ", " + enderecoEvento[2] + ", " + enderecoEvento[1] + ", " + enderecoEvento[0];

        evento[2] = inserirCategoria(evento[2]); /* O método para inserir a categoria é chamado no terceiro espaço do evento[]. */

        evento[3] = inserirData(evento[3]); /* O método para inserir a data é chamado no quarto espaço do evento[]. */

        evento[4] = inserirHorario(evento[4]); /* O método para inserir o horário é chamado no quinto espaço do evento[]. */

        evento[5] = inserirDescricao(evento[5]); /* O método para inserir a descrição é chamado no sexto espaço do evento[]. */
        
        /* Impressão das informações armazenadas. */
        System.out.println("\n> Nome do evento: " + evento[0]);
        System.out.println("> Endereço do evento: " + evento[1]);
        System.out.println("> Categoria do evento: " + evento[2]);
        System.out.println("> Data do evento: " + evento[3]);
        System.out.println("> Horário do evento: " + evento[4]);
        System.out.println("> Descrição do evento: " + evento[5]);

        /* Pede confirmação do usuário se as informações estão corretas. */
        System.out.println("\n> As informações estão corretas? (S/N)");
        confirmacao = entrada.nextLine(); 
      }

      /* De alguma forma terá de ser posto, aqui, nesta linha, antes da confirmação se salvamento, um comando pra guardar o evento com um id. */
      System.out.println("\n> Informações salvas.");

      /* Pede confirmação do usuário se deve cadastrar outro evento. */
      System.out.println("\n> Deseja cadastrar um novo evento? (S/N)");
      continuar = entrada.nextLine();
    }

    entrada.close(); /* Fecha a Scanner. */
  }

  private static short usuarioChato = 0; /* Para quando o usuário propositalmente não seguir as ordens do sistema. */

  /* Inserir o nome */
  private static String inserirNome(String nome) {
    System.out.println("\n> Insira o nome do evento"); /* Pede pra inserir o país. */
    String nomeEvento = entrada.nextLine(); /* Nome do evento é armazenado. */
    
    while (nomeEvento.length() < 3) {
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira um nome menor que 3 caracteres. */
      if (nomeEvento.isEmpty() && usuarioChato < 2) {
        System.out.println("\nX Erro: O nome do evento está vazio.");
      } else if (nomeEvento.length() < 3 && usuarioChato < 2) {
        System.out.println("\nX Erro: Nome do evento não deve possuir menos que três caracteres.");
        usuarioChato += 1;
      } else if (nomeEvento.length() < 3 && usuarioChato == 2) {
        System.out.println("\nX Pare de ser teimoso(a)!");
        /* ↳ Pequeno detalhe como se o sistema falasse com o usuário. */
        usuarioChato = 1;
      }

      System.out.println("\n> Insira o nome do evento");
      nomeEvento = entrada.nextLine();
    }

    nome = nomeEvento; /* O nome inserido é armazenado no parâmetro. */
    return nome; /* Parâmetro é retornado. */
  }

  /* Inserir o país de endereço */
  private static String inserirEnderecoPais(String pais) {
    System.out.println("\n> Insira o país onde o evento ocorrerá"); /* Pede o nome do país. */
    String enderPais = entrada.nextLine(); /* Armazena o que o usuário digitou. */

    while (enderPais.length() < 3) {
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira um nome menor que 3 caracteres. */
      if (enderPais.isEmpty()) {
        System.out.println("\nX Erro: Nome do país está em branco.");
        usuarioChato += 1;
      } else if ((enderPais.isEmpty() || enderPais.length() < 3) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        /* ↳ Nivel 2 e último do sistema reclamando com o usuário. */
        usuarioChato = 1;
      } else if (enderPais.length() < 3) {
        System.out.println("\nX Erro: Nome do país não deve ser menor que três caracteres.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira o país onde o evento ocorrerá"); /* Pede o nome do país novamente. */
      enderPais = entrada.nextLine(); /* Armazena o que o usuário digitou novamente. */
    }

    pais = enderPais; /* Variável é armazenada no parâmetro. */
    return pais; /* Parâmetro é retornado. */
  }

  /* Inserir o estado de endereço */
  private static String inserirEnderecoEstado(String estado) {
    System.out.println("\n> Insira o nome do estado, em extenso"); /* Pede o nome do estado em extenso. */
    String estadoEnder = entrada.nextLine(); /* Nome do estado é armazenado. */

    while (estadoEnder.length() < 3) {
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira um nome menor que 3 caracteres. */
      if (estadoEnder.isEmpty()) {
        System.out.println("\nX Erro: Nome do estado está em branco");
        usuarioChato += 1;
      } else if ((estadoEnder.isEmpty() || estadoEnder.length() < 3) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        /* ↳ Todos os métodos possuem isso. */
        usuarioChato = 1;
        /* ↳ E isso. */
      } else if (estadoEnder.length() < 3) {
        System.out.println("\nX Erro: Nome do estado deve estar em extenso.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira o nome do estado, em extenso"); /* Pede o nome do estado em extenso novamente. */
      estadoEnder = entrada.nextLine(); /* Nome do estado é armazenado novamente. */
    }

    estado = estadoEnder;
    return estado;
  }
  
  /* Inserir a cidade de endereço */
  private static String inserirEnderecoCidade(String cidade) {
    System.out.println("\n> Insira o nome da cidade, em extenso"); /* Pede o nome da cidade, em extenso. */
    String cidadeEnder = entrada.nextLine(); /* Nome da cidade é armazenado. */

    while (cidadeEnder.length() < 3) {
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira um nome menor que 3 caracteres. */
      if (cidadeEnder.isEmpty()) {
        System.out.println("\nX Erro: Nome da cidade está em branco");
        usuarioChato += 1;
      } else if ((cidadeEnder.isEmpty() || cidadeEnder.length() < 3) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (cidadeEnder.length() < 3) {
        System.out.println("\nX Erro: Nome da cidade muito pequeno.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira o nome do estado, em extenso"); /* Pede o nome do estado em extenso novamente. */
      cidadeEnder = entrada.nextLine(); /* Nome do estado é armazenado novamente. */
    }

    cidade = cidadeEnder;
    return cidade;
  }

  /* Inserir o CEP do endereço */
  private static String inserirEnderecoCEP(String cep) {
    System.out.println("\n> Insira o CEP do local onde o evento ocorrerá (Exemplo: 12345-678)"); /* Pede pro usuário inserir o CEP. */
    String cepEnder = entrada.nextLine(); /* CEP é armazenado. */

    while (cepEnder.length() < 9 || cepEnder.length() > 9){
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira um número menor ou maior que 9 caracteres. */
      if (cepEnder.isEmpty()) {
        System.out.println("\nX Erro: CEP está vazio.");
        usuarioChato += 1;
      } else if (cepEnder.length() < 9 && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (cepEnder.length() < 9) {
        System.out.println("\nX Erro: O CEP deve estar escrito neste formato: 12345-678.");
        usuarioChato += 1;
      } else if (cepEnder.length() > 9 && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (cepEnder.length() > 9) {
        System.out.println("\nX Erro: Número do CEP inválido.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira o CEP do local onde o evento ocorrerá (Exemplo: 12345-678)"); /* Pede pro usuário inserir o CEP novamente. */
      cepEnder = entrada.nextLine(); /* CEP é armazenado novamente. */
    }

    cep = cepEnder; /* Variável é armazenada no parâmetro. */
    return cep; /* Parâmetro é retornado. */
  }

  /* Inserir o bairro do endereço */
  private static String inserirEnderecoBairro(String bairro) {
    System.out.println("\n> Insira o bairro do endereço"); /* Pede ao usuário para inserir o bairro. */
    String bairroEnder = entrada.nextLine(); /* Nome do bairro é armazenado. */

    while (bairroEnder.length() < 3) {
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira um nome menor que 3 caracteres. */
      if (bairroEnder.isEmpty()) {
        System.out.println("\nX Erro: Bairro está em branco.");
        usuarioChato += 1;
      } else if ((bairroEnder.isEmpty() || bairroEnder.length() < 3) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (bairroEnder.length() < 3) {
        System.out.println("\nX Erro: Bairro não deve ter menos que três caracteres.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira o bairro do endereço"); /* Pede ao usuário para inserir o bairro novamente. */
      bairroEnder = entrada.nextLine(); /* Nome do bairro é armazenado novamente. */
    }

    bairro = bairroEnder;
    return bairro;
  }

  /* Inserir o complemento do endereço */
  private static String inserirEnderecoComplemento(String complemento) {
    System.out.println("\n> Insira o complemento (deixe vazio, caso não tenha)"); /* Pede pro usuário inserir o complemento. */
    String complementoEnder = entrada.nextLine(); /* Complemento é armazenado */

    while (complementoEnder.length() >= 1 && complementoEnder.length() < 3) {      
      /* Mostra um erro caso o usuário insira um nome menor que 3 caracteres. */
      if (complementoEnder.length() >= 1 && complementoEnder.length() < 3) {
        System.out.println("\nX Erro: Complemento não deve ser menor que 3 caracteres.");
        usuarioChato += 1;
      } else if (complementoEnder.length() >=1 && complementoEnder.length() < 3 && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      }

      System.out.println("\n> Insira o complemento (deixe vazio, caso não tenha)"); /* Pede pro usuário inserir o complemento de novo. */
      complementoEnder = entrada.nextLine(); /* Tu ainda tá lendo isso? */
    }

    if(complementoEnder.isEmpty()){complementoEnder = "\b\b";} /* Caso o usuário não insira nada, mesmo. */

    complemento = complementoEnder; /* Variável é armazenada no parâmetro. */
    return complemento; /* Parâmetro é retornado. */
  }

  /* Inserir o número do endereço */
  private static String inserirEnderecoNumero(String numero) {
    System.out.println("\n> Insira o número do endereço (deixe em branco, caso não houver)"); /* Pede pro usuário inserir isso aí. */
    String numeroEnder = entrada.nextLine(); /* E depois a resposta é armazenada. */

    while (numeroEnder.length() >= 1 && numeroEnder.length() < 3) {
      /* Mostra um erro caso o usuário insira um número menor que 3 caracteres. */
      if ((numeroEnder.isEmpty() || numeroEnder.length() < 3) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (numeroEnder.length() < 3) {
        System.out.println("\nX Erro: Número do complemento não deve ser menor que três caracteres.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira o número do endereço (deixe em branco, caso não houver)"); /* Pede pro usuário inserir isso aí, de novo. */
      numeroEnder = entrada.nextLine(); /* E depois a resposta é armazenada de novo. */
    }

    if(numeroEnder.isEmpty()){numeroEnder = "S/N";} /* Caso o usuário não insira nada, mesmo. */

    numero = numeroEnder; /* Guarda o valor da variável no parâmetro */
    return numero; /* Retorna o parâmetro. */
  }

  /* Inserir a rua do endereço */
  private static String inserirEnderecoRua(String rua) {
    System.out.println("\n> Insira a rua onde o evento ocorrerá."); /* Pede. */
    String ruaEnder = entrada.nextLine(); /* Armazena. */

    while (ruaEnder.length() < 10) {
      /* Mostra um erro caso o usuário inserir nada e caso ponha nome <10 caracteres. */
      if (ruaEnder.isEmpty()) {
        System.out.println("\nX Erro: Nome da rua está vazio.");
        usuarioChato += 1;
      } else if ((ruaEnder.isEmpty() || ruaEnder.length() < 10) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (ruaEnder.length() < 10) {
        System.out.println("\nX Erro: Nome da rua muito curto");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira a rua onde o evento ocorrerá."); /* Pede. De novo. */
      ruaEnder = entrada.nextLine(); /* Armazena. De novo. */  
    }

    rua = ruaEnder; /* Variável -> parâmetro. */
    return rua; /* Retorna parâmetro. */
  }

  /* Enter category */
  private static String inserirCategoria(String categoria) {
    System.out.println("\n> Insira a categoria do evento"); /* Asks. */
    String nomeCategoria = entrada.nextLine(); /* Stores. */

    while (nomeCategoria.length() < 3) {
      /* Shows an error when the user doesn't enter anything or enters something below 3 characters. */
      if (nomeCategoria.isEmpty()) {
        System.out.println("\nX Erro: Categoria está vazio.");
        usuarioChato += 1;
      } else if ((nomeCategoria.isEmpty() || nomeCategoria.length() < 3) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (nomeCategoria.length() < 3) {
        System.out.println("\nX Erro: Categoria não deve ser menor que 3 caracteres.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira a categoria do evento"); /* Asks. Again. */
      nomeCategoria = entrada.nextLine(); /* Stores. Again. */
    }

    categoria = nomeCategoria; /* Variable -> parameter. */
    return nomeCategoria; /* Returns parameter. */
  }

  /* Inserir data */
  private static String inserirData(String data) {
    System.out.println("\n> Insira a data do evento (Exemplo: 29/08/2006)"); /* Pede. */
    String dataEnder = entrada.nextLine(); /* Armazena. */

    while (dataEnder.length() < 10) {
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira algo menor que 10 caracteres. */
      if (dataEnder.isEmpty()) {
        System.out.println("\nX Erro: Data está vazia.");
        usuarioChato += 1;
      } else if ((dataEnder.isEmpty() || dataEnder.length() < 10) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (dataEnder.length() < 10) {
        System.out.println("\nX Erro: A data deve estar escrita neste formato: 29/08/2006.");
        usuarioChato += 1;
      }
      System.out.println("\n> Insira a data do evento (Exemplo: 29/08/2006)"); /* Pede. Novamente. */
      dataEnder = entrada.nextLine(); /* Armazena. Novamente. */
    }

    data = dataEnder; /* Variável -> parâmetro. */
    return data; /* Retorna parâmetro. */
  }

  /* Inserir horário */
  private static String inserirHorario(String horario) {
    System.out.println("\n> Insira o horário do evento (exemplo: 23:59)"); /* Qual foi? */
    String horarioEnder = entrada.nextLine(); /* Ainda não entendeu como funciona? */

    while (horarioEnder.length() < 5) {
      /* Mostra um erro caso o usuário não inserir nada e caso o usuário insira algo menor que 5 caracteres. */
      if (horarioEnder.isEmpty()) {
        System.out.println("\nX Erro: Horário está vazio.");
        usuarioChato += 1;
      } else if ((horarioEnder.isEmpty() || horarioEnder.length() < 5) && usuarioChato >= 2) {
        System.out.println("\nX Pare com isso.");
        usuarioChato = 1;
      } else if (horarioEnder.length() < 5) {
        System.out.println("\nX Erro: O horário deve estar escrito neste formato: 23:59.");
        usuarioChato += 1;
      }

      System.out.println("\n> Insira o horário do evento (exemplo: 23:59)"); /* Se ainda não entendeu... */
      horarioEnder = entrada.nextLine(); /* ...Revise sua memória. */
    }

    horario = horarioEnder;
    return horario;
  }

  /* Inserir descrição */
  private static String inserirDescricao(String descricao) {
    System.out.println("\n> Insira a descrição"); /* Pede para o usuário inserir a descrição. */
    String desc = entrada.nextLine(); /* Armazena a descrição na variável desc. */

    if (desc.isEmpty()) {desc="Sem descrição";} /* Caso o usuário insira nada na descrição */

    descricao = desc; /* Armazena a variável no parâmetro descricao */

    /* Retorna a descrição ↴ */
    return descricao; /* <- Retorna o parâmetro descricao */
    /* ↳ Retorna a descrição */
  }
}
/* 407 linhas. */