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
 String Termino;
String Definicion;
	public Diccionario(String Termino,String Definicion ) {
		this.Termino=Termino;
		this.Definicion=Definicion;
	}
	//Getter and Setter
	public String getTermino() {
		return Termino;
	}
	public void setTermino (String Termino) {
		this.Termino = Termino;
	}
	public String getDefinicion() {
		return Definicion;
	}
	public void setDefinicion (String Definicion) {
		this.Definicion = Definicion;
	}
	public String toString(){
		return "La palabra del diccionario [ Termino= "+ Termino +", Definicion= "+ Definicion +"]";
	}
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