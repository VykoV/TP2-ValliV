package resolValliV;

import java.util.Scanner;

public class Ejercicio7 {
    public void ejercicio7(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
