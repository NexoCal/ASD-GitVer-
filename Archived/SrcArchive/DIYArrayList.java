
public class DIYArrayList <E>{

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_CONTAINER = {};
    Object[] elements;
    private int size;
    
    public DIYArrayList(){
        this(DEFAULT_CAPACITY);
        this.size = 0;
    }

    public DIYArrayList(int InitCapacity){
        if (InitCapacity > 0){
            this.elements = new Object[InitCapacity];
        }else if (InitCapacity == 0){
            this.elements = EMPTY_CONTAINER;
        }else{
            System.out.println("Illegal Capacity, Must be greater than -1");
            return;
        }
    }
}
