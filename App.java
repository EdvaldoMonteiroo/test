import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Eu sou o Chatbot de Cadastro. Vamos começar o processo de cadastro.");

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Qual é a sua idade? ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ótimo!" + nome + " Você forneceu as seguintes informações:");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Idade: " + idade);

        System.out.println("Obrigado por se cadastrar em nosso sistema Sr(a)" + nome + "!");

        scanner.close();
    }
}

