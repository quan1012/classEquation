import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a: ");
        a = input.nextDouble();
        System.out.print("Enter b: ");
        b = input.nextDouble();
        System.out.print("Enter c: ");
        c = input.nextDouble();
        System.out.println("The equation has the form: (" + a + ")*x^2 + (" + b +")*x + " + c + " = 0");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double d = quadraticEquation.getD();
        double e = quadraticEquation.getE();
        if (delta > 0) {
            System.out.println("The equation has two distinct solutions:");
            System.out.println("x1 = " + (d + e));
            System.out.println("x2 = " + (d - e));
        } else if (delta == 0) {
            System.out.println("The equation has a real solution");
            System.out.println("x1 = x2 = " + d);
        } else {
            System.out.println("The equation has two distinct complex solutions:");
            System.out.println("x1 = " + d + " + " + e + "i");
            System.out.println("x1 = " + d + " - " + e + "i");
        }
    }}