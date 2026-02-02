public class LinkedList {

    //  1 -> 2 -> 3 -> 4
    // 1 -> null

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        first.next = second;
        second.next = third;

        inserAtEnd(4, third);
        first = addInBegining(0, first);
        printNode(first);

    }

    static Node addInBegining(int data, Node head){

        Node node = new Node(data);
        node.next = head;
        return node;
    }


    static Node inserAtEnd(int data, Node head){

        Node node = new Node(data);

        if(head == null){
            return node;
        }

        head.next = node;
        return node;

    }


    // static void addInBetween(Node node, int newData){

    //     int temp;
    //     temp = node.next.data;
    //     node.next.data = newData;
    //     node.next

    // }


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