package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String args[]) {
        int Opc, numero1 = 0, numero2 = 0, resultado = 0;
        Scanner lectorDatos = new Scanner(System.in);

        System.out.println("Calculadora de uso básico - elija la opcion que desea realizar en el menú: ");
        System.out.println("\n********** MENÚ DE OPCIONES ***********");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicación ");
        System.out.println("4. División ");
        System.out.println("5. Verificar número primo");
        System.out.println("6. Verificar número palíndromo");
        System.out.println("*****************************************");
        System.out.println("\n");
        System.out.println("Ingresa la opción que deseas: ");

        Opc = lectorDatos.nextInt();

        switch (Opc) {
            case 1:
                System.out.println("Introduce el primer valor para tu suma: ");
                numero1 = lectorDatos.nextInt();
                System.out.println("Introduce el segundo valor para tu suma: ");
                numero2 = lectorDatos.nextInt();
                resultado = numero1 + numero2;
                System.out.println("El resultado de tu suma es: " + resultado);
                break;

            case 2:
                System.out.println("Introduce el primer valor para tu resta: ");
                numero1 = lectorDatos.nextInt();
                System.out.println("Introduce el segundo valor para tu resta: ");
                numero2 = lectorDatos.nextInt();
                resultado = numero1 - numero2;
                System.out.println("El resultado de tu resta es: " + resultado);
                break;

            case 3:
                System.out.println("Introduce el primer valor para tu multiplicación: ");
                numero1 = lectorDatos.nextInt();
                System.out.println("Introduce el segundo valor para tu multiplicación: ");
                numero2 = lectorDatos.nextInt();
                resultado = numero1 * numero2;
                System.out.println("El resultado de tu multiplicación es: " + resultado);
                break;

            case 4:
                System.out.println("Introduce el primer valor para tu división: ");
                numero1 = lectorDatos.nextInt();
                System.out.println("Introduce el segundo valor para tu división: ");
                numero2 = lectorDatos.nextInt();
                resultado = numero1 / numero2;
                System.out.println("El resultado de tu división es: " + resultado);
                break;

            case 5:
                int suma = 0;
                System.out.println("Ingresa el número a valorar: ");
                numero1 = lectorDatos.nextInt();

                for (int i = 1; i <= numero1; i++) {
                    int auxiliar = numero1 % i;

                    if (auxiliar == 0) {
                        suma = suma + 1;
                    }
                }

                if (suma <= 2) {
                    System.out.println("El número ingresado es primo.");
                } else {
                    System.out.println("El número ingresado no es primo.");
                }
                break;

            case 6:
                String num_Str,num_inverso = "";
                int numero = 0,inverso = 0;
                Scanner entrada = new Scanner(System.in);

                do {
                    System.out.println("Ingrese el número a valorar: ");
                    num_Str = entrada.nextLine();
                    for (int i = num_Str.length() - 1; i >= 0; i--) {
                        num_inverso += num_Str.charAt(i);
                    }
                    try {
                        numero = Integer.valueOf(num_Str);
                        inverso = Integer.valueOf(num_inverso);
                    } catch (NumberFormatException error) {
                        System.out.println("Debes de ingresar un número");
                        num_inverso = "";
                    }
                } while (numero <= 10);

                if (numero == inverso) {
                    System.out.println(" El numero ingresado SI es un número capicua");
                } else {
                    System.out.println(" El numero ingresado NO es un número capicua");
                }
                break;
                
            default:
                System.out.println("La opción elegida no se encuentra disponible. ");
        }

    }
}
