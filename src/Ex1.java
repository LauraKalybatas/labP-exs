import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);

        //variaveis de input
        double base, altura;

        //set dos inputs
        System.out.println("Insira o valor da base: ");
        base = triangulo.nextDouble();
        System.out.println("Insira o valor da altura: ");
        altura = triangulo.nextDouble();

        //variaveis de calculo
        double area, perimetro;

        //set dos calculos
        area = base * altura;
        System.out.println("O valor da área é: " + area);
        perimetro = (altura*2) + (base*2);
        System.out.println("O valor do perimetro é: " + perimetro);
    }

}
