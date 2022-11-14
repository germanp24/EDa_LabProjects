package List;

/**
 * The "Dictionary" class contains the necessary elements
 * to be able to add both terms and definitions and
 * to check different situations.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

public class Diccionario {

 private String Termino;
 private String Definicion;

/**
 * Diccionario constructor.
 * 
 * @param Termino
 * @param Definicion
 */
	public Diccionario(String Termino,String Definicion ) {
		this.Termino=Termino;
		this.Definicion=Definicion;
	}


/**
 * This function returns the value of the Termino variable
 * 
 * @return The value of the variable Termino.
 */
	public String getTermino() {
		return Termino;
	}


/**
 * This function sets the value of the Termino variable to the value of the Termino variable passed to the function
 * 
 * @param Termino The word to be searched
 */
	public void setTermino (String Termino) {
		this.Termino = Termino;
	}

	
/**
 * This function returns the definition of the word
 * 
 * @return The definition of the word.
 */
	public String getDefinicion() {
		return Definicion;
	}


/**
 * This function sets the value of the variable Definicion to the value of the variable Definicion
 * 
 * @param Definicion The definition of the word
 */
	public void setDefinicion (String Definicion) {
		this.Definicion = Definicion;
	}


/**
 * The toString() method returns the string representation of the object
 * 
 * @return The word and its definition.
 */
	public String toString(){
		return "La palabra del diccionario [ Termino= "+ Termino +", Definicion= "+ Definicion +"]";
	}


/**
 * The function returns true if the object passed as a parameter is equal to the object that called the function
 * 
 * @param ob the object to compare with
 * @return The method returns a boolean value.
 */
	public boolean equal (Object ob) {
		Boolean result = false;
		
		if (ob == null) {
		
		result = false;
		} else if (!(ob instanceof Diccionario)){
			
		result = false;
		} else {
		Diccionario d = (Diccionario) ob;
		
		result = Termino.equals(d.getTermino());
	
		}
		return result;
		}
}