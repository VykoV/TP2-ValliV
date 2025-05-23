package resolValliV;

import java.util.Scanner;

public class Ejercicio8 {
    public void ejercicio8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar litros de combustible que tiene el deposito");
        double N = scanner.nextInt();
        System.out.println("En carreteras normales consume: " + carreteraNormal(N));
        System.out.println("En carreteras desiguales consume: " +carreteraDesigual(N));
    }

    public double carreteraNormal(double n){
        return(n*100/8);
    }
    public double carreteraDesigual(double n){
        return(n*100/(8*1.15));
    }
}
