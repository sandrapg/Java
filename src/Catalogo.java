
package principal;

import java.util.Hashtable;

/**
 * @author Sandra
 */
public class Catalogo {
    private Hashtable<String,Componente> contenedor = new Hashtable<String,Componente>();
    // Creo la hastable con el nombre "contenedor" y le digo que va a tener un String y un tipo Componente.
    
    // Métodos
    public void añadirComponente(Componente componente){
        
        if(contenedor.containsKey(componente.getId())==false){ // Si el componente no está en el catalogo, 
            contenedor.put(componente.getId(), componente); // añade el componente
            System.out.println("El componente ha sido añadido correctamente.");
        }else //Si el componente esta en el catalogo quiere decir que el componente ya existe.
            System.out.println("El componente ya existe.");
        
    }
    
    public Componente buscarComponente(String id){
        if(contenedor.containsKey(id)){ // Si el componente está en el catalogo, 
            return contenedor.get(id); // devuelve el id
        }else //sino, 
            return null; // devuelve null
    }
    
    public void eliminarComponente(String id){
        if(contenedor.containsKey(id)){ // Si el componente está en el catalogo, 
            contenedor.remove(id); // lo elimina
            System.out.println("Componente eliminado con exito.");
        }else //sino, 
            System.out.println("El componente no existe."); // el componente no se puede eliminar porque no existe.

    }
    
    public void mostrarComponentes(){
      for (String id:contenedor.keySet()){ // Para cada id del catalogo,
            System.out.println(contenedor.get(id).getId()+" -> "+contenedor.get(id).getNombre());
            System.out.println("_______________");
            
        }
    }
    
    // Fin métodos.
}
