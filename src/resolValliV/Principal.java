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
            case 2:
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.ejercicio2();
            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.ejercicio3();
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.ejercicio4();
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.ejercicio5();
            case 6:
                Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.ejercicio6();
            case 7:
                Ejercicio7 ejercicio7 = new Ejercicio7();
                ejercicio7.ejercicio7();
            case 8:
                Ejercicio8 ejercicio8 = new Ejercicio8();
                ejercicio8.ejercicio8();
            case 9:
                Ejercicio9 ejercicio9 = new Ejercicio9();
                ejercicio9.ejercicio9();
            case 10:
                Ejercicio10 ejercicio10= new Ejercicio10();
                ejercicio10.ejercicio10();
            case 11:
                System.exit(0);
            default:
                System.out.println("Intente ingresas nuevamente un numero");
                main(args);
        }
    }
}
