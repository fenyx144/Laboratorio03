import java.util.Scanner;

/**
 * Clase principal para la calculadora genérica
 */
public class CalculadoraGenerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Mostrar menú
            System.out.println("\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma.");
            System.out.println("2. Resta.");
            System.out.println("3. Producto.");
            System.out.println("4. División.");
            System.out.println("5. Potencia.");
            System.out.println("6. Raíz Cuadrada.");
            System.out.println("7. Raíz Cúbica.");
            System.out.println("8. Salir del Programa.");
            System.out.print("Seleccione una opción: ");
            
            // Leer opción
            opcion = scanner.nextInt();
            
            // Procesar opción
            if (opcion >= 1 && opcion <= 7) {
                // Seleccionar tipo de dato
                System.out.println("\nSeleccione el tipo de dato:");
                System.out.println("1. Integer");
                System.out.println("2. Double");
                System.out.print("Opción: ");
                int tipoOpcion = scanner.nextInt();
                
                try {
                    switch (opcion) {
                        case 1: // Suma
                            realizarSuma(scanner, tipoOpcion);
                            break;
                        case 2: // Resta
                            realizarResta(scanner, tipoOpcion);
                            break;
                        case 3: // Producto
                            realizarProducto(scanner, tipoOpcion);
                            break;
                        case 4: // División
                            realizarDivision(scanner, tipoOpcion);
                            break;
                        case 5: // Potencia
                            realizarPotencia(scanner, tipoOpcion);
                            break;
                        case 6: // Raíz Cuadrada
                            realizarRaizCuadrada(scanner, tipoOpcion);
                            break;
                        case 7: // Raíz Cúbica
                            realizarRaizCubica(scanner, tipoOpcion);
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (opcion != 8) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
            
        } while (opcion != 8);
        
        System.out.println("Programa finalizado.");
        scanner.close();
    }
    
    /**
     * Método para realizar la operación de suma
     */
    private static void realizarSuma(Scanner scanner, int tipoOpcion) {
        if (tipoOpcion == 1) { // Integer
            System.out.print("Ingrese el primer valor: ");
            Integer valor1 = scanner.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            Integer valor2 = scanner.nextInt();
            
            Operador<Integer> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.suma());
        } else { // Double
            System.out.print("Ingrese el primer valor: ");
            Double valor1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo valor: ");
            Double valor2 = scanner.nextDouble();
            
            Operador<Double> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.suma());
        }
    }
    
    /**
     * Método para realizar la operación de resta
     */
    private static void realizarResta(Scanner scanner, int tipoOpcion) {
        if (tipoOpcion == 1) { // Integer
            System.out.print("Ingrese el primer valor: ");
            Integer valor1 = scanner.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            Integer valor2 = scanner.nextInt();
            
            Operador<Integer> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.resta());
        } else { // Double
            System.out.print("Ingrese el primer valor: ");
            Double valor1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo valor: ");
            Double valor2 = scanner.nextDouble();
            
            Operador<Double> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.resta());
        }
    }
    
    /**
     * Método para realizar la operación de producto
     */
    private static void realizarProducto(Scanner scanner, int tipoOpcion) {
        if (tipoOpcion == 1) { // Integer
            System.out.print("Ingrese el primer valor: ");
            Integer valor1 = scanner.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            Integer valor2 = scanner.nextInt();
            
            Operador<Integer> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.producto());
        } else { // Double
            System.out.print("Ingrese el primer valor: ");
            Double valor1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo valor: ");
            Double valor2 = scanner.nextDouble();
            
            Operador<Double> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.producto());
        }
    }
    
    /**
     * Método para realizar la operación de división
     */
    private static void realizarDivision(Scanner scanner, int tipoOpcion) {
        if (tipoOpcion == 1) { // Integer
            System.out.print("Ingrese el primer valor: ");
            Integer valor1 = scanner.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            Integer valor2 = scanner.nextInt();
            
            Operador<Integer> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.division());
        } else { // Double
            System.out.print("Ingrese el primer valor: ");
            Double valor1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo valor: ");
            Double valor2 = scanner.nextDouble();
            
            Operador<Double> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.division());
        }
    }
    
    /**
     * Método para realizar la operación de potencia
     */
    private static void realizarPotencia(Scanner scanner, int tipoOpcion) {
        if (tipoOpcion == 1) { // Integer
            System.out.print("Ingrese la base: ");
            Integer valor1 = scanner.nextInt();
            System.out.print("Ingrese el exponente: ");
            Integer valor2 = scanner.nextInt();
            
            Operador<Integer> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.potencia());
        } else { // Double
            System.out.print("Ingrese la base: ");
            Double valor1 = scanner.nextDouble();
            System.out.print("Ingrese el exponente: ");
            Double valor2 = scanner.nextDouble();
            
            Operador<Double> operador = new Operador<>(valor1, valor2);
            System.out.println("Resultado: " + operador.potencia());
        }
    }
    
    /**
     * Método para realizar la operación de raíz cuadrada
     */
    private static void realizarRaizCuadrada(Scanner scanner, int tipoOpcion) {
        if (tipoOpcion == 1) { // Integer
            System.out.print("Ingrese el valor: ");
            Integer valor1 = scanner.nextInt();
            
            Operador<Integer> operador = new Operador<>(valor1, 0);
            System.out.println("Resultado: " + operador.raizCuadrada());
        } else { // Double
            System.out.print("Ingrese el valor: ");
            Double valor1 = scanner.nextDouble();
            
            Operador<Double> operador = new Operador<>(valor1, 0.0);
            System.out.println("Resultado: " + operador.raizCuadrada());
        }
    }
    
    /**
     * Método para realizar la operación de raíz cúbica
     */
    private static void realizarRaizCubica(Scanner scanner, int tipoOpcion) {
        if (tipoOpcion == 1) { // Integer
            System.out.print("Ingrese el valor: ");
            Integer valor1 = scanner.nextInt();
            
            Operador<Integer> operador = new Operador<>(valor1, 0);
            System.out.println("Resultado: " + operador.raizCubica());
        } else { // Double
            System.out.print("Ingrese el valor: ");
            Double valor1 = scanner.nextDouble();
            
            Operador<Double> operador = new Operador<>(valor1, 0.0);
            System.out.println("Resultado: " + operador.raizCubica());
        }
    }
}