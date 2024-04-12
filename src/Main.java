import codigo.Cuadrado;
import codigo.Rectangulo;
import codigo.Triangulo;

import java.util.Scanner;
import java.awt.Color;

public class Main {

    public static final Color RED = Color.red;

    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner (System.in);
        do {
            opcion = mostrarMenu(teclado);

            if (opcion != 4){
                System.out.print ("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print ("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();
                switch (opcion)
                {  case 1:
                    System.out.print ("Introduzca el lado 1 del triángulo: ");
                    double lado1 = teclado.nextDouble();
                    System.out.print ("Introduzca el lado 2 del triángulo: ");
                    double lado2 = teclado.nextDouble();
                    System.out.print ("Introduzca el lado 3 del triángulo: ");
                    double lado3 = teclado.nextDouble();
                    Triangulo t = new Triangulo(x, y, RED, lado1, lado2, lado3);
                    System.out.println ("El perímetro es " + t.perimetro());
                    System.out.println ("El área es " + t.area());
                    break;
                    case 2:
                        System.out.print ("Introduzca la base del rectángulo: ");
                        int base = teclado.nextInt();
                        System.out.print ("Introduzca la altura del rectángulo: ");
                        int altura = teclado.nextInt();
                        Rectangulo r = new Rectangulo(x, y, RED, base, altura);
                        System.out.println ("El perímetro es " + r.perimetro());
                        System.out.println ("El área es " + r.area());
                        break;
                    case 3:
                        System.out.print ("Introduzca el lado del cuadrado: ");
                        int lado = teclado.nextInt();
                        Cuadrado c = new Cuadrado(x, y, RED, lado);
                        System.out.println ("El perímetro es " + c.perimetro());
                        System.out.println ("El área es " + c.area());
                        break;
                }
            }
        }while (opcion != 4);
        teclado.close();
    }

    private static int mostrarMenu(Scanner teclado) {
        int opcion;
        System.out.println ("1) Triángulo");
        System.out.println ("2) Rectángulo");
        System.out.println ("3) Cuadrado");
        System.out.println ("4) Salir");
        do {
            System.out.print ("Introduzca una opción (1-4): ");
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > 4)
                System.out.println ("Debe introducir un número entre 1 y 4");
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
}
