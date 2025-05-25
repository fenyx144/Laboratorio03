import java.util.Collection;

/**
 * Implementación personalizada de una lista genérica
 * @param <T> tipo de datos que almacenará la lista
 */
public class CustomList<T> {
    // Nodo raíz o cabeza de la lista
    private Node<T> root;
    // Tamaño de la lista
    private int size;

    /**
     * Constructor que inicializa una lista vacía
     */
    public CustomList() {
        this.root = null;
        this.size = 0;
    }

    /**
     * Agrega un elemento al final de la lista
     * @param element elemento a agregar
     * @return true si se agregó correctamente
     */
    public boolean add(T element) {
        Node<T> newNode = new Node<>(element);
        
        if (root == null) {
            root = newNode;
        } else {
            Node<T> current = root;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
        
        size++;
        return true;
    }

    /**
     * Agrega un elemento en una posición específica
     * @param index posición donde agregar el elemento
     * @param element elemento a agregar
     */
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamaño: " + size);
        }
        
        Node<T> newNode = new Node<>(element);
        
        if (index == 0) {
            newNode.setNextNode(root);
            root = newNode;
        } else {
            Node<T> current = root;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNextNode();
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
        }
        
        size++;
    }

    /**
     * Agrega todos los elementos de una colección a la lista
     * @param c colección a agregar
     * @return true si se modificó la lista
     */
    public boolean addAll(Collection<? extends T> c) {
        if (c.isEmpty()) {
            return false;
        }
        
        for (T element : c) {
            add(element);
        }
        
        return true;
    }

    /**
     * Agrega todos los elementos de una colección a partir de una posición
     * @param index posición inicial
     * @param c colección a agregar
     * @return true si se modificó la lista
     */
    public boolean addAll(int index, Collection<? extends T> c) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamaño: " + size);
        }
        
        if (c.isEmpty()) {
            return false;
        }
        
        int i = index;
        for (T element : c) {
            add(i++, element);
        }
        
        return true;
    }

    /**
     * Elimina todos los elementos de la lista
     */
    public void clear() {
        root = null;
        size = 0;
    }

    /**
     * Verifica si la lista contiene un elemento
     * @param o elemento a buscar
     * @return true si el elemento está en la lista
     */
    public boolean contains(Object o) {
        Node<T> current = root;
        
        while (current != null) {
            if (o == null ? current.getData() == null : o.equals(current.getData())) {
                return true;
            }
            current = current.getNextNode();
        }
        
        return false;
    }

    /**
     * Verifica si la lista contiene todos los elementos de una colección
     * @param c colección a verificar
     * @return true si todos los elementos están en la lista
     */
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        
        return true;
    }

    /**
     * Verifica si la lista es igual a otro objeto
     * @param o objeto a comparar
     * @return true si son iguales
     */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        
        if (!(o instanceof CustomList)) {
            return false;
        }
        
        CustomList<?> otherList = (CustomList<?>) o;
        
        if (size != otherList.size()) {
            return false;
        }
        
        Node<T> thisCurrent = root;
        Node<?> otherCurrent = otherList.root;
        
        while (thisCurrent != null) {
            if (!(thisCurrent.getData() == null ? 
                  otherCurrent.getData() == null : 
                  thisCurrent.getData().equals(otherCurrent.getData()))) {
                return false;
            }
            thisCurrent = thisCurrent.getNextNode();
            otherCurrent = otherCurrent.getNextNode();
        }
        
        return true;
    }

    /**
     * Obtiene el elemento en una posición específica
     * @param index posición del elemento
     * @return elemento en la posición
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamaño: " + size);
        }
        
        Node<T> current = root;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        
        return current.getData();
    }

    /**
     * Busca la primera ocurrencia de un elemento
     * @param o elemento a buscar
     * @return índice del elemento o -1 si no se encuentra
     */
    public int indexOf(Object o) {
        Node<T> current = root;
        int index = 0;
        
        while (current != null) {
            if (o == null ? current.getData() == null : o.equals(current.getData())) {
                return index;
            }
            current = current.getNextNode();
            index++;
        }
        
        return -1;
    }

    /**
     * Verifica si la lista está vacía
     * @return true si la lista está vacía
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Busca la última ocurrencia de un elemento
     * @param o elemento a buscar
     * @return índice del elemento o -1 si no se encuentra
     */
    public int lastIndexOf(Object o) {
        Node<T> current = root;
        int index = 0;
        int lastIndex = -1;
        
        while (current != null) {
            if (o == null ? current.getData() == null : o.equals(current.getData())) {
                lastIndex = index;
            }
            current = current.getNextNode();
            index++;
        }
        
        return lastIndex;
    }

    /**
     * Elimina el elemento en una posición específica
     * @param index posición del elemento a eliminar
     * @return elemento eliminado
     */
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamaño: " + size);
        }
        
        T removedData;
        
        if (index == 0) {
            removedData = root.getData();
            root = root.getNextNode();
        } else {
            Node<T> current = root;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNextNode();
            }
            
            Node<T> nodeToRemove = current.getNextNode();
            removedData = nodeToRemove.getData();
            current.setNextNode(nodeToRemove.getNextNode());
        }
        
        size--;
        return removedData;
    }

    /**
     * Elimina la primera ocurrencia de un elemento
     * @param o elemento a eliminar
     * @return true si se eliminó el elemento
     */
    public boolean remove(Object o) {
        if (root == null) {
            return false;
        }
        
        if (o == null ? root.getData() == null : o.equals(root.getData())) {
            root = root.getNextNode();
            size--;
            return true;
        }
        
        Node<T> current = root;
        while (current.getNextNode() != null) {
            if (o == null ? current.getNextNode().getData() == null : 
                o.equals(current.getNextNode().getData())) {
                current.setNextNode(current.getNextNode().getNextNode());
                size--;
                return true;
            }
            current = current.getNextNode();
        }
        
        return false;
    }

    /**
     * Elimina todos los elementos que están en una colección
     * @param c colección con elementos a eliminar
     * @return true si se modificó la lista
     */
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        
        for (Object o : c) {
            while (remove(o)) {
                modified = true;
            }
        }
        
        return modified;
    }

    /**
     * Reemplaza el elemento en una posición específica
     * @param index posición del elemento
     * @param element nuevo elemento
     * @return elemento anterior
     */
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamaño: " + size);
        }
        
        Node<T> current = root;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        
        T oldData = current.getData();
        current.setData(element);
        
        return oldData;
    }

    /**
     * Obtiene el tamaño de la lista
     * @return número de elementos en la lista
     */
    public int size() {
        return size;
    }

    /**
     * Obtiene una sublista desde fromIndex hasta toIndex-1
     * @param fromIndex índice inicial (inclusivo)
     * @param toIndex índice final (exclusivo)
     * @return nueva lista con los elementos del rango
     */
    public CustomList<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
        }
        
        CustomList<T> subList = new CustomList<>();
        
        if (fromIndex == toIndex) {
            return subList;
        }
        
        Node<T> current = root;
        for (int i = 0; i < fromIndex; i++) {
            current = current.getNextNode();
        }
        
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(current.getData());
            current = current.getNextNode();
        }
        
        return subList;
    }

    /**
     * Representación en cadena de la lista
     * @return cadena con los elementos de la lista
     */
    @Override
    public String toString() {
        if (root == null) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        Node<T> current = root;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNextNode() != null) {
                sb.append(", ");
            }
            current = current.getNextNode();
        }
        
        sb.append("]");
        return sb.toString();
    }
}

/**
 * Clase Nodo para la lista enlazada
 * @param <T> tipo de datos que almacenará el nodo
 */
class Node<T> {
    // Datos almacenados en el nodo
    private T data;
    // Referencia al siguiente nodo
    private Node<T> nextNode;
    
    /**
     * Constructor que inicializa un nodo con datos
     * @param data datos a almacenar
     */
    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
    
    /**
     * Obtiene los datos del nodo
     * @return datos almacenados
     */
    public T getData() {
        return data;
    }
    
    /**
     * Establece los datos del nodo
     * @param data nuevos datos
     */
    public void setData(T data) {
        this.data = data;
    }
    
    /**
     * Obtiene el siguiente nodo
     * @return referencia al siguiente nodo
     */
    public Node<T> getNextNode() {
        return nextNode;
    }
    
    /**
     * Establece el siguiente nodo
     * @param nextNode referencia al nuevo siguiente nodo
     */
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}