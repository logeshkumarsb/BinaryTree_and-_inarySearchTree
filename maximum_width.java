my algo for finding maximum width of a tree
//first find the depth
public class Main {
   public  static int depth(TreeNode root){
   if(root==null){
       return 0;
    }
   int left=depth(root.left);
   int right=depth(root.right);
   return Math.max(left,right)+1;
    } 
   public static int width(TreeNode root){
  if(root==null){
       return 0;
    }
  int ans=depth(root)-1;
  return (int)Math.pow(2,ans);
    }  
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(5);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(5);
        System.out.println(width(root));
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
    }
}