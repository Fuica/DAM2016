package seleccion;

public abstract class Seleccion {
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	//Getters y setters
	public void viajar() {
		System.out.println("Viajar (Clase Padre)");
	}
    
    public void concentrarse() {
		System.out.println("Concentrarse (Clase Padre)");
	}
		
	public void partidoFutbol() {
		System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
	}
        
    public String get_nombre(){ return nombre; }
        
    public String get_apellidos(){ return apellidos; }
	
	// Metodo abstracto que no se implementa en la clase padre pero si obligatoriamente en las clase hijas
	public abstract void entrenamiento();
}