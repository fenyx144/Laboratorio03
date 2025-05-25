import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegracionEjemplos {
    public static void main(String[] args) {
        // 1. ArrayList de alumnos
        ArrayList<String> alumnos = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        
        alumnos.add("MARIA");
        alumnos.add("DIEGO");
        alumnos.add("RENE");
        alumnos.add("ALONSO");
        
        System.out.println("---- ArrayList de alumnos ----");
        System.out.println("HashCode: " + alumnos.hashCode());
        System.out.println("¿Está vacío?: " + alumnos.isEmpty());
        System.out.println("Tamaño: " + alumnos.size());
        System.out.println();
        
        // 2. Iterador para recorrer la lista de alumnos
        System.out.println("---- Recorrido con Iterator ----");
        Iterator<String> itA = alumnos.iterator();
        while (itA.hasNext()) {
            System.out.println(itA.next());
        }
        System.out.println();
        
        // 3. Creación de objetos Animal y uso de ArrayList con objetos
        System.out.println("---- ArrayList de objetos Animal ----");
        ArrayList<Animal> mascotas = new ArrayList<Animal>();
        // List<Animal> mascotas2 = new List<Animal>(); // Esto daría error porque List es una interfaz
        List<Animal> mascotas2 = new ArrayList<Animal>(); // Forma correcta
        
        // Agregar algunos animales a la lista
        mascotas.add(new Animal("Firulais", true));
        mascotas.add(new Animal("Luna", false));
        mascotas.add(new Animal("Rex", true));
        
        // Mostrar los animales
        System.out.println("Mascotas en la lista:");
        for (Animal animal : mascotas) {
            System.out.println("Nombre: " + animal.getNombre() + 
                              ", Género: " + (animal.isGenero() ? "Macho" : "Hembra"));
        }
    }
}

class Animal {
    String nombre;
    boolean genero;
    
    public Animal(String nombre, boolean genero) {
        super();
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean isGenero() {
        return genero;
    }
    
    public void setGenero(boolean genero) {
        this.genero = genero;
    }
}