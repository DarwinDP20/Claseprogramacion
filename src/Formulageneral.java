import java.util.Scanner;

public class Formulageneral {
    public static void main(String[] args) {
        System.out.println("Ingrese el valor de a");
        Scanner q = new Scanner(System.in);
        double a = q.nextInt();
        System.out.println("Ingrese el valor de b");
        double b = q.nextInt();
        System.out.println("Ingrese el valor de c");
        double c = q.nextInt();
        double x_1 = (-b+ Math.sqrt((b * b - 4 * a * c)))/2 * a;
        double x_2 = (-b- Math.sqrt((b * b - 4 * a * c)))/2 * a;
        System.out.println("El valor de x_1 es: " + x_1);
        System.out.println("El valor de x_2 es: " + x_2);

    }
}
