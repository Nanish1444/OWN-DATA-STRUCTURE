public interface Queue<T> {
    
    boolean add(T element);
    boolean offer(T element);
    T poll();
    T remove();
    T element();
    T peek();
    boolean isEmpty();
    
}