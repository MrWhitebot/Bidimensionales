
public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejemplos: el primero deber�a devolver que Hay Escalera mientras que
		// el segundo no
		int[] cartas1 = { 3, 4, 5, 6, 7 };
		int[] cartas2 = { 3, 5, 6, 7, 8 };
		boolean esEscalera = true;
		/*
		 * Este ejercicio es parecido al 1. Lo que tenemos que hacer es que compruebe 
		 * si cartas1 o cartas2 tiene valores consecutivos. No tiene que por qu� empezar 
		 * desde 1 solo tienen que ser consecutivos. Es decir, por ejemplo 
		 * 3,4,5,6,7... que solo se aumente una unidad. Si solo se aumenta en una unidad, entonces
		 * se debe de mostrar el mensaje de que hay escalera como en cartas1 y si no entonces el
		 * mensaje de que no hay escalera como e cartas2 (ya que del 3 al 5 hay dos unidades y 
		 * por tanto no es un array de valores consecutivos)
		 * De nuevo establecemos como en el ejercicio 1, que incialmente la variable esEscalera
		 * sea true (cuandoe est� true entonce se mostrar� el mensaje "hay escalera" ). Entonces,
		 * vamos a comprobar si no hay escalera es decir si es false. Por lo tanto si no es false
		 * es true y se muestra el mensaje de hay escalera pero si es false se muestra el de 
		 * no hay escalera. Por eso establecemos inicialmente como true la variable porque solo vamos
		 * a hacer la comprobaci�n de cuando no tengmaos escaleras pues si no tenemos escalera es que 
		 * tenemos escalera.
		 * Para ello, de nuevo tenemos un for que recorrer� todas las posiciones del array.
		 * F�jate que esta vez no ponemos length-1 porque no estamos haciendo i+1 en el if es decir
		 * nunca vamos a excedernos de la �ltima posici�n del array.
		 */
		for (int i = 1; i < cartas2.length; i++) {
			if ((cartas2[i] - 1) != cartas2[i - 1]) {
				esEscalera=false;
			}

		}
		/*
		 * El if, se encarga de comprobar si los valores de cada posici�n son consecutivos, 
		 * es decir que aumentan solo en una unidad.(OJO HAY QUE FIJARSE BIEN
		 * PORQUE [I]-1 NO ES LO MISMO QUE [I-1], LO PRIMERO INDICA QUE ES EL VALOR DE LA 
		 * POSICI�N  - 1 UNDIAD ES DECIR SI ESTAMOS EN LA POSICI�N 0 ENTONCES PARA CARTAS1
		 * EL VALOR ES 3-1=2, EN CAMBIO EN [I-1] ESTAMOS DICIENDO QUE SEA LA POSICI�N ACTUAL
		 * -1 ES DECIR SI LA POSICI�N ACTUAL ES 1 CUYO VALOR EN CARTAS1 ES 4 ENTONCES QUE SE
		 * VAYA LA POSICI�N 0 CUYO VALOR ES 3. ES DECIR SE RESTA UNA POSICI�N Y NO UNA UNIDAD AL VALOR DE ESA
		 * POSICI�N)
		 * Una vez entendido esto entonces la coprobaci�n ir�a de la siguiente forma:
		 * vamos a coger en este caso cartas 2 por ejemplo. Imaginemos que estamos en la 
		 * posici�n 3 que para cartas 2 es 7, bien entonces decimos que si 7-1= 6  distinto 
		 * a la posici�n anterior a la 3 es decir si es menor al valor de la posici�n
		 * 2 entonces no ser� consecutivo y se almacenar� false en la variable true.
		 * La explicaci�n es que si una cadena de valores es consecutiva es decir 1,2,3,4,5,etc
		 * entonces si cogemos una dos posiciones consecutivas por ejemplo la 4  y la 5 y 
		 * le restamos a la la mayor que es 5 una unidad 1 entonces ser�n iguales(4=5-1)
		 */

		System.out.println(esEscalera ? "Hay Escalera" : "No hay Escalera");
		/*
		 * Este print es un tipo de impresi�n de la variable que ha almacenado la variable
		 * "esEscalera" entonces si se mantiene el true se imprimir� lo que est� a la izquierda
		 * de los dos puntos "hay escalera" y se almacena true porque se cumple la condici�n del
		 * if entonces meustra loq ue est� a la derecha ("No hay Escalera). El "?" lo que hace es 
		 * especificar que hay dos opciones cada una asignada  a un valor true y otra a un false.
		 */
	}

}
