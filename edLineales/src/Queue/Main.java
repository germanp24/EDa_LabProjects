package Queue;

import java.util.Scanner;

public class Main {
	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		int nAcciones = 0;
		int pAcciones = 0;
		int GananciasTotales=0;
		// crear cola y dentro de cada metodo se va modificando esa cola
		QueueDynamic<Acciones> colaAcciones = new QueueDynamic<Acciones>();
		System.out.print("Introduce que operaci�n deseas realizar:\n");
		System.out.println(" 1. Compra acciones");
		System.out.println(" 2. Venta acciones");
		System.out.println(" 3. Ganancia de capital hasta el momento:");
		System.out.println(" 4. Salir");
		int casos = TECLADO.nextInt();
		while (casos > 0) {
			switch (casos) {
			case 1:
				Acciones accion = new Acciones(nAcciones, pAcciones);
				System.out.println("Ha elegido la operaci�n de COMPRAR ACCIONES");
				System.out.println("Introduzca el numero de acciones que desee comprar");
				nAcciones = TECLADO.nextInt();
				accion.setnAcciones(nAcciones);
				System.out.println("A continuaci�n introduzca el precio actual de la acci�n");
				pAcciones = TECLADO.nextInt();
				accion.setnPAcciones(pAcciones);
				colaAcciones.enqueue(accion);
				// metodo de compra de acciones
				System.out.print("Introduzca la operaci�n que desea realizar: ");
				casos = TECLADO.nextInt();

				break;
			case 2:
				System.out.println("Ha elegido la operaci�n de VENDER ACCIONES");
				System.out.println("Introduzca el numero de acciones que desee vender");
				nAcciones = TECLADO.nextInt();

				System.out.println("A continuaci�n introduzca el precio al que quiere vender cada accion");
				pAcciones = TECLADO.nextInt();

				GananciasTotales+=VenderAcciones(colaAcciones, nAcciones, pAcciones);

				// metodo de venta de acciones de acciones
				System.out.print("Introduzca la operaci�n que desea realizar: ");
				casos = TECLADO.nextInt();
				break;
			case 3:
				System.out.println("Ha elegido la operaci�n de Ganancia de capital hasta el momento");
				// Los cambios que se hagan en la opcion 1 y 2 se tienen que actualizar
				// inmediatamente
				// mostrar la ganancia total obtenida hasta ese momento
				System.out.println(GananciasTotales);

				System.out.print("Introduzca la operaci�n que desea realizar: ");
				casos = TECLADO.nextInt();
				break;
			case 4:
				System.out.println("Cerrando programa de inversi�n.");
				System.exit(0);
				break;
			default:
				// falta resolver excepcion para que el programa continue y nos vuelva a pedir
				// introducir numero de operaci�n
				System.out.println("Error, por favor seleccione una de las opciones v�lidas.");
				System.out.print("Introduce que operaci�n deseas realizar:");
				System.out.println(" 1. Compra acciones");
				System.out.println(" 2. Venta acciones");
				System.out.println(" 3. Ganancia de capital hasta el momento:");
				System.out.println(" 4. Salir");
				casos = TECLADO.nextInt();
			}
		}
	}

	

	public static int VenderAcciones(QueueDynamic<Acciones> colaAcciones, int nAcciones, int pAcciones) {
		int venta = 0;

		if (colaAcciones.front().getnAcciones() < nAcciones) {
			Acciones acciones = colaAcciones.dequeue();
			venta += acciones.getnAcciones() * (pAcciones-acciones.getnPAcciones());
			nAcciones = nAcciones - acciones.getnAcciones();
			venta +=VenderAcciones(colaAcciones, nAcciones, pAcciones);
		}else if(colaAcciones.front().getnAcciones() == nAcciones) {
			Acciones acciones = colaAcciones.dequeue();
			venta += acciones.getnAcciones() * (pAcciones-acciones.getnPAcciones() );
		}else {
			Acciones acciones = colaAcciones.front();
			acciones.setnAcciones( acciones.getnAcciones()-nAcciones);
			venta += nAcciones * (pAcciones-acciones.getnPAcciones());
		}

		return venta;
	}
}
