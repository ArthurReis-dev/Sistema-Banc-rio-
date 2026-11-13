import java.util.Scanner;;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean rodando = true; //Até então isso vai fazer meu codigo ficar rodando
        int resp_1 = 0; //Resposta da primeira parte do codigo para criar ou entrar em uma conta

        do {
            System.out.println("|------ Banco Reis ------|");

            System.out.println("Escolha uma opção: ");
            System.out.println("1- Criar conta");
            System.out.println("2- Entrar em uma conta");

            System.out.print("Digite uma opção: ");
            resp_1 = scanner.nextInt();

            if (resp_1 == 3){
                rodando = false;
                System.out.println("Sessão encerrada");
            }

        }while (rodando == true);

    }
}