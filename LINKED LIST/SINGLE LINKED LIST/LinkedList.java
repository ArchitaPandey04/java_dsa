public class LinkedList{

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertatBegining(12);
        // linkedList.insertatBegining(11);
        linkedList.insertAtEnd(13);
        linkedList.insertAtEnd(908);
        linkedList.insertAtEnd(1023);
        linkedList.insertAtPosition(10, 4);
        linkedList.printData();
    }

    class Node 
    {
        public int data;
        public Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    Node head = null;

    // insert at begining
    public void insertatBegining(int item) {
       Node newNode = new Node(item);  //create a new node
        if(head==null){      //if list is empty
            head = newNode;    //make newNode the first node
            return;
        }
        newNode.next = head;  //link newnode to the old head
        head = newNode;    //update head to newNode
    }

    // insert at last
    public void insertAtEnd(int item){
        Node newNode = new Node(item);
        if(head==null){
            head = newNode;
            return;
        }

        Node temp=head;
        while(temp.next != null){

            temp = temp.next;
        }

        temp.next = newNode;
    }



// insert at specific position
    public void insertAtPosition(int item, int position){


        // new node created to insert
        Node newNode = new Node(item);

        // to check invalid position
        if(position<0){
            System.out.println("Invalid Position");
            return;
        }

    // check position at 0

    if(position==0){
        newNode.next = head;
        head = newNode;
        return;
    }

    // move befpore the specific position
    Node temp = head;
    int index = 0;
    while(temp.next!=null){
        if(index==position-1)
        break;
        temp = temp.next;
        index++;
    }



    if(temp==null){
        System.out.println("Posuition out of bound");
        return;
    }

    // insert;
    newNode.next=temp.next;
    temp.next=newNode;
}


public void printData(){
    if (head == null){
        System.out.println("Lineked List is empty");
        return;
    }
    Node temp = head;
    while(temp!=null){
        if(temp.next==null){
            System.out.print(temp.data);
        }
        else{

            System.out.print(temp.data+ "==> ");
        }
        temp=temp.next;
    }
 }

}