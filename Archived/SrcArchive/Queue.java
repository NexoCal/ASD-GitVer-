
/*
 * 
 * @param <E>
 */


public class Queue<E> extends LinkedListCustom {

    public Queue(){

    }

    public Object peek(){
        return getFirst();
    }

    public void enqueue(Object E){
        add(E);
    }

    public boolean isEmpty() {
        if(size() != 0){
            return false;
        }else{
            return true;
        }
    }

    public Object dequeue(){
        Object temp = getFirst();
        removeFirst();
        return temp;
    }

    
}
