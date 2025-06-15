public class LinkedList<T> implements Queue<T>{
    Node<T> head;
    Node<T> tail;

    class Node<T>{
        T data;
        Node<T> prev;
        Node<T> next;
        Node(){

        }
        Node(T element){
            this.data = element;
        }
    }

    public boolean add(T element){
        if(head==null){
            head=new Node(element);
            tail=head;

        }
        else{
            Node t =new Node(element);
            tail.next = t;
            t.prev=tail;
            tail=t;
        }

        return true;
    }
    public boolean offer(T element){
        if(head==null){
            head=new Node(element);
            tail=head;

        }
        else{
            tail.next=new Node(element);
            tail=tail.next;
        }
        return true;
    }
    public T poll(){
        if(head==null){
            throw new NullPointerException("List is Empty....");
        }
        T val=head.data;
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        
        return null;
    }
    public T remove(){
        
        return this.poll();

    }
    public T element(){
        if(head==null){
            throw new NullPointerException();
        }
        return head.data;
    }
    public T peek(){
        if(head==null){
            throw new NullPointerException();
        }
        return head.data;
    }

    

    public boolean addFirst(T element){
        if(head==null){
            add(element);
        }
        else{
             Node t =new Node(element);
             t.next=head;
             head.prev=t;
             head=t;
        }
        return true;
    }
    public boolean addLast(T element){
        if(head==null){
            add(element);
        }
        else{
            Node t =new Node(element);
            t.prev=tail;
            tail.next = t;
            tail=t;
        }
        return true;
    }

    public T removeFirst(){
        if(head==null){
            throw new NullPointerException("NO VALUES INSERTED");
        }
        else{
            T val = head.data;
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return val;
        }
    }

    public T removeLast(){
        if(tail==null){
            throw new NullPointerException("NO VALUES INSERTED");
        }
        else{
            T val = tail.data;
            // System.out.println("a : "+this);
            tail=tail.prev;
            // System.out.println("a : "+this);
            if(tail!=null){
                // System.out.println("XXX");
                tail.next=null;
            }
            return val;
        }
    }

    // @Override
    public boolean isEmpty(){
        return head==null;
    }
    public String toString(){
        Node<T> temp = head;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while(temp!=null){
           str.append(temp.data);
            if(temp.next!=null){
                str.append(", ");
            }
            temp=temp.next;
        }
        str.append("]");
        
        return str.toString();
    }
    
}
