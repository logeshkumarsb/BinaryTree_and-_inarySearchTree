import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Node {
    int data;
    ArrayList<Node> children;
    Node(int data){
        this.data=data;
        children=new ArrayList<>();
    }
}
class Tree{
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the root data");
        Queue<Node> pendingChild=new LinkedList<Node>();
        int rootdata=input.nextInt();
        if(rootdata==-1){
           return;
        }
        Node root=new Node(rootdata);
        pendingChild.add(root);
        while(!pendingChild.isEmpty()){
            Node front=pendingChild.poll();
            System.out.println("How many child you need");
            int n=input.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter the data of "+i+" th child of "+front.data);
                int child=input.nextInt();
                Node childNode=new Node(child);
                front.children.add(childNode);
                pendingChild.add(childNode);
            }
        }   
        Print(root);     
    }
    public void Print(Node root){
        if(root==null){
            System.out.println("Tree is Empty");
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            while(count-->0){
                Node front=q.poll();
                System.out.print(root.data+" ");
                for(int i=0;i<front.children.size();i++){
                    q.add(front.children.get(i));
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Tree node=new Tree();
        node.input();
    }
}
