public class linked_list {
    Node head;
    private int size;
    linked_list(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //Add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head ==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //Add - last

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head ==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print ll
    public void printll(){
        if (head == null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data + " ->  ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //Delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //Delete Last
    public void deleteLast(){
        if (head==null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        if (head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node LastNode = head.next;
        while (LastNode.next!=null){
            LastNode = LastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //Size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
            linked_list li = new linked_list();
            li.addFirst("a");
            li.addFirst("is");
            li.printll();

            li.addLast("last");
            li.printll();
            li.addFirst("first");
            li.printll();

            li.deleteFirst();
            li.printll();

            li.deleteLast();
            li.printll();

        System.out.println(li.getSize());
        li.addFirst("first");
        System.out.println(li.getSize());
    }
}
