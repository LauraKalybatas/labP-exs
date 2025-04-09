import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*Declaração de variaveis*/
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double x, y;
        double aux;

        /*Input, processamento e output de dados*/
        System.out.print("x = ");
        x = sc.nextDouble();

        aux = (Math.pow(x, 4) - 1) / (2 * Math.pow(x, 2));
        y = Math.sqrt(1 + Math.pow(aux, 2)) - Math.pow(x, 2) / 2;

        System.out.println("y = " + df.format(y));
    }
}
