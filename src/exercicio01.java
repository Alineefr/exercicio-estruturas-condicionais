import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe seu ano de nascimento");
        Double AnoNasci = scanner.nextDouble();

        if ((2024 - AnoNasci) >= 18) {

            System.out.println("Parabéns, Você tem mais de 18 anos");
        }

        else {

            System.out.println("Ho não, você tem menos de 18 anos!");

        }
    }

}
