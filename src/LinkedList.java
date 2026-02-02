public class LinkedList {

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);


        first.next = second;
        second.next = third;

        printNode(first);

    }


    static void printNode(Node node){
        if(node == null){
            System.out.println("null");
            return;
        }
        System.out.print(node.data);
        System.out.print("->");
        printNode(node.next);
    }

}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}