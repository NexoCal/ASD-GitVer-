public class StackArray<E> {
    public Object[] stackArr;
    protected int elementCount;

    public StackArray() {
        this.stackArr = new Object[10];
        this.elementCount = 0;
    }

    public boolean empty() {
        return this.elementCount == 0;
    }

    public int size() {
        return this.elementCount;
    }

    public Object peek() {
        if (this.elementCount == 0) {
            return null;
        }
        return this.stackArr[this.elementCount - 1];
    }

    public void clear() {
        if (this.elementCount == 0) {
            return;
        }
        for (int i = 0; i < this.elementCount; i++) {
            this.stackArr[0] = null;
        }
        this.elementCount = 0;
    }

    public int search(Object o) {
        int i = elementCount;
        while (--i >= 0) {
            if (o.equals(this.stackArr[i])) {
                return elementCount - i;
            }
        }
        return -1;
    }

    public void addCapacity() {
        int newCapacity = this.stackArr.length * 2;

        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < this.elementCount; i++) {
            newArray[i] = this.stackArr[i];
        }

        this.stackArr = newArray;
    }

    public void push(E obj) {
        if (this.elementCount == this.stackArr.length) {
            this.addCapacity();
        }
        this.stackArr[this.elementCount++] = obj;
    }

    public Object pop() {
        if (this.elementCount == 0) {
            return null;
        }
        Object obj = this.stackArr[--this.elementCount];
        this.stackArr[this.elementCount] = null;
        return obj;
    }

    public boolean isOperator(String ch) {
        String operators = "^*/+-";
        if (operators.contains(ch)) {
            return true;
        } else {
            return false;
        }
    }

    public double operation(double a, double b, String op) {
        if ("+".equals(op)) {
            return a + b;
        } else if ("-".equals(op)) {
            return a - b;
        } else if ("*".equals(op)) {
            return a * b;
        } else if ("^".equals(op)) {
            return Math.pow(a, b);
        } else {
            return a / b;
        }
    }
}
