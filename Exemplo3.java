import java.util.Arrays;

public class Exemplo3 {
    public void main(String[] args) {
//        CircularQueue<Integer> circularQueue = new CircularQueue<>(8);
//        circularQueue.enqueue(15);
//        circularQueue.enqueue(16);
//        circularQueue.enqueue(17);
//        circularQueue.enqueue(18);
//        circularQueue.enqueue(19);
//        circularQueue.enqueue(20);
//        circularQueue.enqueue(21);
//        circularQueue.enqueue(22);

        CircularQueue<String> circularQueue = new CircularQueue<>(8);
        circularQueue.enqueue("Banana");
        circularQueue.enqueue("Maça");
        circularQueue.enqueue("Pera");
        circularQueue.enqueue("Uva");
        circularQueue.enqueue("Abacaxi");
        circularQueue.enqueue("Melão");
        circularQueue.enqueue("Melancia");
        circularQueue.enqueue("Goiaba");
        System.out.println("Fila circular cheia: " + circularQueue);
        System.out.print("\nDesenfileirando elemento:");
        System.out.println(circularQueue.dequeue() + " ");
        circularQueue.enqueue("Mexerica");
        System.out.println("\nApós enfileirar o elemento Mexerica\n");
        //circularQueue.enqueue(23);
        System.out.println("\nApós enfileirar o elemento 23\n");
        System.out.println(circularQueue + "\n");
    }

    class CircularQueue<E> {
        private int currentSize;
        private E[] circularQueueElements;
        private int maxSize;
        private int rear;
        private int front;

        public CircularQueue(int maxSize) {
            this.maxSize = maxSize;
            circularQueueElements = (E[]) new Object[this.maxSize];
            currentSize = 0;
            front = -1;
            rear = -1;
        }

        public void enqueue(E item) throws QueueFullException {
            if (isFull()) {
                throw new QueueFullException("A fila está cheia!. O elemento não pode ser adicionado!");
            } else {
                rear = (rear + 1) % circularQueueElements.length;
                circularQueueElements[rear] = item;
                currentSize++;
                if (front == -1) {
                    front = rear;
                }
            }
        }

        public E dequeue() throws QueueEmptyException {
            E deQueuedElement;
            if (isEmpty()) {
                throw new QueueEmptyException("Fila circular vazia!. O Elemento não pode ser removido!");
            } else {
                deQueuedElement = circularQueueElements[front];
                circularQueueElements[front] = null;
                front = (front + 1) % circularQueueElements.length;
                currentSize--;
            }
            return deQueuedElement;
        }

        public boolean isFull() {
            return (currentSize == circularQueueElements.length);
        }

        public boolean isEmpty() {
            return (currentSize == 0);
        }

        @Override
        public String toString() {
            return "CircularQueue [" +
                    Arrays.toString(circularQueueElements) + "]";
        }
    }

    class QueueFullException extends RuntimeException {
        public QueueFullException() {
            super();
        }

        public QueueFullException(String message) {
            super(message);
        }
    }

    class QueueEmptyException extends RuntimeException {
        public QueueEmptyException() {
            super();
        }

        public QueueEmptyException(String message) {
            super(message);
        }
    }
}