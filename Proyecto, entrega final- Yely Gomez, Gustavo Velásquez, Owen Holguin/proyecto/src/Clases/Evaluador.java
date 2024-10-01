package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */

public class Evaluador {
    private String id;
    private String nombre;
    private Stack Productos;

    
    public Evaluador(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        Productos = new Stack();
    }

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

    public Stack getProductos() {
        return Productos;
    }

    public void setProductos(Stack Productos) {
        this.Productos = Productos;
    }

    @Override
    public String toString() {
        return "Evaluador: " + " Id: " + id + " Nombre: " + nombre + ",\nProductos: " +Print(Productos) + "}\n";
    }
    
    public String Print(Stack s) {
        String texto = "";
        Stack aux = new Stack();
        while (!s.isEmpty()) {
            Producto p = (Producto) s.Pop();
            texto = texto + p.toString();
            aux.Push(p);
        }
        while (!aux.isEmpty()) {
            s.Push(aux.Pop());
        }
        return texto;
    }
}
