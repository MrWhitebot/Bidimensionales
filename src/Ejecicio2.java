import java.util.Arrays;
import java.util.Scanner;

public class Ejecicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] valores = new int[5];// declaramos un array dimensionado a 5 posiciones (de la 0 a la 4)
		/*
		 * Este array, incialmente está vacío por lo que con el for vamos a hacer que pida 5 valores
		 * que se almacenarán en el array "valores"
		 */
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Introduzca un valor: ");
			valores[i] = in.nextInt();
			/*
			*con el método "nextInt" vamos almacenando el valor que vamos introduciendo 
			*por pantalla durante 5 veces, es decir hasta que llega a la última posición
			*que es el último valor que guarda.
			*/
			
		}
		/*
		 * Para ordenar los valores de una array, necesitamos dos for. El primero que se 
		 * encargará de repetir el proceso hasta lelgar a la penúltima posición y el segundo
		 * que es el que irá haciendo las comprobaciones a través del if para ir ordenando cada 
		 * posición. Recordamos que los for recorren han length-1 porque si por ejemplo tenemos
		 * el penúltimo valor 6 el último 7. La coprobación última será del 6 con el 7. Si ponemos
		 * length entonces el if intentará hacer la comprobación del 7 con un valor en una posición
		 * siguiente siendo el 7 ya el valor de la última, nos dará un error pues no se puede comprobar
		 * con otra posición porque no hay otra.
		 */

		for (int i = 0; i < valores.length - 1; i++) {

			for (int f = 0; f < valores.length - 1 - i; f++) {
				/*
				 * Este if, contiene el algoritmo de ordenación que se encarga de ordenar
				 * los valores del array que llenemos con lo valores que introduciones por
				 * pantalla . Del mismo modo que en el ejericio1 se va a ir comrpobando 
				 * la posición actual (partiendo de la 0) con la siguiente es decir, si comenzamos
				 * con la posición 0 se comprueba con la 0+1 es decir con la 1. Si es mayor la siguiente
				 * posición entonces se guarda en una variable auxiliar el valor de la posición actual,
				 * y el valor de la siguiente posición pasa a guardarse en la posición actual. Luego
				 * el valor que fue el de la posición actual y que se guardó en la posición la variable
				 * auxiliar pasa a la posición siguiente.
				 * Un ejemplo: la posición 0 tiene el valor 6 y la posición 1 el valor 4. Bien, como 
				 * 6(posición 0) > 4(posición 1) entonces el valor 6 se guarda en la variable aux, y 
				 * en la posición 0 que es donde estaba el 6 se guarda el 4. Ahora como previamente 
				 * habiamos guardado el valor 6 en la variable aux, se la pasamos a la posicion 1. De este modo
				 * ahora tenemos que en la posicición 0 tenemos el valor 4 y en el la posición 1 la 6. Por lo tanto,
				 * valor de la 0 < valor de la posición 1 y se ha ordenado esa posición.
				 * Este procedimiento se repite hasta llegar al valro penúltimo con el último.
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
		*el método toString recordmaos que sirve para recorrer un array  y mostrarlo por
		*pantalla. Este método pertenece a la clase propia de java llamada "Arrays"
		*/

	}

}
