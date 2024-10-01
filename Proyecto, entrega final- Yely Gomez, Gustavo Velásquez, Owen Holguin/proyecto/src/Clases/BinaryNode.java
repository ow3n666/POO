package Clases;

/**
 *
 * @author leana
 */
public class BinaryNode {

    private BinaryNode left;
    private Object data;
    private BinaryNode rigth;

    public BinaryNode(Object data) {
        this.data = data;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BinaryNode getRigth() {
        return rigth;
    }

    public void setRigth(BinaryNode rigth) {
        this.rigth = rigth;
    }

    
}
