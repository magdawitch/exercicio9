import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //1:Peça uma temperatura em graus Fahrenheit

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma temperatura em graus Fahrenheit: ");

        double Fahrenheit = sc.nextDouble();

        //2: Transforme e mostre em graus Celsius

        double Celsius = 5 * ((Fahrenheit-32)/9);

        System.out.println(Fahrenheit + " graus Fahrenheit, equivalem a " + Celsius + " graus Celsius  ");
    }
}
