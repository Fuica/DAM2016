package seleccion;

import java.util.*;

public class prueba_seleccion {
	    
    public static void main(String[] args) {
        
        // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
        ArrayList<Seleccion> integrantes = new ArrayList<Seleccion>();

        Seleccion delBosque = new Entrenador(1,"Vicente","Del Bosque",60,28489);
        Seleccion iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Seleccion raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
        
        //Añadimos objetos al ArrayList
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
        
        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (Seleccion integrante : integrantes) {
            System.out.print(integrante.get_nombre() + " " + integrante.get_apellidos() + " -> ");
            integrante.concentrarse();
        }
        
        //Recorrido de Arraylist alternativo
        //for(int i=0; i<integrantes.size();i++) {
        //   System.out.print(integrantes.get(i).get_nombre() + " " + integrantes.get(i).get_apellidos() + " -> ");
        //}     
        
        // VIAJE
        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (Seleccion integrante : integrantes) {
             System.out.print(integrante.get_nombre() + " " + integrante.get_apellidos() + " -> ");
            integrante.viajar();
        }
        
        // ENTRENAMIENTO
        System.out.println("Entrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (Seleccion integrante : integrantes) {
            System.out.print(integrante.get_nombre() + " " + integrante.get_apellidos() + " -> ");
            integrante.entrenamiento();
        }
        
        // PARTIDO DE FUTBOL
        System.out.println("Partido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (Seleccion integrante : integrantes) {
            System.out.print(integrante.get_nombre() + " " + integrante.get_apellidos() + " -> ");
            integrante.partidoFutbol();
        }
        
        System.out.println("Prueba acceso directo: ");
        System.out.println(integrantes.get(1).get_nombre());
    }
}