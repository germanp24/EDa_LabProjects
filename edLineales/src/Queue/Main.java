package Queue;

import java.util.Scanner;

/**
 * The "Main" class is the class from which we are going to carry out the main functionality
 * of the program, using the previously created classes and according to the provided statement.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version: 1.0
 */

public class Main {
	final static Scanner KEYBOARD = new Scanner(System.in);

	/**
	 * Method containing the main execution of our program.
	 * @param args String[]
	 */
	public static void main(String[] args) {
		int nShares = 0;
		int pShares = 0;
		int TotalEarnings = 0;
		// crear cola y dentro de cada metodo se va modificando esa cola
		QueueDynamic<Shares> QueueShares = new QueueDynamic<Shares>();
		System.out.print("Introduce que operacion deseas realizar:\n");
		System.out.println(" 1. Compra acciones");
		System.out.println(" 2. Venta acciones");
		System.out.println(" 3. Ganancia de capital hasta el momento:");
		System.out.println(" 4. Salir");
		int casos = KEYBOARD.nextInt();
		while (casos > 0) {
			switch (casos) {
			case 1:
				Shares share = new Shares(nShares, pShares);
				System.out.println("Ha elegido la operacion de COMPRAR ACCIONES");
				System.out.println("Introduzca el numero de acciones que desee comprar");
				nShares = KEYBOARD.nextInt();
				share.setnShares(nShares);
				System.out.println("A continuacion introduzca el precio actual de la accion");
				pShares = KEYBOARD.nextInt();
				share.setnpShares(pShares);
				QueueShares.enqueue(share);
				// metodo de compra de acciones
				System.out.print("Introduzca la operacion que desea realizar: ");
				casos = KEYBOARD.nextInt();

				break;
			case 2:
				System.out.println("Ha elegido la operacion de VENDER ACCIONES");
				System.out.println("Introduzca el numero de acciones que desee vender");
				nShares = KEYBOARD.nextInt();

				System.out.println("A continuacion introduzca el precio al que quiere vender cada accion");
				pShares = KEYBOARD.nextInt();

				TotalEarnings+=VenderAcciones(QueueShares, nShares, pShares);

				// metodo de venta de acciones de acciones
				System.out.print("Introduzca la operacion que desea realizar: ");
				casos = KEYBOARD.nextInt();
				break;
			case 3:
				System.out.println("Ha elegido la operacion de Ganancia de capital hasta el momento");
				// Los cambios que se hagan en la opcion 1 y 2 se tienen que actualizar
				// inmediatamente
				// mostrar la ganancia total obtenida hasta ese momento
				System.out.println(TotalEarnings);

				System.out.print("Introduzca la operacion que desea realizar: ");
				casos = KEYBOARD.nextInt();
				break;
			case 4:
				System.out.println("Cerrando programa de inversion.");
				System.exit(0);
				break;
			default:
				// falta resolver excepcion para que el programa continue y nos vuelva a pedir
				// introducir numero de operacion
				System.out.println("Error, por favor seleccione una de las opciones validas.");
				System.out.print("Introduce que operacion deseas realizar:");
				System.out.println(" 1. Compra acciones");
				System.out.println(" 2. Venta acciones");
				System.out.println(" 3. Ganancia de capital hasta el momento:");
				System.out.println(" 4. Salir");
				casos = KEYBOARD.nextInt();
			}
		}
	}

/**
 * This function takes a queue of shares, the number of shares to sell, and the price of the shares, and returns the amount of
 * money made from selling the shares
 * 
 * @param colaAcciones QueueDynamic<Shares>
 * @param nShares number of shares to sell
 * @param pShares the price of the shares
 * @return The amount of money that the investor has earned.
 */
	public static int VenderAcciones(QueueDynamic<Shares> colaAcciones, int nShares, int pShares) {
		int venta = 0;

		if (colaAcciones.front().getnShares() < nShares) {
			Shares acciones = colaAcciones.dequeue();
			venta += acciones.getnShares() * (pShares-acciones.getnpShares());
			nShares = nShares - acciones.getnShares();
			venta +=VenderAcciones(colaAcciones, nShares, pShares);
		}else if(colaAcciones.front().getnShares() == nShares) {
			Shares acciones = colaAcciones.dequeue();
			venta += acciones.getnShares() * (pShares-acciones.getnpShares() );
		}else {
			Shares acciones = colaAcciones.front();
			acciones.setnShares( acciones.getnShares()-nShares);
			venta += nShares * (pShares-acciones.getnpShares());
		}
		return venta;
	}
}