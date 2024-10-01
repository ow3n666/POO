package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */

public class Queue {
    private Node first;
    private Node last;

    public Queue() {
    }
    
    public boolean isEmpty(){
        return first == null && last ==null;
        
    }
    
    public void Enqueque (Object data){
        
        if (isEmpty()){
            first = new Node (data);
            last = first;
        }else{
            Node n = new Node (data);
            last.setLink(n);
            last = n;
        }
      
    }
    
    public Object Dequeque (){
        Object data = null;
        if(!isEmpty())
        {
            data = first.getData();
            first = first.getLink();
            
            if(first==null)
                last = null;
        }
        return data;
    }
}
