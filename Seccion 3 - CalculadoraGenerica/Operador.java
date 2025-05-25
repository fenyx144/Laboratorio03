/**
 * Clase genérica para operaciones matemáticas
 * @param <T> tipo de dato numérico (debe extender de Number)
 */
public class Operador<T extends Number> {
    private T valor1;
    private T valor2;
    
    /**
     * Constructor para inicializar los valores
     * @param valor1 primer valor
     * @param valor2 segundo valor
     */
    public Operador(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    /**
     * Método para obtener el primer valor
     * @return primer valor
     */
    public T getValor1() {
        return valor1;
    }
    
    /**
     * Método para obtener el segundo valor
     * @return segundo valor
     */
    public T getValor2() {
        return valor2;
    }
    
    /**
     * Método para sumar dos valores
     * @return resultado de la suma
     */
    public double suma() {
        return valor1.doubleValue() + valor2.doubleValue();
    }
    
    /**
     * Método para restar dos valores
     * @return resultado de la resta
     */
    public double resta() {
        return valor1.doubleValue() - valor2.doubleValue();
    }
    
    /**
     * Método para multiplicar dos valores
     * @return resultado del producto
     */
    public double producto() {
        return valor1.doubleValue() * valor2.doubleValue();
    }
    
    /**
     * Método para dividir dos valores
     * @return resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public double division() {
        if (valor2.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return valor1.doubleValue() / valor2.doubleValue();
    }
    
    /**
     * Método para calcular la potencia
     * @return resultado de elevar valor1 a la potencia valor2
     */
    public double potencia() {
        return Math.pow(valor1.doubleValue(), valor2.doubleValue());
    }
    
    /**
     * Método para calcular la raíz cuadrada del primer valor
     * @return raíz cuadrada del primer valor
     */
    public double raizCuadrada() {
        if (valor1.doubleValue() < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(valor1.doubleValue());
    }
    
    /**
     * Método para calcular la raíz cúbica del primer valor
     * @return raíz cúbica del primer valor
     */
    public double raizCubica() {
        return Math.cbrt(valor1.doubleValue());
    }
}