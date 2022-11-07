package pila;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private int edad;
	
	
	//Constructor
	public Persona (String nombre, int edad) {
		
		this.nombre=nombre;
		this.edad=edad;
		
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	@Override
	public int compareTo(Persona persona) {
		
		int a = edad - persona.getEdad();
		
		return a;
		
	}
	
	public String toString() {
		
		return "Nombre: " + getNombre() + ", edad: " + getEdad();
	}
	
	
	

	
}
