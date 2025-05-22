package resolValliV;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingresar tu fecha de nacimiento ");

        try {
            String fechaNacimientoSF = scanner.nextLine();
            //LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoSF, formato);
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoSF);

            LocalDate ahora = LocalDate.now();
            System.out.println("ahora = " + ahora);

            Period periodo = Period.between(fechaNacimiento, ahora);
            System.out.println("periodo = " + periodo);
            
            LocalDate fecha = fechaNacimiento;
            int dias = 0;
            while (fecha.isBefore(ahora)){
                fecha = fecha.plusDays(1);
                dias++;
            }

            System.out.println("dias = " + dias);

        }catch (Exception e) {
            System.out.println(" Ingreso de datos incorrecto");
        }

    }
}
