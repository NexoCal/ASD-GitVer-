public class tesQueueArray {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(10);
        System.out.println("Ukuran Queue: " + q.showQueueLenght());
        System.out.println("Queue kosong? "+q.isEmpty()+"\n");
        int i;
        Integer j;
        
        for(i = 0; i < 10; i++){
        j = (int)(Math.random()*100);
        q.enqueue(j);
        System.out.println("Total dalam Queue saat ini: "+ q.QueueAmount());
        }
        System.out.println("\nQueue penuh? "+q.isFull());
        q.showQueueLenght();
        q.enqueue(200);

        q.showQueue();
        

        System.out.println("\nHapus --> "+q.dequeue()); 
        System.out.println("Hapus --> "+q.dequeue());
        System.out.println("Hapus --> "+q.dequeue());

        q.showQueue();
        System.out.println("Total dalam Queue saat ini: "+ q.QueueAmount());


        }
}
