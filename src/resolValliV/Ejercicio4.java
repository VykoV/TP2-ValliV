package resolValliV;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingresar tu fecha de nacimiento");

        try {
            String fecha = scanner.nextLine();
            LocalDate fechaNacimiento = LocalDate.parse(fecha);

            DayOfWeek dia = fechaNacimiento.getDayOfWeek();

            System.out.println("Dia de la semana: " + dia);

        }catch (Exception e) {
            System.out.println(" Ingreso de datos incorrecto");
        }
    }

}
