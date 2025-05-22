package resolValliV;

import java.time.LocalTime;

public class Ejercicio3 {
    public void ejercicio3(){
        LocalTime hora1 = LocalTime.of(7,0,0);
        LocalTime hora2 = LocalTime.of(15,0,0);

        LocalTime horaAux = hora1;
        int minutos = 0;
        while(horaAux.isBefore(hora2)){
            horaAux = horaAux.plusMinutes(1);
            minutos ++;
        }

        System.out.println("minutos = " + minutos);
    }
}
