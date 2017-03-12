package seleccion;

public class Futbolista extends Seleccion {
	private int dorsal;
	private String demarcacion;
        
        //Constructor
        public Futbolista (int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.dorsal = dorsal;
            this.demarcacion = demarcacion;
        }

        //Implementacion de metodo abstracto de la clase seleccion
	@Override
	public void entrenamiento() {
            System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}
	
	@Override
	public void partidoFutbol() {
            System.out.println("Juega un Partido (Clase Futbolista)");
	}
	
	public void entrevista() {
            System.out.println("Da una Entrevista (Clase Futbolista)");
	}
}