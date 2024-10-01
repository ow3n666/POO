package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */

public class Node {

    private Object data;
    private Node link;

    public Node() {
    }
    
    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

}
