public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
            size++;
        }
    }

    //Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }

    //Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print ll
    public void printll(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //Delete -FIrst
    public void deleteFirst(){
        if (head==null){
            System.out.println("List is empty");
        }
        size--;
        head = head.next;
    }

    //Delete Last
    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL li = new LL();
        li.addFirst(1);
        li.addLast(4);
        li.printll();
        li.addFirst(5);
        li.addLast(3);
        li.printll();

        li.deleteFirst();
        li.printll();

        li.deleteLast();
        li.printll();

        li.getSize();
    }
}