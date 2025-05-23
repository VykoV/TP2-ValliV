package resolValliV;

import java.util.Scanner;

public class Ejercicio10 {
    public void ejercicio10(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserte cantidad de alumnos ");
        int alumnos;
        do{
            alumnos = scanner.nextInt();
            if (alumnos<10){
                System.out.println("Tiene que ser mayor a 10");
            }
        }while (alumnos<10);

        String[] nombres = new String[alumnos];
        double[] notas = new double[alumnos];
        String[] resultados = new String[alumnos];

        scanner.nextLine();
        for (int i = 0; i < alumnos; i++) {

            System.out.println("Inserte el nombre del alumno");
            nombres[i] = scanner.nextLine();
            double nota;
            do{
                System.out.println("Inserte la nota del alumno (0 - 10)");
                nota = scanner.nextDouble();
                if (nota>10){
                    System.out.println("Tiene que ser un numero entre 0 al 10");
                }
            }while(nota < 0 || nota > 10);
            notas[i] = nota;
            scanner.nextLine();
        }

        for (int i = 0; i < alumnos ; i++) {
            if(notas[i]<=4.99){
                resultados[i] = "suspenso";
            } else if(notas[i]>=5 && notas[i]<=6.99){
                resultados[i] = "bien";
            } else if(notas[i]>=7 && notas[i]<=8.99) {
                resultados[i] = "notable";
            }else if(notas[i]>=9 && notas[i]<=10) {
                resultados[i] = "sobresaliente";
            }
        }

        for (int i = 0; i < alumnos; i++) {
            System.out.println("El alumno " + nombres[i] + " tiene una nota de: " + notas[i] + " - " + resultados[i]);
        }

    }
}
