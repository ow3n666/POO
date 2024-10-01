package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada Owen Andrés Holguin Molina Yely
 * Leana Gómez Vargas
 */
public class List {

    private Node first;

    public List() {
        first = null; //opcional
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Node getFirst() {
        return first;
    }

    //añadir primero
    public void AddFirst(Object data) {
        if (isEmpty()) { //si está vacío
            first = new Node(data); //crea un nodo con dirección de memoria null que se crea de primero
        } else { //si no está vacío
            Node n = new Node(data); //crea el nuevo nodo 
            n.setLink(first); //cambia el enlace de n y guarda la dirección de memoria del anterior
            first = n; //y el primero asigna la dirección del nuevo
        }
    }

    //mostrar
    @Override
    public String toString() {
        String text = " ";// acumulador
        Node aux = first; //se necesita un auxiliar para que no se borre la lista, 
        //aux = first guarda la dirección de memoria del primero y se trabaja con el auxiliar
        while (aux != null) {
            text = text + aux.getData() + "\n"; //text es el acumulador para mostrar la lista y getData muestra el dato
            aux = aux.getLink(); //auxiliar es igual al siguiente, pasa de posición
        }
        return text;
    }

    //método que busca el último nodo de la lista
    public Node Last() {
        Node aux = first; //nodo auxiliar para recorrer la lista

        while (aux != null && aux.getLink() != null) { //hasta que esté vacía y que la lista no esté vacía
            aux = aux.getLink(); //auxiliar es igual al siguiente, pasa de posición
        }
        return aux;
    }

    //añade de último
    public void AddLast(Object data) {
        if (isEmpty()) {
            first = new Node(data); //si está vacío crea 
        } else {
            Node last = Last(); //busca el último
            last.setLink(new Node(data));
            //Last().setLink(new node(data));
        }
    }

    //busca el tamaño de la lista
    public int Size() {
        Node aux = first; //creamos el auxiliar
        int count = 0; //inicializa el contador en cero
        while (aux != null) { //recorre hasta que el auxiliar sea igual a nulo
            count++; //aumenta contador
            aux = aux.getLink(); //auxiliar es igual al siguiente, pasa de posición
        }
        return count;
    }

    //método del previo 
    public Node Previous(Node search) { //puede recibir el dato
        Node aux = first, pre = null;
        //compara el nodo, para comprar string se cambia String search y aux.getData().equals(serch)
        while (aux != null && aux != search) { //condición de que auxiliar sea diferente de nulo y diferente del buscado
            pre = aux; // el previo toma el dato del auxiliar
            aux = aux.getLink(); // auxiliar pasa al siguiente
        }
        if (aux == null) { //si auxiliar llega a nulo se retorna nulo
            return null;
        } else { //si auxiliar no llega a nulo y se detiene, devuelve la posición del previo
            return pre;
        }
    }   

    //borrar primero
    public boolean DeleteFirst() {
        if (!isEmpty()) {
            first = first.getLink(); //el primero es igual al siguiente
            return true;
        }
        return false;
    }
    

    //borrar por especifico
    public void Delete(String delete) { //u object datas
        Node aux = first;
        while (aux != null) {
            if (((Producto) aux.getData()).getCodigo().equals(delete)) {
                Node pre = Previous(aux);
                if (pre != null) {
                    pre.setLink(aux.getLink());
                } else {
                    DeleteFirst();
                }
            }
            aux = aux.getLink();
        }
    }

    //buscar para verificar colaborador
    public boolean Search(String nombre, String id) {
        Node aux = first;
        boolean t = false;

        while (aux != null && t != true) {
            if (((Colaborador) aux.getData()).getNombre().equalsIgnoreCase(nombre) && ((Colaborador) aux.getData()).getId().equalsIgnoreCase(id)) {
                t = true;
            }
            aux = aux.getLink();
        }
        return t;
    }

    //buscar colaborador
    public Colaborador SearchCol(String id) {
        Node aux = first;
        boolean t = false;

        while (aux != null && t != true) {
            if (((Colaborador) aux.getData()).getId().equalsIgnoreCase(id)) {
                return (Colaborador) aux.getData();
            }
            aux = aux.getLink();
        }
        return null;
    }

    //buscar para verificar evaluador
    public boolean SearchEva(String nombre, String id) {
        Node aux = first;
        boolean t = false;

        while (aux != null && t != true) {
            if (((Evaluador) aux.getData()).getNombre().equalsIgnoreCase(nombre) && ((Evaluador) aux.getData()).getId().equalsIgnoreCase(id)) {
                t = true;
            }
            aux = aux.getLink();
        }
        return t;
    }

    //buscar evaluador
    public Stack SearchEva(String id) {
        Node aux = first;

        while (aux != null) {
            if (((Evaluador) aux.getData()).getId().equalsIgnoreCase(id)) {
                return ((Evaluador) aux.getData()).getProductos();
            }
            aux = aux.getLink();
        }
        return null;
    }

    public void Distribuidos(List AllProduc, List Aprovados, List NoAprov) {
        Node aux = AllProduc.getFirst();
        while (aux != null) {

            if ((((Producto) aux.getData()).isCriterio1() == true) && (((Producto) aux.getData()).isCriterio2() == true) && (((Producto) aux.getData()).isCriterio3() == true)) {
                Aprovados.AddFirst(aux.getData());
            } else {
                NoAprov.AddFirst(aux.getData());
            }
            aux = aux.getLink();
        }
    }

    public Node Previus(Node search) {
        Node aux = first, pre = null;
        while (aux != null && aux != search) {
            pre = aux;
            aux = aux.getLink();
        }
        if (aux == null) {
            return null;
        } else {
            return pre;
        }
    }

    public boolean DeleteEva(String id) {
        Node aux = first;
        while (aux != null && !id.equals(((Evaluador) aux.getData()).getId())) {
            aux = aux.getLink();
        }

        if (aux != null) {
            Node pre = Previus(aux);
            if (pre != null) {
                pre.setLink(aux.getLink());
            } else {
                DeleteFirst();
            }
            return true;
        }
        return false;
    }

    public double PrePago() {
        Node aux = getFirst();
        Producto pro;
        double valor = 0;
        while (aux != null) {
            pro = (Producto) aux.getData();
            valor = valor + pro.getGan();
            aux = aux.getLink();
        }
        return valor;
    }

    public BinaryTree noPro() {
        BinaryTree bt = new BinaryTree();
        Node aux = getFirst();
        Producto pro;
        while (aux != null) {
            pro = (Producto) aux.getData();
            bt.Add(pro);
            aux = aux.getLink();
        }
        return bt;
    }

    
    //eliminar productividad
    public void EliminarPro(List eva, String delete) {
        //metodo eliminar la pila del evaluador
        Node aux = eva.getFirst();
        Stack pila = new Stack();
        Stack pilaux = new Stack();
        Evaluador ee;
        Producto pro;
        //se recorre la listaqe
        while (aux != null) {
            //lista
            ee = (Evaluador) aux.getData();
            pila = ee.getProductos(); //se saca la pila del evaluador

            //se recorre pila del evaluador
            while (!pila.isEmpty()) {
                pro = (Producto) pila.Pop(); //se pasan los productos de la pila
                //Si el codigo del producto a eliminar es diferente al que hay en la pila, este se mete en la pila auxiliar
                if (!pro.getCodigo().equals(delete)) {
                    pilaux.Push(pro);
                }
            }
            while (!pilaux.isEmpty()) {
                pila.Push(pilaux.Pop());
            }

            aux = aux.getLink();
        }

        JOptionPane.showMessageDialog(null, "Eliminadito");
    }
    
    public void AsignarPuntos(List Aprovados) {
        Node aux2 = Aprovados.getFirst(); //aux2 para que se quede estático en un nodo
        Node aux = Aprovados.getFirst(); //para recorrer y comparar con el nodo del auxiliar
        int count = 0;
        double puntos = 0;
        Producto paux;
        Producto paux2;
        while (aux2 != null) {
            paux = (Producto) aux2.getData();
            while (aux != null) {
                paux2 = (Producto) aux.getData();
                //para verificar si es un artículo
                if ((paux2 instanceof Articulo) && (paux instanceof Articulo)) {
                    Articulo art = (Articulo) paux2; //casting a paux2 
                    Articulo art2 = (Articulo) paux; //casting a paux
                    if (art.getTitulo().equals(art2.getTitulo())) {
                        count++;
                    }
                }
                if ((paux2 instanceof Patente) && (paux instanceof Patente)) {
                    Patente art = (Patente) paux2; //casting a paux2 
                    Patente art2 = (Patente) paux; //casting a paux
                    if (art.getCodigoPat().equals(art2.getCodigoPat())) {
                        count++;
                    }
                }
                if ((paux2 instanceof Software) && (paux instanceof Software)) {
                    Software art = (Software) paux2; //casting a paux2 
                    Software art2 = (Software) paux; //casting a paux
                    if (art.getCodSoft().equals(art2.getCodSoft())) {
                        count++;
                    }
                }
                aux = aux.getLink();
            }
            //procedemos a asignar los puntos
            if (paux instanceof Articulo) {
                if (((Articulo) paux).getCategoria().equals("A")) {
                    if (count >= 4) {
                        paux.setPuntaje(120/count);
                        puntos = (paux.getPuntaje()) * 15000;
                        paux.setGan(puntos);
                    } else {
                        paux.setPuntaje(120);
                        puntos = 120 * 15000;
                        paux.setGan(puntos);
                    }
                }

                if (((Articulo) paux).getCategoria().equals("B")) {
                     if (count >= 4) {
                        paux.setPuntaje(80/count);
                        puntos = (paux.getPuntaje()) * 15000;
                        paux.setGan(puntos);
                    } else {
                        paux.setPuntaje(80);
                        puntos = 80 * 15000;
                        paux.setGan(puntos);
                    }
                }

                if (((Articulo) paux).getCategoria().equals("C")) {
                    if (count >= 4) {
                        paux.setPuntaje(40/count);
                        puntos = (paux.getPuntaje()) * 15000;
                        paux.setGan(puntos);
                    } else {
                        paux.setPuntaje(40);
                        puntos = 40 * 15000;
                        paux.setGan(puntos);
                    }
                }

                if (((Articulo) paux).getCategoria().equals("D")) {
                   if (count >= 4) {
                        paux.setPuntaje(20/count);
                        puntos = (paux.getPuntaje()) * 15000;
                        paux.setGan(puntos);
                    } else {
                        paux.setPuntaje(20);
                        puntos = 20 * 15000;
                        paux.setGan(puntos);
                    }
                }
            }

            if (paux instanceof Patente) {
                if (((Patente) paux).getTipo().equalsIgnoreCase("Invencion")) {
                    if (count >= 4) {
                        paux.setPuntaje(200/count);
                        puntos = (paux.getPuntaje()) * 15000;
                        paux.setGan(puntos);
                    } else {
                        paux.setPuntaje(200);
                        puntos = 200 * 15000;
                        paux.setGan(puntos);
                    }
                }

                if (((Patente) paux).getTipo().equalsIgnoreCase("Procedimiento")) {
                   if (count >= 4) {
                        paux.setPuntaje(120/count);
                        puntos = (paux.getPuntaje()) * 15000;
                        paux.setGan(puntos);
                    } else {
                        paux.setPuntaje(120);
                        puntos = 120 * 15000;
                        paux.setGan(puntos);
                    }
                }

                if (((Patente) paux).getTipo().equalsIgnoreCase("Producto")) {
                     if (count >= 4) {
                        paux.setPuntaje(100/count);
                        puntos = (100 / count) * 15000;
                        paux.setGan(puntos);
                    } else {
                        paux.setPuntaje(100);
                        puntos = 100 * 15000;
                        paux.setGan(puntos);
                    }
                }
            }

            if (paux instanceof Software) {
                if (count >= 4) {
                    paux.setPuntaje(140/count);
                    puntos = (paux.getPuntaje()) * 15000;
                    paux.setGan(puntos);
                } else {
                    paux.setPuntaje(140);
                    puntos = 140 * 15000;
                    paux.setGan(puntos);
                }
            }
            aux2 = aux2.getLink();
        }
    }
    
    public List Listar_colav(String colab, List Aprovados)
    {
     Node aux=Aprovados.getFirst();
     List ret = new List();
        while (aux!=null) 
        {            
            if (((Producto)aux.getData()).getColab().getNombre().equalsIgnoreCase(colab)) 
            {
                ret.AddFirst((Producto)aux.getData());
                
            }
            aux=aux.getLink();
        }
        
        return ret;
    }
}
