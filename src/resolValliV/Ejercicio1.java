package resolValliV;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1(){
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try{
            System.out.println("Ingrese primera fecha y hora: 'dd/MM/yyyy HH:mm' ");
            String fechaUser1= scanner.nextLine();
            LocalDateTime fecha1 = LocalDateTime.parse(fechaUser1, formato);

            System.out.println("Ingrese segunda fecha y hora: 'dd/MM/yyyy HH:mm' ");
            String fechaUser2= scanner.nextLine();
            LocalDateTime fecha2 = LocalDateTime.parse(fechaUser2, formato);

            if(fecha1.isAfter(fecha2)){
                System.out.println(fecha1 + " es mayor a " + fecha2 );
            }else if(fecha1.isBefore(fecha2)){
                System.out.println(fecha2 + " es mayor a " + fecha1 );
            } else {
                System.out.println("Son la misma fecha");
            }
        }catch (Exception e){
            System.out.println("Ingrese el formato correctamente");
        }

    }
}
