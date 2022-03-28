package com.jesusjoana.recursividad.piRecursivoLambda;

import java.util.*;

public class Principal {

    // InterfaceFuncionalFactorial calculaFactorial = (x) -> {return (x == 0) ? 1 : x * this.calculaFactorial.factorial(x-1);};

    public static void main(String[] args) {
        
        //Necesari crear esta instancia para que el programa funcione.
        Principal calcular = new Principal();

        //Creación de las variables requeridas
        double pi;
        double numeroDePuntosDentro = 0;
        double numeroIteraciones;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el número de iteraciones que desea que se realicen: ");
        numeroIteraciones = entrada.nextDouble();

        //Instanciamos la clase Principal "Principal calcular" para poder llamar a la expresión Lambda.
        numeroDePuntosDentro = calcular.calculaPuntosDentro(numeroIteraciones);

        //Se realiza el cálculo final del número pi.
        pi = 4.0 * (numeroDePuntosDentro/numeroIteraciones);
        System.out.println("El valor obtenido para PI tras " + numeroIteraciones + " iteraciones es: " + pi);
        entrada.close();

    }

    InterfaceFuncionalPi calculaPi = (numeroIteraciones) -> {

        //En esta variable se calcula el numero de veces que, durante la simulación, el punto al azar ha caido dentro del circulo.
        double n = 0;

        //En coordenadaX y en coordenadaY se almacenan las coordenadas de un punto generado aleatoriamente en un cuadrado centrado en el origen de lado 2
        double coordenadaX = 1 - 2 * Math.random();
        double coordenadaY = 1 - 2 * Math.random();

        //En la variable distancia almacenamos la distancia desde el origen hasta este punto aleatorio
        double distancia = Math.sqrt(Math.pow(coordenadaX, 2) + Math.pow(coordenadaY, 2));
        
        //Parte recursiva del metodo. La condicion de salida  de la recursividad es cuando se alcanza el numero de iteraciones preestablecidas.
        if (numeroIteraciones > 0){
            if (distancia <= 1){
                n = this.calculaPuntosDentro(--numeroIteraciones) + 1;
            } else if (distancia > 1){
                n = this.calculaPuntosDentro(--numeroIteraciones) + 0;
            }

        } else if (numeroIteraciones == 0){
            if (distancia <= 1){
                n = 1;
            } else if (distancia < 1){
                n = 0;
            }
        }

        return n;

    };

    public double calculaPuntosDentro(double a){
        return calculaPi.puntoDentro(a);
    }
}
