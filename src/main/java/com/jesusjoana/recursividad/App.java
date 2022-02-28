/*
Copyright [2022] [Jesús Joana Azuara]
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
		You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.06 
    Unless required by applicable law or agreed to in writing, software
    distributed Jesús Joana Azuarastributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
	  limitations under the Licene.
*/

package com.jesusjoana.recursividad;

/**
	* Clase que permite calcular el número Pi de manera recursiva y mediante el metodo de Montecarlo.
	* Es una aproximación más o menos precisa, en función del número de iteraciones que realicemos.
*/
public class App 
{
    public static void main( String[] args )
    {

        double pi;
        double numeroDePuntosDentro = 0;
        double numeroIteraciones = 4500;
        numeroDePuntosDentro = puntoDentro(numeroIteraciones);
        pi = 4.0 * (numeroDePuntosDentro/numeroIteraciones);
        System.out.println("El número de puntos dentro es:" + numeroDePuntosDentro);
        System.out.println("El valor de PI para " + numeroIteraciones + " iteraciones es: " + pi);
    }

    /**
	    * Método recursivo que implementa el método de Montecarlo, se le pasa por parámetro el número de iteraciones
	    * que vamos a realizar a la hora de calcular el número Pi
	    * @param numeroIteraciones Nº de iteraciones.
	    * @return n
    */
    public static double puntoDentro(double numeroIteraciones){

        //En esta variable se calcula el numero de veces qeu el punto al azar cae dentro del circulo
        double n = 0;
        //En coordenadaX y en coordenadaY se almacenan las coordenadas de un punto generado aleatoriamente en un cuadrado centrado en el origen de lado 2
        double coordenadaX = 1 - 2 * Math.random();
        double coordenadaY = 1 - 2 * Math.random();
        //En la variable distancia almacenamos la distancia desde el origen hasta este punto aleatorio
        double distancia = Math.sqrt(Math.pow(coordenadaX, 2) + Math.pow(coordenadaY, 2));
        
        //Parte recursiva del metodo. La condicion de salida  de la recursividad es cuando se alcanza el numero de iteraciones preestablecidas
        if (numeroIteraciones > 0){
            if (distancia <= 1){
                n = puntoDentro(--numeroIteraciones) + 1;
            } else if (distancia > 1){
                n = puntoDentro(--numeroIteraciones) + 0;
            }

        } else if (numeroIteraciones == 0){
            if (distancia <= 1){
                n = 1;
            } else if (distancia < 1){
                n = 0;
            }
        }

        return n;
	}
}
