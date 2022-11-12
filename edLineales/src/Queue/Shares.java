package Queue;

/**
 * The "Shares" class will be used to perform the operation of a static queue,
 * it implements the "Queue" interface, used as a template for this class.
 * 
 * In this class the different methods that will make possible its correct
 * operation will be defined and developed.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version 1.0
 */

public class Shares {
	
	private int nShares;
	private int nPShares;
	
	public Shares(int nShares,int nPShares) {
		this.nShares=nShares;
		this.nPShares=nPShares;
	}

	public int getnShares() {
		return nShares;
	}

	public void setnShares(int nShares) {
		this.nShares = nShares;
	}

	public int getnpShares() {
		return nPShares;
	}

	public void setnpShares(int nPShares) {
		this.nPShares = nPShares;
	}

	public String toString() {
		return "Numero de Acciones: " + nShares + " y Precio por Acciones: " + nPShares;
	}
}