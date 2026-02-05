public class LinkedList {

    //  1 -> 2 -> 3 -> 4
    // 1 -> null

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        first.next = second;
        second.next = third;

        insertAtEnd(4, third);
        first = addInBeginning(0, first);

        addInBetween(second, third, 6);
        printNode(first);
        deleteNode(first, 3);
        printNode(first);

//        System.out.println(findNode(first, 2));

    }

    static Node deleteNode(Node head, int deletionData){

        if( head == null){
            return null;
        }

        if(head.data == deletionData){
            return head.next;
        }
        Node current = head;

        while (current.next != null){
            if(current.next.data == deletionData){
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }

        return head;
    }

    static int findNode(Node head, int searchData){
        int count =0;

        while(head != null){
            if(head.data == searchData){
                return count;
            }
            count++;
            head = head.next;
        }
        return count;
    }


    static Node addInBeginning(int data, Node head){

        Node node = new Node(data);
        node.next = head;
        return node;
    }


    static Node insertAtEnd(int data, Node head){

        Node node = new Node(data);

        if(head == null){
            return node;
        }

        head.next = node;
        return node;

    }


     static void addInBetween(Node beforeNode,Node afterNode,  int newData){

       Node newNode = new Node(newData);
       beforeNode.next = newNode;
       newNode.next  = afterNode;
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