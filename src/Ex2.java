import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        /*declaração de variaveis*/
        double c, f;

        /*entrada de dados*/
        System.out.print("Digite a temperatura em Celsius: ");
        c = temp.nextDouble();

        /*Processamento de dados*/
        f = c * 9 / 5 + 32;
        System.out.print("A temperatura equivalente em Fahrenheit é: " + f);
    }
}
