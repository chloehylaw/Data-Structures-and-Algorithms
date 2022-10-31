/**
 * In this first question, you will be developing your own Binary Search Tree MyBST program (i.e., class) in two
 * versions.
 * In version 1 of your MyBST, you implement a recursive method to insert random integer keys in the BST.
 *
 * In this second question you will be using one version of your MyBST program from question 1, and add a method that
 * finds the total subtrees of the BST that are within the given range.
 */

import java.util.Scanner;

public class Recursive_BST {

    static class Node{
        int key;
        Node left, right;

        public Node(int data){
            key = data;
            left = right = null;
        }
    }

    Node root;

    Recursive_BST(){
        root = null;
    }

    void insert(int key){
        root = insertRecur(root, key);
    }

    // recursive method to insert a new key
    Node insertRecur(Node root, int key){
        // base case: if empty tree, return root
        if(root == null){
            root = new Node(key);
            return root;
        }
        // case 1: if key < leaf node key then insert left
        if(key < root.key){
            root.left = insertRecur(root.left, key);
        // case 2: if key > leaf node key then insert right
        }else if(key > root.key){
            root.right = insertRecur(root.right, key);
        }
        // returns the unchanged node pointer
        return root;
    }

    void inorder(){
        inorderTraversal(root);
    }
    // recursive method to print the inorder traversal
    void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    // class to keep track of the count because of recursion that loses track
    static class INT{
        int a;
    }
    // method to find the total subtrees within the given range
    static boolean numSubtree(Node root, int low, int high, INT count){
        // base case
        if(root == null) return true;

        // recur for left and right subtrees
        boolean left = numSubtree(root.left, low, high, count);
        boolean right = numSubtree(root.right, low, high, count);

        //if left tree, right tree, current node in range, increment count, return true
        if(left && right && root.key >= low && root.key <= high){
            ++count.a; // increments count and stores it in the class, no potential loss of data
            return true;
        }
        return false;
    }

    // initializes the count to 0 and calls numSubtree
    static INT getCount(Node root, int low, int high){
        INT count = new INT();
        count.a = 0; // initialize count to 0
        numSubtree(root, low, high, count);
        return count;
    }

    public static Node remove(Node root, int min, int max) {

        if(root == null) {
            return null;
        }

        root.left = remove(root.left, min, max);
        root.right = remove(root.right, min, max);

        if(root.key < min) {
            Node rightchild = root.right;
            root = null;
            return rightchild;
        }

        if(root.key > max) {
            Node leftchild = root.left;
            root = null;
            return leftchild;
        }

        return root;
    }

    public static void main(String[] args) {
        Recursive_BST tree = new Recursive_BST();
        System.out.println("\nQuestion 1\nThis is version 1: implement a RECURSIVE method to insert a random integer keys in the BST.");
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
        System.out.print("\n\nQuestion 2: Count the number of subtrees.\nInput the range: ");
        int[] range = new int[2];
        for(int i = 0; i < range.length; i++){
            range[i] = kb.nextInt();
        }
        System.out.println("The number of subtrees in the range [" + range[0] + ", " + range[1] + "] is " + getCount(tree.root, range[0], range[1]).a + ".");

        System.out.print("\nQuestion 3: Remove nodes outside the range.\nInput the range: ");
        int[] range2 = new int[2];
        for(int i = 0; i < range.length; i++){
            range2[i] = kb.nextInt();
        }
        remove(tree.root, range2[0], range2[1]);
        System.out.println("The new subtree: ");
        tree.inorder();

        System.out.println("End of Program");
    }

}
