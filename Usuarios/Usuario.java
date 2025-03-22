package Usuarios;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    // Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Get
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    // Exibe o nome e email, coloquei pra não exibir a senha, mas qualquer coisa é só incluir
    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email;
    }
}
