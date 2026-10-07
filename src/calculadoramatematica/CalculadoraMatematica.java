/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;

/**
 * Clase CalculadoraMatematica
 * Permite realizar operaciones básicas entre dos números.
 * Incluye manejo de división por cero y menú interactivo.
 */
import java.util.Scanner;

public class CalculadoraMatematica {

 
    // 🔹 Atributos privados
    private double numero1;
    private double numero2;

    // 🔹 Constructor por defecto
    public CalculadoraMatematica() {
        numero1 = 0;
        numero2 = 0;
    }

    // 🔹 Método para establecer números
    public void ingresarNumeros(double n1, double n2) {
        numero1 = n1;
        numero2 = n2;
    }

    // 🔹 Métodos de operaciones matemáticas
    public double calcularSuma() {
        return numero1 + numero2;
    }

    public double calcularResta() {
        return numero1 - numero2;
    }

    public double calcularMultiplicacion() {
        return numero1 * numero2;
    }

    public double calcularDivision() {
        if (numero2 == 0) {
            System.out.println("⚠️ Error: No se puede dividir entre cero.");
            return Double.NaN;
        }
        return numero1 / numero2;
    }

    // 🔹 Método principal con menú interactivo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica calc = new CalculadoraMatematica();
        int opcion;

        do {
            System.out.println("\n===== CALCULADORA MATEMÁTICA =====");
            System.out.println("1. Ingresar números");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double n2 = sc.nextDouble();
                    calc.ingresarNumeros(n1, n2);
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.calcularSuma());
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.calcularResta());
                    break;
                case 4:
                    System.out.println("Resultado: " + calc.calcularMultiplicacion());
                    break;
                case 5:
                    System.out.println("Resultado: " + calc.calcularDivision());
                    break;
                case 6:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
    

