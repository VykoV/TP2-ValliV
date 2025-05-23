package resolValliV;

import java.util.Scanner;

public class Ejercicio9 {
    public void ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un monto de dinero");
        int monto = scanner.nextInt();
        int Aux=monto;
        int b10 =0;
        int b20 =0;
        int b50 =0;
        int b100 =0;
        int b200 =0;
        int b500 =0;
        int b1000 =0;
        int b10000 =0;
        int b20000 =0;

        while (Aux>=10) {
            if (Aux >= 20000) {
                Aux = Aux - 20000;
                b20000++;
            } else if (Aux >= 10000) {
                Aux = Aux - 10000;
                b10000++;
            } else if (Aux >= 1000) {
                Aux = Aux - 1000;
                b1000++;
            } else if (Aux >= 500) {
                Aux = Aux - 500;
                b500++;
            } else if (Aux >= 200) {
                Aux = Aux - 200;
                b200++;
            } else if (Aux >= 100) {
                Aux = Aux - 100;
                b100++;
            } else if (Aux >= 50) {
                Aux = Aux - 50;
                b50++;
            } else if (Aux >= 20) {
                Aux = Aux - 20;
                b20++;
            } else if (Aux >= 10) {
                Aux = Aux - 10;
                b10++;
            }
        }
        System.out.println("Se necesita para el monto " + monto + " :\n" + b20000 + " billetes de 20000\n" + b10000 +" billetes de 10000\n" + b1000+ " billetes de 1000\n" + b500 +" billetes de 500\n" + b200+ " billetes de 200\n" + b100+ " billetes de 100\n" + b50 +" billetes de 50\n" + b20 + " billetes de 20\n" + b10 + " billetes de 10\n"      );
        if (Aux>0){
            System.out.println("Sobra $" + Aux);
        }
    }
}
