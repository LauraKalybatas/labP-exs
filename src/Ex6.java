import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*declaração de variaveis*/
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double x, y;

        /*input, processamento e output de dados*/
        System.out.print("x = ");
        x = sc.nextInt();

        y = Math.sqrt(Math.cbrt(x - 1.0/2));
        System.out.println("y = " + df.format(y));
    }
}
