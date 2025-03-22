package Usuarios;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    // Coloquei pra confirmar a senha pra ficar mais "profissional", mas honestamente tanto faz
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.println("=== Sistema de Cadastro de Usuários ===");

        // Cadastrar múltiplos usuários
        String continuar;
        do {
            String nome = solicitarNome(scanner);
            String email = solicitarEmail(scanner, usuarios);
            String senha = solicitarSenha(scanner);

            Usuario novoUsuario = new Usuario(nome, email, senha);
            usuarios.add(novoUsuario);

            System.out.print("Deseja cadastrar outro usuário? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();

        // Chama o método de listagem da outra classe
        ListagemUsuarios.listar(usuarios);
    }

    // Método para validar o nome
    private static String solicitarNome(Scanner scanner) {
        String nome;
        do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            if (nome.trim().isEmpty() || nome.length() < 3 || !Character.isUpperCase(nome.charAt(0))) {
                System.out.println("❌ O nome deve ter mais de 2 caracteres e começar com letra maiúscula!");
            }
        } while (nome.trim().isEmpty() || nome.length() < 3 || !Character.isUpperCase(nome.charAt(0)));

        return nome;
    }

    // Método para validar o email (aceita .com e .br e verifica duplicados)
    private static String solicitarEmail(Scanner scanner, ArrayList<Usuario> usuarios) {
        String email;
        boolean emailDuplicado;

        do {
            System.out.print("Digite o email: ");
            email = scanner.nextLine();
            emailDuplicado = verificarEmailDuplicado(email, usuarios);

            if (email.trim().isEmpty() || !email.matches("^[\\w._%+-]+@[\\w.-]+\\.(com|br)$")) {
                System.out.println("❌ Email inválido! Deve conter '@' e terminar com '.com' ou '.br'.");
            } else if (emailDuplicado) {
                System.out.println("❌ Email já cadastrado! Tente outro.");
            }

        } while (email.trim().isEmpty() || !email.matches("^[\\w._%+-]+@[\\w.-]+\\.(com|br)$") || emailDuplicado);

        return email;
    }

    // Método para verificar se o email já foi cadastrado
    private static boolean verificarEmailDuplicado(String email, ArrayList<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return true; // Email encontrado, é duplicado!
            }
        }
        return false;
    }

    // Método para validar a senha e pedir confirmação
    private static String solicitarSenha(Scanner scanner) {
        String senha = "";
        String confirmacao = "";

        do {
            System.out.print("Digite a senha (mínimo 8 caracteres e 1 caractere especial): ");
            senha = scanner.nextLine();

            // Valida tamanho e caractere especial
            if (!senha.matches("^(?=.*[!@#$%^&*()-+]).{8,}$")) {
                System.out.println("❌ A senha deve ter pelo menos 8 caracteres e incluir um caractere especial!");
                continue;
            }

            System.out.print("Confirme a senha: ");
            confirmacao = scanner.nextLine();

            if (!senha.equals(confirmacao)) {
                System.out.println("❌ As senhas não coincidem! Tente novamente.");
            }

        } while (!senha.matches("^(?=.*[!@#$%^&*()-+]).{8,}$") || !senha.equals(confirmacao));

        return senha;
    }
}