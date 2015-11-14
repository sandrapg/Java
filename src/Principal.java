package principal;

import java.util.Hashtable;
import java.util.Scanner;
/**
 * @author Sandra
 */
public class Principal {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in); // Para poder leer datos
        Catalogo catalogo = new Catalogo(); // Creo un nuevo objeto catalogo
        int opcion = 0;
        
        do{
            // Menu
            System.out.println("1 - Añadir componente.");
            System.out.println("2 - Buscar componente.");
            System.out.println("3 - Eliminar componente.");
            System.out.println("4 - Mostrar componentes.");
            System.out.println("5 - Salir.");
            //Fin menu
          
            //Opcion para escoger
            System.out.print("Que desea hacer? ");
            opcion = read.nextInt(); // Lee la opcion que introduzca el usuario y la guardo
            
            switch(opcion){
                case 1:
                    System.out.print("ID: "); // Pido el ID para el componente que se va a añadir
                    String id = read.next(); // Lee el ID y lo guardo
                    System.out.print("Nombre: "); // Pido el Nombre para el componente que se va a añadir
                    String nombre = read.next(); // Lee el Nombre y lo guardo
                    
                    Componente componente = new Componente(id, nombre); // Creo un nuevo componente
                    catalogo.añadirComponente(componente); // Llamo a la funcion "añadirComponente" pasandole el componente con su id y nombre
                    break; // Fin del caso
                case 2:
                    System.out.print("ID: "); // Pido el ID para el componente que se va a buscar
                    id = read.next(); // Lee el ID y lo guardo
                    Componente c = catalogo.buscarComponente(id); // Guardo en c lo que devuelva la funcion "buscarComponente"
                    if(c!=null){ // Si el componente que ha buscado el usuario esta en el catalogo, muestra los datos de ese componente
                        System.out.println("Los datos son: ");
                        System.out.println("ID: "+c.getId());
                        System.out.println("Nombre: "+ c.getNombre());
                    }else // Si no, avida de que el componente no existe.
                        System.out.println("El componente que se busca no existe.");

                    break;
                case 3:
                    System.out.print("ID: "); // Pido el ID para el componente que se va a eliminar
                    id = read.next(); // Lee el ID y lo guardo
                    catalogo.eliminarComponente(id); // Llamo a la funcion "eliminarComponente" pasandole el id
                    break;
                case 4:
                    System.out.println("_______________");
                    catalogo.mostrarComponentes(); // Llamo a la función "mostrarComponentes"
                    break;
                default: break;
            }
        }while(opcion!=5);
    }
}
