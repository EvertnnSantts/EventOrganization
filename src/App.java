//imports dos outros arquivos
import models.MenuGeral;

// Arquivo geral da aplicação
// Esse arquivo será responsável por importar todos os outros arquivos 
public class App {
    public static void main(String[] args) {
        MenuGeral menuGeral = new MenuGeral();  
        menuGeral.MenuInicial(); 
    }
}
