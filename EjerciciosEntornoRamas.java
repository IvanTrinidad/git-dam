import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosEntornoRamas {
    public static  void ej1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir? ");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\n¿Qué número quieres eliminar? ");
        int eliminar = sc.nextInt();

        // Crear un nuevo array sin la primera ocurrencia del número
        boolean eliminado = false;
        int[] resultado = new int[cantidad - 1];
        int idx = 0;

        for (int n : numeros) {
            if (n == eliminar && !eliminado) {
                eliminado = true;
            } else {
                if (idx < resultado.length) resultado[idx++] = n;
            }
        }

        if (eliminado) {
            System.out.println("Array resultante:");
            for (int n : resultado) System.out.print(n + " ");
        } else {
            System.out.println("El número " + eliminar + " no existe en el array.");
        }
        System.out.println();
        
    }

        public static void ej2(){
            Scanner sc = new Scanner(System.in);
            int[] edades = new int[5];

            for (int i = 0; i < edades.length; i++) {
                System.out.print("Introduce la edad " + (i + 1) + ": ");
                edades[i] = sc.nextInt();
            }

            boolean todosMayores = true;

            for (int e : edades) {
                if (e < 18) {
                    todosMayores = false;
                    break;
                }
            }

            System.out.println("\n¿Todos los usuarios son mayores de edad? " + todosMayores);


        }

        public static void ek3(){
            int[] numeros = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 100) + 1;
            }

            System.out.print("Array original: ");
            for (int n : numeros) System.out.print(n + " ");

            // Contar pares e impares para dimensionar los arrays
            int cPares = 0, cImpares = 0;
            for (int n : numeros) {
                if (n % 2 == 0) cPares++; else cImpares++;
            }

            int[] pares    = new int[cPares];
            int[] impares  = new int[cImpares];
            int ip = 0, ii = 0;

            for (int n : numeros) {
                if (n % 2 == 0) pares[ip++] = n;
                else             impares[ii++] = n;
            }

            System.out.print("\nPares:   ");
            for (int n : pares)   System.out.print(n + " ");
            System.out.print("\nImpares: ");
            for (int n : impares) System.out.print(n + " ");
            System.out.println();
        }
    public static void main(String[] args) {


    }
    }

