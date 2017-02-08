
public class Ejercicio1 {

	public static void main(String[] args) {
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isSort = true;
		for (int i = 0; i < listado2.length - 1; i++) {
			if (listado2[i] > listado2[i + 1]) {
				isSort = false;
			}
			/*Nota: "i" es el índice del array e sdecir la posición (en estos arrays, 
			 * las posiciones van de la 0 a la 6). Cada posición almacena un valor.
			 * Para saber si un array está ordenado o no sin usar la función sort,
			 * creamos un for for que recorra nuestro array pero hasta la posición
			 * penúltima porque por ejemplo en el listado1, al llegar al 5 queremos
			 * que se compare con 7 y al hacer la comprobación no es necesario comparar
			 * el 7 con otra posición porque no hay otra por encima y nos daría error.
			 * El if del for lo que hace es comprobar desde la posición 0 (para listado1
			 *  es el 6 y para listado2 el 1) hasta la penúltima posición
			 * (que en listado 1 es el valor 5 y en el listado 2 el valor 6). De tal modo,
			 * se dice que si el valor de la posición 0 es mayor qu el de la siguiente 
			 * posición (i+1) entonces que se almacene en la variable isSort (falso) es decir,
			 * que no está ordenado. Así se va comprobando hasta que llega en el caso de listado 1
			 * al 5 que se compara con el 7 y en listado 2 que se compara el 6 con el 7.
			 *El listado1 como se puede apreciar, está desordenado y por tanto se guardará false
			 *En cambio el listado2, está ordenado pues [i] siempre es menor que [i+1]. De este modo,
			 *en la variable isSort se queda po defecto el true de que si está ordenado.
			 *Luego se hace un if/else que mostrará por pantalla un mensaje u otro dependiendo
			 *del resultado de la variable isSort.
			 *Por última, para comprobar un array u otro basta con que sustituyamos el nombre del array
			 *del for y del if por el del otro.
			 */
		}
			if (isSort==false)
				System.out.println("El vector NO está ordenado");
				
			else
				System.out.println("El vector está ordenado");
		

	}
}
