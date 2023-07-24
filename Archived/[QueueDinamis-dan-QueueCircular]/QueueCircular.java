public class QueueCircular {
    private Object[] queueCirc;
    private int head;
    private int tail;
    private int maxsize;

    public QueueCircular(int size) {
        maxsize = size;
        queueCirc = new Object[maxsize];
        head = 0;
        tail = queueCirc.length - 1;
    }

    public boolean isEmpty() {
        return ((tail + 1) % queueCirc.length == head);
    }

    public boolean isFull() {
        return ((tail + 2) % queueCirc.length == head);
    }

    public void enqueue(Object x) {
        if (!isFull()) {
            tail = ((tail + 1) % queueCirc.length);
            queueCirc[tail] = x;
            System.out.println("Enqueue -> " + x);
        } else {
            System.out.println("Queue is full");
        }
    }

    public Object dequeue() {
        Object temp = null;
        if (!isEmpty()) {
            temp = queueCirc[head];
            head = ((head + 1) % queueCirc.length);
        }
        return temp;
    }

    public void showQueue(){
        for (int i = head; i<tail+1;i++){
            System.out.print(queueCirc[i]);
            if (!(i == tail)){
                System.out.print(" -> ");
            }
        }
        System.out.println("");
    }
}
