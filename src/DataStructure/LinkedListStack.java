package DataStructure;

import java.util.Scanner;

class Node
{
    int value;
    Node next;
}

class LinkedListDemo{
    Node start;

    public void insertAtEnd(int data){
        Node addnode=new Node();
        addnode.value=data;

        if(start==null)
        {start=addnode;}

        else
        {Node n=start;
            while(n.next!=null){n=n.next;}
            n.next=addnode;
        }
    }

    public void search(int key){
        Node current=start;
        while(current!=null){if(current.value!=key){current=current.next;}
        else{System.out.println("Element Found");System.exit(0);}}

        if(current.next==null){System.out.println("Element Not Found");}
    }

    public void insertAtIndex(int index,int value){
        Node current=start;
        Node addnode=new Node();
        addnode.value=value;


        if(index==0){addnode.next=start;start=addnode;}

        else{
            for(int i=0;i<index-1;i++){current=current.next;}
            addnode.next=current.next;
            current.next=addnode;}
    }

    public void deleteAtIndex(int index){
        Node current=start;

        if(index==0){start=start.next;}

        else{for(int i=0;i<index-1;i++){current=current.next;}
            current.next=current.next.next;}
    }

    public void push(int value){
        insertAtIndex(0,value);
    }

    public void pop(){
        deleteAtIndex(0);
    }

    public void print(){
        Node current=start;
        while(current!=null){System.out.println(current.value+" ");current=current.next;}
    }
}

public class LinkedListStack{
    public static void main(String[] args) {

        LinkedListDemo l=new LinkedListDemo();
        Scanner sc=new Scanner(System.in);

        System.out.println("LINKED-LIST STACK DEMO. Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Inserting the elements");
        for(int i=1;i<=n;i++){System.out.println("Element "+i+":");int k=sc.nextInt();l.insertAtEnd(k);}

        System.out.println("Printing the LinkedList Stack");
        l.print();

        System.out.println("Push a value: ");
        int value = sc.nextInt();
        l.push(value);
        System.out.println("LinkedList Stack after push");
        l.print();


        System.out.println("Push another value: ");
        int value2 = sc.nextInt();
        l.push(value2);
        System.out.println("LinkedList Stack after push");
        l.print();

        System.out.println("Pop the Stack: ");
        l.pop();
        System.out.println("LinkedList Stack after pop");
        l.print();

        System.out.println("Pop the Stack: ");
        l.pop();
        System.out.println("LinkedList Stack after pop");
        l.print();

    }
}