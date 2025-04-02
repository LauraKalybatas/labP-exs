import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, inverso;
        int unidade, centena, dezena;

        System.out.print("Digite um numero de 100 a 999: ");
        numero = sc.nextInt();

        unidade = numero % 10;
        dezena = numero % 100 / 10;
        centena = numero / 100;

        inverso = unidade*100 + dezena*10 + centena; /*versao de vdd*/
        System.out.println(inverso);

        /*versao de golpista lol*/
        /*System.out.print("o numero inverso é: "+unidade+dezena+centena);*/ /*versao de golpista lol*/

    }
}
