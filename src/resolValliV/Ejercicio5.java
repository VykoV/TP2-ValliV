package resolValliV;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Duration;

public class Ejercicio5 {
    public void ejercicio5(){
        LocalDateTime fechaParcial = LocalDateTime.of(2025, 6, 26, 19,20,0);
        LocalDateTime hoy = LocalDateTime.now();

        LocalDateTime aux = hoy;
        int dias = 0;
        int diasClases= 0;
        while (aux.isBefore(fechaParcial)){
            aux = aux.plusDays(1);
            dias++;
            DayOfWeek auxNom = aux.getDayOfWeek();
            if (auxNom== DayOfWeek.THURSDAY){
                diasClases ++;
            }
        }

        Duration duracion = Duration.between(hoy, fechaParcial);
        long horas = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;

        System.out.println("Faltan para el parcial " + dias + " dias"+ "\nTiempo restante: "+ horas  + " horas, " + minutos + " minutos" + "\nClases que faltan para el parcial "+ diasClases);
    }
}
