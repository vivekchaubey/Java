/* In UnionandFind2, we created a tree that may not be balanced.
* An unbalanced tree may lead to a single chain in the worst case
* and we may need to iterate via all the nodes which destroys the
* purpose of the tree. In this case, we will also keep a note of the
* size of the tree and we will attach smaller trees, directly to the
* node of the bigger tree. This will keep the trees balanced. */

package Algorithms1;

import java.util.HashMap;

public class UnionAndFind3 {

    //creating a hashmap to keep the name of node and size of the tree
    public HashMap<Integer,Integer> rootSizeMap=new HashMap<>();

    // initializing all the single nodes as tree of size 1
    public void initRootSize(int[] input){
        for(int i=0;i<input.length;i++){
            rootSizeMap.put(i,1);
        }
    }

    // find root of the node by going a level up everytime
    public int rootFinder(int[] input,int p){
        while(input[p]!=p){
            p=input[p];
        }
        return p;
    }

    // if roots of the nodes are same, nodes are connected
    public boolean connectStatus(int[] input, int p, int q){
        return rootFinder(input, p) == rootFinder(input, q);
    }

    // check the root size of a give node
    public int getRootSize(int[] input,int p)
    {
        int root=rootFinder(input,p);
        return rootSizeMap.get(root);
    }

    // checking the nodes and their sizes. inserting the subtree accordingly
    public int[] union(int[] input,int p,int q){

        int sizeq=getRootSize(input,q);
        int sizep=getRootSize(input,p);

        if(!connectStatus(input,p,q))
        {
            if(sizeq>sizep){
                input[rootFinder(input,p)]=input[q];
                rootSizeMap.put(rootFinder(input,q),sizeq);
            }else if(sizeq<sizep) {
                input[rootFinder(input,q)]=input[p];
                rootSizeMap.put(rootFinder(input,p),sizep);
            } else {
                    input[rootFinder(input,p)]=input[q];
                    rootSizeMap.put(rootFinder(input,q),sizeq+1);
            }
        }
        return input;
    }

    // main function and basic operations
    public static void main(String[] args) {
        UnionAndFind3 uf=new UnionAndFind3();
        System.out.println("Welcome to the weighted union and find dynamic connectivity");
        System.out.println("Elements 0-9 initialized as input");
        int[] input=new int[]{0,1,2,3,4,5,6,7,8,9};
        uf.initRootSize(input);

        input=uf.union(input,3,4);
        input=uf.union(input,3,8);
        input=uf.union(input,6,5);
        input=uf.union(input,9,3);
        input=uf.union(input,2,1);
        input=uf.union(input,6,0);
        input=uf.union(input,2,7);
        input=uf.union(input,6,1);
        uf.getRootSize(input,6);
    }
}
