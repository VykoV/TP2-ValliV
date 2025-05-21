package resolValliV;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que programa quiere ejecutar?" +
                "\n01. Ejercicio 1" +
                "\n02. Ejercicio 2" +
                "\n03. Ejercicio 3" +
                "\n04. Ejercicio 4" +
                "\n05. Ejercicio 5" +
                "\n06. Ejercicio 6" +
                "\n07. Ejercicio 7" +
                "\n08. Ejercicio 8" +
                "\n09. Ejercicio 9" +
                "\n10. Ejercicio 10" +
                "\n11. Salir");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.ejercicio1();
            case 11:
                System.exit(0);
            default:
                System.out.println("Intente ingresas nuevamente un numero");
                main(args);
        }
    }
}
