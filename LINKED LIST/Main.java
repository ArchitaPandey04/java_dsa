public class Main {
    public static void main(String[] args) {
    //   String  str = new String();  //str is storing a reference
    //   System.out.println(str.isBlank());


        Node node1 =   new Node(36);
        System.out.println(node1.data);
        System.out.println(node1.next);

        Node node2= new Node(65);
        node1.next=node2;
        System.out.println(node1.next.data);
        System.out.println(node2.next);
    }
}