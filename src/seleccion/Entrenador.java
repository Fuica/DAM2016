package seleccion;

/*
Clase Entrenador
@author Ernesto Raposo
@version 1.0
@since 01/01/2017

*/


public class Entrenador extends Seleccion {
	private int idFederacion;
	
        //Constructor
        public Entrenador (int id, String nombre, String apellidos, int edad, int idFederacion) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.idFederacion = idFederacion;
        }
        
        //Implementacion de metodo abstracto de la clase seleccion
	@Override
	public void entrenamiento() {
            System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	}
	
	@Override
	public void partidoFutbol() {
            System.out.println("Dirige un Partido (Clase Entrenador)");
	}
	
	public void planificarEntrenamiento() {
            System.out.println("Planificar un Entrenamiento (Clase entrenador)");
	}
}