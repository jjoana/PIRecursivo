package com.jesusjoana.recursividad.piIterativoLambda;

import java.util.*;

public class Principal {

    public static void main (String[] args){

        long numeroIteraciones;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el número de iteraciones para realizar el cálculo: ");
        numeroIteraciones = entrada.nextLong();
        entrada.nextLine();

        //Expresion Lambda iterativa
        InterfaceFuncionalPI numeroPi = (long pasos) ->{

            double pi;
            //Variable utilizada para contar el número de puntos que caen dentro del círculo
            double dentroCirculo=0;
            //Variable para ir contando los puntos que caen en el cuadrado (fuera del círculo)
            double dentroCuadrado=0;
            //Constante que establece el area de un cuadrado de lado 2
            final double areaCuadrado = 4;
            //Variable que establece la coordenada x del punto aleatorio 
            double coordenadaX;
            //Esta variable sirve para establecer la coordenada y del punto aleatorio
            double coordenadaY;
            //Esta variable sirve para almacenar el valor del número Pi
    
            // Bucle principal del modelo de MonteCarlo
            for (int i=0; i< pasos; i++){
                coordenadaX = 1 - 2 * Math.random();
                coordenadaY = 1 - 2 * Math.random();
    
                if (Math.sqrt(Math.pow(coordenadaX , 2) + Math.pow(coordenadaY, 2)) <= 1){
                    dentroCirculo++;
                } 
                dentroCuadrado++;
            }
            pi = areaCuadrado * (dentroCirculo/dentroCuadrado);
            return pi;
        };
        System.out.println("El número PI es " + numeroPi.generarNumeroPi(numeroIteraciones));
        entrada.close();



        //Expresión Lambda recursiva.



        


    }
    
}
