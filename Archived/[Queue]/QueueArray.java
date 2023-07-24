public class QueueArray {
    private Object[] queueAr;
    private int head;
    private int tail;
    private int maxsize;

    public QueueArray(int size) {
        maxsize = size;
        queueAr = new Object[maxsize];
        head = -1;
        tail = -1;
    }

    public boolean isFull() {
        return tail == queueAr.length - 1;
    }

    public boolean isEmpty() {
        return tail == -1;
    }

    public void enqueue(Object x) {
        if (isEmpty()) {
            head = 0;
            tail = 0;
            queueAr[tail] = x;
            System.out.println("Inserted " + x);

        } else if (!isFull()) {
            tail++;
            queueAr[tail] = x;
            System.out.println("Inserted " + x);
        } else {
            System.out.println("Queue is full");
        }
    }

    public Object dequeue() {
        Object temp;
        if (!isEmpty()) {
            temp = queueAr[head];
            for (int i = head; i < tail; i++) {
                queueAr[i] = queueAr[i + 1];
            }
            queueAr[tail] = null;
            tail--;
            return temp;
        } else {
            System.out.println("Queue is empty");
            return null;
        }
    }

    public void clear() {
        head = tail = -1;
        System.out.println("Data Clear");
    }

    public void showQueue(){
        if (isEmpty()){
            System.out.println("Queueu Empty");
        }else{
            
            for(int i = head; i <= tail; i++){
                Object temp = GetQueueElement(i);
                System.out.print(temp);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
    }
    public int showQueueLenght(){
        return maxsize;
    }

    public int QueueAmount(){
        return tail+1;
    }

    public Object GetQueueElement(int index){
        return queueAr[index];
    }

}
