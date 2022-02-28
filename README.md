# Practica2
> Esta práctica consiste en la obtención del número Pi mediante el método de Montecarlo y aplicando un algoritmo recursivo.
> El método de Montecarlo es un método no determinista o estadístico numérico, usado para aproximar expresiones matemáticas complejas y costosas con exactitud.
> El método se llamó así en referencia al Casino de Montecarlo (Mónaco) por ser "capital"del juego del azar, al ser la ruleta un generador simple de números aleatorios.
> El nombre y el desarrollo sistemático de los métodos de Montecarlo datan aproximadamente de 1944 y se mejoraron enormemente con el desarrollo de la computadora.
[descripción método de Montecarlo en wikipedia ](https://es.wikipedia.org/wiki/Método_de_Montecarlo)

## Forma de utilizar este programa 
> Para ejecutar este problema debo escribir el siguiente comando en el terminal.

	java -cp /home/jesus/PIRecursivo/target/classes com.jesusjoana.recursividad.App 

> El número de iteraciones que realizará el programa lo pide el mismo programa una vez se lanza.

> El máximo número de iteraciones permitidas es alrededor de 4000, si se supera este número de llamadas recursivas se produce desbordamiento de pila, al menos en mi ordenador.
> El programa no cuenta con control de excepciones para el caso en que el número de iteraciones introducidas por el usuario sea mayor que ese número.


## Analisis de complejidad del método empleado
> La complejidad del algoritmo utilizado en este programa es "Complejidad (0) = n+1".
> Es una complejidad buena y también muy usual.
[enlace a análisis de complejidad](https://www.youtube.com/watch?v=fPc5-Cmztxc)