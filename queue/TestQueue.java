
public class TestQueue{
    public static void main(String[]args){
        Queue<String> q = new LinkedList<>();
        q.add("Nanish");
        q.add("Kaviya");
        System.out.println(q);


        System.out.println("LINKED LIST");
        LinkedList<Integer> link = new LinkedList();
        link.addFirst(66);
        link.add(66);
        link.add(23);
        link.add(345);
        link.add(57);
        System.out.println(link);
        System.out.println(link.removeLast());

        System.out.println(link);
    }
}