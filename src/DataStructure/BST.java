package DataStructure;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value){
        this.val=value;
        this.left=null;
        this.right=null;
    }
}
    /*
    public void search(int value){
        TreeNode curr=root;
        System.out.println("search func");
        System.out.println("root: "+curr.val);
        while(curr!=null){
            if(value<curr.val){
                curr=curr.left;
            }else if(value>curr.val){
                curr=curr.right;
            }else{
                System.out.println("Value "+value+" Found");
            }
        }
        System.out.println("Value "+value+" Not Found");
    }

    public void printLayers(TreeNode node){
        System.out.println(node.left.val+","+node.right.val);
    }

    public void printTree(){
        TreeNode curr=root;
        System.out.println("Root: "+curr.val);
    }
*/
public class BST {
        TreeNode root=new TreeNode(100);


        public void insert(int value){
            TreeNode node=new TreeNode(value);
            TreeNode curr=root;
            if((root.left==null)&&(root.right==null)){
                if(value<root.val){
                    root.left=node;
                }else{
                    root.right=node;
                }
            }else{
                while ((curr.left!=null)||(curr.right!=null)){
                    if(value<curr.val){
                        curr=curr.left;
                    }else{
                        curr=curr.right;
                    }
                }
                node=curr;
                node.val=value;
            }
        }

        public void search(int value){
            TreeNode curr=root;
            System.out.println("search func");
            System.out.println("root: "+curr.val);
            while(curr!=null){
                if(value<curr.val){
                    System.out.println("going left");
                    curr=curr.left;
                }else if(value>curr.val){
                    System.out.println("going right");
                    curr=curr.right;
                }else{
                    System.out.println("Value "+value+" Found");
                    return;
                }
            }
            System.out.println("Value "+value+" Not Found");
        }

        public static void main(String[] args) {
            BST bst=new BST();
            bst.insert(45);
            bst.insert(46);
            //bst.search(78);
            bst.search(45);
        }
}
