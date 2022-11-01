import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        System.out.println("Ingrese el valor de a");
        Scanner q = new Scanner(System.in);
        double a = q.nextInt();
        System.out.println("Ingrese el valor de b");
        double b = q.nextInt();
        q.close();
        double p = (a * a) + (b * b);
        double v = Math.sqrt(p);
        System.out.println("el resultado va ser: " + v);


    }
}
