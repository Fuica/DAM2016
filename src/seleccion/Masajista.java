package seleccion;

public class Masajista extends Seleccion {
	private String titulacion;
	private int aniosExperiencia;
        
        //Constructor
        public Masajista (int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.titulacion = titulacion;
            this.aniosExperiencia = aniosExperiencia;
        }

        //Implementacion de metodo abstracto de la clase seleccion
	@Override
	public void entrenamiento() {
            System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}
        
        @Override
	public void partidoFutbol() {
            System.out.println("Da un masaje (Clase Masajista)");
	}
        
	public void darMasaje() {
            System.out.println("Da un Masaje (Clase Masajista)");
	}
}