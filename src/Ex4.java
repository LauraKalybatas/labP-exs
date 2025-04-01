import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*declaracao de variaveis*/
        DecimalFormat df = new DecimalFormat("0.00");/*pra deixar os decimais mais bonitinho*/
        Scanner sc = new Scanner(System.in);
        double s, w, valorW, total, totalDesc;

        /*inputs*/
        System.out.print("Insira o salario minimo: ");
        s = sc.nextDouble();

        System.out.print("Insira os watts gastos: ");
        w = sc.nextDouble();

        /*processamento de dados*/
        valorW = s / 7 / 100;
        total = valorW * w;
        totalDesc = total * 90 / 100;

        System.out.println("O valor por watts em reais é: " + df.format(valorW));
        System.out.println("O total a ser pago é: " + df.format(total));
        System.out.println("O total a ser pago com desconto de 10% é: " + df.format(totalDesc));
    }
}
