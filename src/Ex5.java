import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");

        /*declaração de variaveis*/
        double valorHA, dInss, sB, sL, vInss;
        int horasMes;

        /*entrada de dados*/
        System.out.print("Insira o valor da hora-aula: R$");
        valorHA = sc.nextDouble();

        System.out.print("Insira as horas trabalhadas no mes: ");
        horasMes = sc.nextInt();

        System.out.print("Insira a porcentagem de desconto do INSS: ");
        dInss = sc.nextDouble();

        /*processamento e saida de dados*/
        sB = valorHA*horasMes;
        System.out.println("O valor do salário bruto é: " + df.format(sB));

        vInss = sB * dInss / 100;
        System.out.println("O valor a ser descontado pelo inss é: " + df.format(vInss));

        sL = sB - vInss;
        System.out.println("O valor do sálario líquido é: " + df.format(sL));
    }
}
