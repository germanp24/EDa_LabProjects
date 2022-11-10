package Queue;

public class Acciones {
	
	private int nAcciones;
	private int nPAcciones;
	
	public Acciones(int nAcciones,int nPAcciones) {
		this.nAcciones=nAcciones;
		this.nPAcciones=nPAcciones;
	}

	public int getnAcciones() {
		return nAcciones;
	}

	public void setnAcciones(int nAcciones) {
		this.nAcciones = nAcciones;
	}

	public int getnPAcciones() {
		return nPAcciones;
	}

	public void setnPAcciones(int nPAcciones) {
		this.nPAcciones = nPAcciones;
	}
	public String toString() {
		return "Numero de Acciones: "+nAcciones +" y Precio por Acciones: "+nPAcciones;
	}
}
