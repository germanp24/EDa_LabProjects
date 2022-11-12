package Queue;

/**
 * The "Shares" class will contain the elements related to the shares
 * that we will handle during the execution of the program.
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