package List;

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
