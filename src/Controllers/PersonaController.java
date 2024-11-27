package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 * 
 * 
 * Generar los metdoos necesarions para ordenar un array de personas por edad en
 * orden descendente
 * y para la busqueda binaria de una persona por edad.
 * 
 */
public class PersonaController {
    Persona persona;

    public Persona [] sortAgeBySelection (Persona[] personas){
        for (int i = 0; i < personas.length; i++){
            int key = i;
            for (int j = i + 1; j < personas.length; j++){
                if (personas[j].getEdad() > personas[key].getEdad()){
                    key = j;
                }
            }
            Persona aux = personas[key];
            personas[key] = personas[i];
            personas[i] = aux;
        }
        return personas;
    }

    public Persona[] sortNameByInsertion (Persona[] personas){
        for(int i = 1; i < personas.length; i++){
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && personas[j].getNombre().compareTo(aux.getNombre()) > 0){
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
        return personas;
    }

    public int binarioEdad(Persona[] personas, int datoBuscar){
        int inicio = 0;
        int fin = personas.length - 1;
        while (inicio <= fin){
            int mid = (inicio + fin) / 2;
            if(personas[mid].getEdad() == datoBuscar){
                return mid;
            }
            if(personas[mid].getEdad() > datoBuscar){
                inicio = mid + 1;
            }
            if (personas[mid].getEdad() < datoBuscar){
                fin = mid - 1;
            }
        }
        return -1;
    }

    public int binarioNombre(Persona[] personas, String datoBuscar){
        int inicio = 0;
        int fin = personas.length - 1;
        while (inicio <= fin){
            int mid = (inicio + fin) / 2;
            if(personas[mid].getNombre().compareTo(datoBuscar) == 0){
                return mid;
            }
            if(personas[mid].getNombre().compareTo(datoBuscar) < 0){
                inicio = mid + 1;
            }
            if (personas[mid].getNombre().compareTo(datoBuscar) > 0){
                fin = mid - 1;
            }
        }
        return -1;
    }


    public void printArreglo(Persona[] personas){
        for(Persona persona : personas){
            System.out.println("Nombre: " + persona.getNombre() + "  Edad: " + persona.getEdad());
        }
    }

    public void printObjeto(Persona[] personas ,int edadBuscar){
        System.out.println("Nombre: " + personas[edadBuscar].getNombre() + "  Edad: " + personas[edadBuscar].getEdad());
    }

    public void validacion(Persona[] personas,int resultado){
        if (resultado == -1){
            System.out.println("El dato ingresado no se encuentra en el arreglo :/");
     } else {
            System.out.println("El dato ingresado se encuentra en la posicion " + resultado + " y corresponde a la persona: ");
            printObjeto(personas, resultado);
     }
    }


    public void programa1(Persona[] personas){
                sortAgeBySelection(personas);
                int resultado = binarioEdad(personas, 25);
                int resultado2 = binarioEdad(personas, 70);
                System.out.println("Edad a buscar 25:");
                validacion(personas, resultado);
                System.out.println("Edad a buscar 70: ");
                validacion(personas, resultado2);

                System.out.println("");
                System.out.println("");

                sortNameByInsertion(personas);
                int resultado3 = binarioNombre(personas, "Anais");
                int resultado4 = binarioNombre(personas, "Miguel");
                System.out.println("Nombre a bucar Anais: ");
                validacion(personas, resultado3);
                System.out.println("Nombre a buscar Miguel:");
                validacion(personas, resultado4);
    }
}
