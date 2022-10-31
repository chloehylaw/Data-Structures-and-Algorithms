/**
 * In this first question, you will be developing your own Binary Search Tree MyBST program (i.e., class) in two
 * versions.
 * In version 2 of your MyBST, you implement an iterative method to insert random integer keys in the BST
 */

import java.util.Scanner;

public class Iterative_BST {

    static class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    Node root;

    Iterative_BST(){
        root = null;
    }

    void insert(int key){
        root = insertIter(root, key);
    }

    // iterative method to insert a new key
    Node insertIter(Node root, int key){

        Node curr = root;      // y that starts traversing
        Node prev = null;    // y that maintains the trailing of x

        // if empty tree, create new node to set it as root
        if(root == null) return new Node(key);

        // traverse tree to find the parent node of the given key
        while(curr != null){
            prev = curr;
            if(key < curr.key)  // key less than current node, left
                curr = curr.left;
            else                // key more than current node, right
                curr = curr.right;
        }
        // if key < leaf node key then left parent pointer
        if(key < prev.key) prev.left = new Node(key);
        // if key > leaf node key then right parent pointer
        else prev.right = new Node(key);
        // returns the y of new node inserted
        return root;
    }

    void inorder(){
        inorderTraversal(root);
    }
    // recursive method to print inorder traversal
    void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Iterative_BST tree = new Iterative_BST();
        System.out.println("\nThis is version 1: implement a ITERATIVE method to insert a random integer keys in the BST.");
        Scanner kb = new Scanner(System.in);
        System.out.print("Please type in the number of keys you want to insert: ");
        int numKey = kb.nextInt();
        System.out.println("Type in " + numKey + " random integer keys. ");
        int[] arr = new int[numKey];
        for(int i = 0; i < numKey; i++){
            arr[i] = kb.nextInt();
            tree.insert(arr[i]);
        }
        System.out.println("Print the inorder traversal of the BST: ");
        tree.inorder();
    }

}
