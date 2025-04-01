import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner carro = new Scanner(System.in);

        double l, t, vm;

        System.out.print("Insira o tempo gasto: ");
        t = carro.nextDouble();
        System.out.print("Insira a velocidade média em km/s: ");
        vm = carro.nextDouble();

        l = (vm * t) / 10.5;
        System.out.print("A quantidade de litros gasta por km foi de: " + l);
    }
}
