import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static int maxLevel=0;
    public static void main(String[] args) {
        Node root= new Node(10);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(1);
        root.left.right=new Node(2);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        /*
                   10
            3              4
        1       2       5      6

         */

        Node temp=root;
        System.out.println("pre order traversal....");
        preOrderTraversal(temp);
        System.out.println();
        System.out.println("in order traversal....");
        inOrderTraversal(temp);
        System.out.println();
        System.out.println("post order traversal....");
        postOrderTraversal(temp);
        System.out.println();
        Queue<Node> queue= new LinkedList<>();
        System.out.println("level order traversal....");
        levelOrderTraversal(temp,queue);
        System.out.println();
        System.out.println("Leaf Nodes....");

        int count=countLeafNodes(temp);
        System.out.println(count);
        System.out.println("left view....");
        leftView(temp,1);
        System.out.println();
        System.out.println("Height....");
        int height=height(temp);
        System.out.println(height);
    }

    private static void preOrderTraversal(Node node){
       /* if(node==null){
            return;
        }*/
        if(node!=null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    private static void inOrderTraversal(Node node){
        if(node==null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data +" ");
        inOrderTraversal(node.right);
    }
    private static void postOrderTraversal(Node node){
        if(node==null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data +" ");
    }

    private static void levelOrderTraversal(Node node,Queue<Node> queue){
        queue.add(node);
        while(!queue.isEmpty()){
           Node n=queue.remove();
           if(n!=null) {
               System.out.print(n.data +" ");
               queue.add(n.left);
               queue.add(n.right);
           }
        }
    }

    private static int countLeafNodes(Node node){

        if(node==null){
            return 0;
        }
        else if(node.left==null&& node.right==null){
            return 1;
        }
        else return countLeafNodes(node.left)+countLeafNodes(node.right);
    }

    private static void leftView(Node node,int level){

        if(node==null){
            return;
        }
        if(maxLevel<level){
            System.out.print(node.data+" ");
            maxLevel=level;
        }
        leftView(node.left,level+1);
        leftView(node.right,level+1);
    }

    private static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+Math.max(leftHeight,rightHeight);

    }
}
