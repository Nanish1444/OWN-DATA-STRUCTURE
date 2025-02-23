import java.util.*;

class TestStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        int[] ar = {1,2,3,4,5,6,7,8,9,10,1,1,1,1,1,1,1,1,1,234,4342,5454646,5,5,5,5,5,5,5,5,5,5};
        for(int i=0;i<ar.length;i++){
            stack.push(ar[i]);
        }
        System.out.println(stack);
    }
}