import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo 'Adivinhe o número'!");
        System.out.println("Estou pensando em um número entre 1 e 100.");

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Faça o seu palpite: ");
            int palpite;
            try {
                palpite = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }

            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Mais alto! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Mais baixo! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            }
        }

        scanner.close();
    }
}
