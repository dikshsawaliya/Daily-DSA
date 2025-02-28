package com.company.Tress;

import java.util.Scanner;

public class BinaryTree {
    

    public  BinaryTree(){

    }

    private static class Node{

        private int  value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //insert elements

    public void populate(Scanner scanner){
        System.out.println("Enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root); 
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of the root node" + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left of the" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the right of the root node" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right of the" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }

    private void display(Node node, String indent){

        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,  indent + "\t");
        display(node.right,  indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(scanner);
        binaryTree.display();
    }
}
