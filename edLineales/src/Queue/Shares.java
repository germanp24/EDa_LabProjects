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

/**
 * The constructor of the class, it is used to initialize the variables of the class.
 */	
	public Shares(int nShares,int nPShares) {
		this.nShares=nShares;
		this.nPShares=nPShares;
	}

/**
 * > This function returns the number of shares of the stock
 * 
 * @return The number of shares.
 */
 	public int getnShares() {
		return nShares;
	}

/**
 * This function sets the number of shares of the stock
 * 
 * @param nShares The number of shares to buy or sell.
 */
	public void setnShares(int nShares) {
		this.nShares = nShares;
	}

/**
 * This function returns the number of preferred shares
 * 
 * @return The number of preferred shares.
 */
	public int getnpShares() {
		return nPShares;
	}

/**
 * This function sets the number of shares of the stock
 * 
 * @param nPShares The number of shares that the player has.
 */
	public void setnpShares(int nPShares) {
		this.nPShares = nPShares;
	}

/**
 * The function `toString()` returns a string representation of the object
 * 
 * @return The number of shares and the price per share.
 */
	public String toString() {
		return "Numero de Acciones: " + nShares + " y Precio por Acciones: " + nPShares;
	}
}