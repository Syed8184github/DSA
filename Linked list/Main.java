class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    void printLL(){
        Node curr = this.head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print(curr);
    }
    void add(int a){
       Node temp = new Node(a);
       if(head==null){
        head=temp;
       }
       else{
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
       }
    }
    void addFirst(int d){
        Node temp=new Node(d);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }
    void addIndex(int index,int element) throws IndexOutOfBoundsException{
        try{
            if(index==0){
                addFirst(element);
            }
            else{
                Node temp = new Node(element);
                int count =0;
                Node curr = this.head;
                while(count<index-1){
                    curr = curr.next;
                    count++;
                }
                temp.next=curr.next;
                curr.next=temp;
            }
        }catch(NullPointerException e){
            throw new IndexOutOfBoundsException();
        }
    
        }
}
class Main{
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);

        li.printLL();
        System.out.println();
        // li.addFirst(5);
        // li.addFirst(41);
        li.addIndex(25,5);
        li.printLL();
    }
}