import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        /*declaração de variaveis*/
        Scanner sc = new Scanner(System.in);
        int binario, decimal;
        int unidade, dezena, centena, milhar;

        /*input, processamento e output de dados*/
        System.out.print("Digite um numero binario contendo 4 bits: ");
        binario = sc.nextInt();

        unidade = binario % 10;
        dezena = binario % 100 / 10;
        centena = binario / 100 % 10;
        milhar = binario / 1000;

        /*System.out.println("unidade: " + unidade);
        System.out.println("dezena: " + dezena);
        System.out.println("centena: " +centena);
        System.out.println("milhar: "+ milhar);*/

        decimal = unidade + (dezena*2) + (centena*4) + (milhar*8);
        System.out.println("O numero binario inserido é equivalente a " + decimal + " em decimais");
    }
}
