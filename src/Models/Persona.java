package Models;

/**
 * 
 * Clase Persona que representa una entidad Persona con atributos para nombre y
 * edad.
 */
public class Persona {
    // Atributos de la clase
    String nombre; // Almacena el nombre de la carro
    int edad; // Almacena la edad de la carro

    /**
     * Constructor para crear una nueva instancia de Persona con un nombre y edad
     * específicos.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Asigna el nombre pasado al atributo nombre de la clase
        this.edad = edad; // Asigna la edad pasada al atributo edad de la clase
    }

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

    

}