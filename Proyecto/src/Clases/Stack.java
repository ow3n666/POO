package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */

public class Stack {

    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void Push(Object data) { //ingresar
        if (isEmpty()) {
            top = new Node(data); //Crear nuevo nodo top
        } else {
            Node n = new Node(data); 
            n.setLink(top);
            top = n;
        }
    }
    
    public Object Pop(){ //sacar un objecto
        Object obj = null;
        if(!isEmpty()){
            obj = top.getData(); //obtiene el objecto de top
            top = top.getLink(); //top tiene el link que hay en top
        }
        return obj; //retorna el elemento que sacó obteniendose de top
    }
}