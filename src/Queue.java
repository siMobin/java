public class Queue {
    private int maxSize; // maximum size of the queue
    private int[] queueArray; // array to store the elements of the queue
    private int front; // index of the front element
    private int rear; // index of the rear element
    private int nItems; // number of items in the queue

    /**
     * Constructor to initialize the queue with a given size.
     * 
     * @param size the maximum size of the queue
     */
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * Inserts an element into the queue.
     * 
     * @param value the value to be inserted
     */
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full, cannot insert " + value);
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    /**
     * Removes and returns the front element from the queue.
     * 
     * @return the front element
     */
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    /**
     * Returns the front element of the queue without removing it.
     * 
     * @return the front element
     */
    public int peekFront() {
        return queueArray[front];
    }

    /**
     * Checks if the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return (nItems == 0);
    }

    /**
     * Checks if the queue is full.
     * 
     * @return true if the queue is full, false otherwise
     */
    public boolean isFull() {
        return (nItems == maxSize);
    }

    /**
     * Returns the number of items in the queue.
     * 
     * @return the number of items
     */
    public int size() {
        return nItems;
    }
}

class TestQueue {
    /**
     * Main method to test the Queue class.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        System.out.println("Size of queue: " + queue.size());
        System.out.println("Front element: " + queue.peekFront());

        while (!queue.isEmpty()) {
            System.out.println("Removed element: " + queue.remove());
        }
    }
}