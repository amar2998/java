
import java.util.Scanner;

class Node{
    public int val;
    public Node left;
    public Node right;
    Node(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
    
}



class Tree1{

    public static Node buildTree(Node root){    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the node");
        int data=sc.nextInt();

        Node node=new Node(data);
        root=node;
        if(data==-1){
            return null;
        }
        System.out.println("enter the data for left node");
        root.left=buildTree(root.left);
        System.out.println("enter the data for right node");
        root.right=buildTree(root.right);

        return root;

    }
    public static void main(String[] args){
        Node root=null;
        root=buildTree(root);
    }


}