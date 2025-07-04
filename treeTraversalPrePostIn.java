import java.util.*;
public class treeTraversalPrePostIn{
    static Scanner s = new Scanner(System.in);

    static class Node{
        Node left,right;
        int data;

        public Node(int data){
            this.data = data;
        }
    }
    static Node createBinary(){
        System.out.println("enter the value: ");
        int data = s.nextInt();

        if(data == -1) return null;

        Node root = new Node(data);

        System.out.println("Enetr left of "+data);
        root.left = createBinary();

        System.out.println("Enter right of "+data);
        root.right = createBinary();
        
        return root;
    }
    static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root = createBinary();

         System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println();

        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        postorder(root);
        System.out.println();
    }
    
}