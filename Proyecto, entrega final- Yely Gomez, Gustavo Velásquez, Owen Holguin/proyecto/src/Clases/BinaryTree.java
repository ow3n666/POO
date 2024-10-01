package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author leana
 */
public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {

    }

    public boolean isEmpty() {
        return root == null;
    }

    private void Add(BinaryNode aux, Object producto) {
        double valor;
        if (isEmpty()) {
            root = new BinaryNode(producto);
        } else {
            valor = Math.random();
            //si el valor es menor que 0.5
            if (valor < 0.5) {
                if (aux.getLeft() == null) { //si es igual a nulo
                    aux.setLeft(new BinaryNode(producto)); //mete el producto en la nueva rama izquierda
                } else {
                    //se hace recursivo
                    Add(aux.getLeft(), producto);
                }
            } //si el valor es mayor a 0.5
            else {
                if (aux.getRigth() == null) { //si derecho es igual a nulo
                    aux.setRigth(new BinaryNode(producto)); //mete el producto en la nueva rama derecha
                } else {
                    Add(aux.getRigth(), producto);
                }
            }
        }
    }

    public void Add(Object producto) {
        Add(root, producto);
    }

    private void Revaluar(List aprobados, List noAprobados, BinaryNode aux) {
        if (aux != null) {
            if (aux.getLeft() == null && aux.getRigth() == null) {
                Producto pro = (Producto) aux.getData();
                pro.setCriterio1(true);
                pro.setCriterio2(true);
                pro.setCriterio3(true);
                aprobados.AddLast(pro);
                noAprobados.Delete(pro.getCodigo());
            } else {
                Revaluar(aprobados, noAprobados, aux.getLeft());
                Revaluar(aprobados, noAprobados, aux.getRigth());
            }
        }
    }

    public void Revaluar(List aprobados, List noAprobados) {
        Revaluar(aprobados, noAprobados, root);
    }

    //izquierdo - raiz - derecho
    private String Inorder(BinaryNode aux) {
        if (aux != null) {
            return Inorder(aux.getLeft()) + "\n" + " " + aux.getData() + " \n " + Inorder(aux.getRigth()) + "\n";
        } else {
            return " ";
        }
    }

    public String Inorder() {
        return Inorder(root);
    }

    private String SearchNode(String value, BinaryNode aux, String text) {
        Producto pro;
        if (aux != null) {
            pro = (Producto) aux.getData();
            if ((((Colaborador) pro.getColab()).getNombre()).equals(value)) {
                text += pro.toString();
                text += SearchNode(value, aux.getRigth(), text);
                text += SearchNode(value, aux.getLeft(), text);
            } else {
                text += SearchNode(value, aux.getRigth(), text);
                text += SearchNode(value, aux.getLeft(), text);
            }
        }
        return text;
    }

    public String SearchNode(String value) {
        String text = "";
        return SearchNode(value, root, text);
    }
}
