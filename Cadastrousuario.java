import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Cadastro De Usuário ===");
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite seu Email: ");
        String email = entrada.nextLine();
        System.out.println("Está estudando java? (true/false): ");
        boolean estudando = entrada.nextBoolean();

        System.out.println("\n=== Cadastro De Usuário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Estuda Java: " + (estudando ? "Sim" : "Não"));

        entrada.close();
    }
    
}
