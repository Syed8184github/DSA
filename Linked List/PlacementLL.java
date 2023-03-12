import java.util.*;
public class PlacementLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("syed");
        list.addLast("ls");
        System.out.println(list);
        System.out.println(list.size());

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
