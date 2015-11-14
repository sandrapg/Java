
package principal;

/**
 * @author Sandra
 */
public class Componente {
    // Declaracion de atributos
    private String id;
    private String nombre;
    // Fin atributos
    
    // Constructor
    public Componente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    // Fin constructor
    
    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Fin Getters & Setters
    
    
}
