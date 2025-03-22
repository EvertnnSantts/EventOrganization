package Usuarios;
import java.util.ArrayList;

public class ListagemUsuarios {

    // Método para listar usuários
    // Preferi fazer em classes separadas pra ficar mais organizado

    public static void listar(ArrayList<Usuario> usuarios) {
        System.out.println("\nUsuários Cadastrados");

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println((i + 1) + ". " + usuarios.get(i));
            }
        }
    }
}