import java.util.*;

class MyStack<T> {
    private int length=-1;
    T[] stack;
    private static int SIZE=16;

    MyStack(){
        stack =(T[]) new Object[SIZE];
    }
    
    public void grow(){
        SIZE = SIZE+(SIZE/2);
        T[] temp = (T[]) new Object[SIZE];
        for(int i=0;i<stack.length;i++){
            temp[i]=stack[i];
        }
        stack=temp;
    }
    public void push(T value){
        
        length++;
        if(length>=SIZE){
            grow();
            
        }
        stack[length]=value;
        
        
    }

    public T pop(){
        if(length>=0 && length<SIZE){
            length--;
            return stack[length];
        }
        return null;
    }

    
    public T peek(){
        if(length>=0){
            return stack[length-1];
        }
        return null;
    }
    
    public boolean isEmpty(){
        return length==-1;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append('[');
        for(int i=0;i<length;i++){
            str.append(stack[i]);
            if(i<length-1){
                str.append(", ");
            }
        }
        str.append(']');
        return str.toString();
    }

}
