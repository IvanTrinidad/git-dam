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

        // Arrays.sort ordena de menor a mayor por defecto
        Arrays.sort(numeros);

        System.out.println("\nNúmeros ordenados de menor a mayor:");
        for (int n : numeros) {
            System.out.print(n + " ");
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

            int mayoresDeEdad = 0;
            int menoresDeEdad = 0;

            System.out.println("\nEdades introducidas:");
            for (int e : edades) {
                System.out.println(e);
                if (e >= 18) mayoresDeEdad++;
                else menoresDeEdad++;
            }

            System.out.println("\nMayores de edad (>= 18): " + mayoresDeEdad);
            System.out.println("Menores de edad (< 18): " + menoresDeEdad);

        }

        public static void ek3(){
            int[] numeros = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 100) + 1;
            }

            // Ordenar de mayor a menor
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - 1 - i; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }

            System.out.print("Array ordenado: ");
            for (int n : numeros) System.out.print(n + " ");

            // Mostrar solo los números pares del array ordenado
            System.out.println("\nNúmeros pares (ordenados de mayor a menor):");
            for (int n : numeros) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    public static void main(String[] args) {


    }
    }

