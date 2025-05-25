import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase para probar la implementación de CustomList
 */
public class CustomListTest {
    public static void main(String[] args) {
        // Crear una lista personalizada de enteros
        CustomList<Integer> numeros = new CustomList<>();
        
        // Probar método add
        System.out.println("---- Método add ----");
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Lista después de agregar elementos: " + numeros);
        
        // Probar método add con índice
        System.out.println("\n---- Método add(index, element) ----");
        numeros.add(1, 15);
        System.out.println("Lista después de agregar 15 en posición 1: " + numeros);
        
        // Probar método size
        System.out.println("\n---- Método size ----");
        System.out.println("Tamaño de la lista: " + numeros.size());
        
        // Probar método get
        System.out.println("\n---- Método get ----");
        System.out.println("Elemento en posición 0: " + numeros.get(0));
        System.out.println("Elemento en posición 2: " + numeros.get(2));
        
        // Probar método set
        System.out.println("\n---- Método set ----");
        Integer valorAnterior = numeros.set(1, 16);
        System.out.println("Valor anterior en posición 1: " + valorAnterior);
        System.out.println("Lista después de reemplazar: " + numeros);
        
        // Probar método contains
        System.out.println("\n---- Método contains ----");
        System.out.println("¿La lista contiene 16? " + numeros.contains(16));
        System.out.println("¿La lista contiene 50? " + numeros.contains(50));
        
        // Probar método indexOf
        System.out.println("\n---- Método indexOf ----");
        System.out.println("Índice de 30: " + numeros.indexOf(30));
        System.out.println("Índice de 100: " + numeros.indexOf(100));
        
        // Probar método remove por índice
        System.out.println("\n---- Método remove(index) ----");
        Integer eliminado = numeros.remove(1);
        System.out.println("Elemento eliminado: " + eliminado);
        System.out.println("Lista después de eliminar: " + numeros);
        
        // Probar método addAll
        System.out.println("\n---- Método addAll ----");
        List<Integer> masNumeros = new ArrayList<>(Arrays.asList(40, 50, 60));
        numeros.addAll(masNumeros);
        System.out.println("Lista después de addAll: " + numeros);
        
        // Probar método subList
        System.out.println("\n---- Método subList ----");
        CustomList<Integer> sublista = numeros.subList(1, 4);
        System.out.println("Sublista (1-4): " + sublista);
        
        // Probar método clear
        System.out.println("\n---- Método clear ----");
        sublista.clear();
        System.out.println("Sublista después de clear: " + sublista);
        System.out.println("¿Está vacía la sublista? " + sublista.isEmpty());
        
        // Crear una lista de cadenas para probar con otro tipo de datos
        System.out.println("\n---- Lista de cadenas ----");
        CustomList<String> nombres = new CustomList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Elena");
        nombres.add("Carlos");
        System.out.println("Lista de nombres: " + nombres);
        
        // Probar método lastIndexOf
        System.out.println("\n---- Método lastIndexOf ----");
        System.out.println("Último índice de 'Carlos': " + nombres.lastIndexOf("Carlos"));
        
        // Probar método remove por objeto
        System.out.println("\n---- Método remove(Object) ----");
        boolean removido = nombres.remove("Carlos");
        System.out.println("¿Se eliminó 'Carlos'? " + removido);
        System.out.println("Lista después de eliminar: " + nombres);
        
        // Probar método removeAll
        System.out.println("\n---- Método removeAll ----");
        List<String> nombresAEliminar = new ArrayList<>(Arrays.asList("Ana", "Elena"));
        boolean modificado = nombres.removeAll(nombresAEliminar);
        System.out.println("¿Se modificó la lista? " + modificado);
        System.out.println("Lista después de removeAll: " + nombres);
    }
}