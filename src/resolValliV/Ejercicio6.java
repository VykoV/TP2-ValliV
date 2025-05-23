package resolValliV;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresar tu fecha de nacimiento");

        try{
            String fN = scanner.nextLine();
            LocalDate fechaNacimiento = LocalDate.parse(fN);
            LocalDate hoy = LocalDate.now();

            LocalDate proxCumple = fechaNacimiento.withYear(hoy.getYear());

            if (!proxCumple.isAfter(hoy)) {
                proxCumple = proxCumple.plusYears(1);
            }

            Period tiempo = Period.between(hoy, proxCumple);

            System.out.println("Falta para tu cumpleaños: " + tiempo.getDays() + " Dias, " + tiempo.getMonths() + " Meses");
        } catch (Exception e) {
            System.out.println("Ingrese correctamente el formato");
        }
    }
}