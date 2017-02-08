import java.util.Arrays;
import java.util.Scanner;

public class Ejecicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] valores = new int[5];// declaramos un array dimensionado a 5 posiciones (de la 0 a la 4)
		/*
		 * Este array, incialmente est� vac�o por lo que con el for vamos a hacer que pida 5 valores
		 * que se almacenar�n en el array "valores"
		 */
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Introduzca un valor: ");
			valores[i] = in.nextInt();
			/*
			*con el m�todo "nextInt" vamos almacenando el valor que vamos introduciendo 
			*por pantalla durante 5 veces, es decir hasta que llega a la �ltima posici�n
			*que es el �ltimo valor que guarda.
			*/
			
		}
		/*
		 * Para ordenar los valores de una array, necesitamos dos for. El primero que se 
		 * encargar� de repetir el proceso hasta lelgar a la pen�ltima posici�n y el segundo
		 * que es el que ir� haciendo las comprobaciones a trav�s del if para ir ordenando cada 
		 * posici�n. Recordamos que los for recorren han length-1 porque si por ejemplo tenemos
		 * el pen�ltimo valor 6 el �ltimo 7. La coprobaci�n �ltima ser� del 6 con el 7. Si ponemos
		 * length entonces el if intentar� hacer la comprobaci�n del 7 con un valor en una posici�n
		 * siguiente siendo el 7 ya el valor de la �ltima, nos dar� un error pues no se puede comprobar
		 * con otra posici�n porque no hay otra.
		 */

		for (int i = 0; i < valores.length - 1; i++) {

			for (int f = 0; f < valores.length - 1 - i; f++) {
				/*
				 * Este if, contiene el algoritmo de ordenaci�n que se encarga de ordenar
				 * los valores del array que llenemos con lo valores que introduciones por
				 * pantalla . Del mismo modo que en el ejericio1 se va a ir comrpobando 
				 * la posici�n actual (partiendo de la 0) con la siguiente es decir, si comenzamos
				 * con la posici�n 0 se comprueba con la 0+1 es decir con la 1. Si es mayor la siguiente
				 * posici�n entonces se guarda en una variable auxiliar el valor de la posici�n actual,
				 * y el valor de la siguiente posici�n pasa a guardarse en la posici�n actual. Luego
				 * el valor que fue el de la posici�n actual y que se guard� en la posici�n la variable
				 * auxiliar pasa a la posici�n siguiente.
				 * Un ejemplo: la posici�n 0 tiene el valor 6 y la posici�n 1 el valor 4. Bien, como 
				 * 6(posici�n 0) > 4(posici�n 1) entonces el valor 6 se guarda en la variable aux, y 
				 * en la posici�n 0 que es donde estaba el 6 se guarda el 4. Ahora como previamente 
				 * habiamos guardado el valor 6 en la variable aux, se la pasamos a la posicion 1. De este modo
				 * ahora tenemos que en la posicici�n 0 tenemos el valor 4 y en el la posici�n 1 la 6. Por lo tanto,
				 * valor de la 0 < valor de la posici�n 1 y se ha ordenado esa posici�n.
				 * Este procedimiento se repite hasta llegar al valro pen�ltimo con el �ltimo.
				 */
				if (valores[f] > valores[f + 1]) {

					int aux = valores[f];
					valores[f] = valores[f + 1];
					valores[f + 1] = aux;
				}
			}

		}
		System.out.println(Arrays.toString(valores));
		/*
		*el m�todo toString recordmaos que sirve para recorrer un array  y mostrarlo por
		*pantalla. Este m�todo pertenece a la clase propia de java llamada "Arrays"
		*/

	}

}
