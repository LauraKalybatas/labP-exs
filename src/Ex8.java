import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, dezena;

        System.out.print("Insira um numero inteiro entre 100 e 999: ");
        numero = sc.nextInt();

        dezena = numero / 10;
        System.out.println("A dezena do numero inserido é " + dezena%10);
    }
}
