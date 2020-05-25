//Tree type union and find

package Algorithms1;

public class UnionAndFind2 {

    /* find root of each node. takes input array and the node.
     goes one level up if the id of the input is not input itself
     because, this is where root exists */
    public int rootFinder(int[] input,int p){
        while(input[p]!=p){
            p=input[p];
        }
        return p;
    }

    // if the roots of two nodes are equal. means connected
    public boolean connectStatus(int[] input, int p, int q){
        return rootFinder(input, p) == rootFinder(input, q);
    }

    /* if the input nodes are not connected, connect the root of one
    * node to the other node. this creates a tree structure */
    public int[] union(int[] input,int p,int q){
        if(!connectStatus(input,p,q))
        {
            input[rootFinder(input,p)]=input[q];
        }
        return input;
    }

    // main function and basic check operations
    public static void main(String[] args) {
        UnionAndFind2 uf=new UnionAndFind2();
        System.out.println("Welcome to second best union and find dynamic connectivity");

        System.out.println("Elements 0-9 initialized below as input");
        int[] input=new int[]{0,1,2,3,4,5,6,7,8,9};

        input=uf.union(input,3,4);
        input=uf.union(input,4,8);
        input=uf.union(input,5,6);
        input=uf.union(input,9,8);
        input=uf.union(input,2,1);
        input=uf.union(input,5,0);
        input=uf.union(input,7,1);
        input=uf.union(input,5,1);
    }
}
