package Queue;
import java.util.Scanner;

public class Main {
final static Scanner TECLADO = new Scanner(System.in);
	public static void main(String[] args) {
		//crear cola y dentro de cada metodo se va modificando esa cola
		System.out.print("Introduce que operación deseas realizar:\n");
		System.out.println(" 1. Compra acciones");
		System.out.println(" 2. Venta acciones");
		System.out.println(" 3. Ganancia de capital hasta el momento:");
		System.out.println(" 4. Salir");
		int casos=TECLADO.nextInt();
		while (casos>0){
			switch(casos) {
				case 1: 
					System.out.println("Ha elegido la operación de COMPRAR ACCIONES");
					//System.out.println("Introduzca el numero de acciones que desee comprar");
					//System.out.println("A continuación introduzca el precio actual de la acción");
					//metodo de compra de acciones
					System.out.print("Introduzca la operación que desea realizar: ");
					casos=TECLADO.nextInt();

				break;
				case 2:
					System.out.println("Ha elegido la operación de VENDER ACCIONES");
					//System.out.println("Introduzca el numero de acciones que desee comprar");
					//System.out.println("A continuación introduzca el precio actual de la acción");
					//metodo de venta de acciones de acciones
					System.out.print("Introduzca la operación que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 3:
					System.out.println("Ha elegido la operación de Ganancia de capital hasta el momento");
					// Los cambios que se hagan en la opcion 1 y 2 se tienen que actualizar inmediatamente
					// mostrar la ganancia total obtenida hasta ese momento
					System.out.print("Introduzca la operación que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 4:
					System.out.println("Cerrando programa de inversión.");
					System.exit(0);
                break;
				default:
					// falta resolver excepcion para que el programa continue y nos vuelva a pedir introducir numero de operación
					System.out.println("Error, por favor seleccione una de las opciones válidas.");
					System.out.print("Introduce que operación deseas realizar:");
					System.out.println(" 1. Compra acciones");
					System.out.println(" 2. Venta acciones");
					System.out.println(" 3. Ganancia de capital hasta el momento:");
					System.out.println(" 4. Salir");
					casos=TECLADO.nextInt();
			}
		}
	}
}

	 