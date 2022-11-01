import java.util.Scanner;
public class Circunferencia {
    public static void main(String[] args) {
        System.out.println("ingrese valor de r");
        Scanner q = new Scanner(System.in);
        double r = q.nextInt();
        q.close();
        double PII = 3.1416;
        double a = PII * (r * r);
        System.out.println("el resultado es: "+ a);
    }
}
