package DataStructure;

import java.util.Scanner;

class QNode
{
    int value;
    QNode next;
}

class LinkedListQDemo{
    QNode start;

    public void deleteAtEnd(){
        QNode current=start;
        while((current.next!=null)&&(current.next.next!=null)){
            current=current.next;
        }
        current.next=null;
    }

    public void insertAtEnd(int data){
        QNode addnode=new QNode();
        addnode.value=data;

        if(start==null)
        {start=addnode;}

        else
        {QNode n=start;
            while(n.next!=null){n=n.next;}
            n.next=addnode;
        }
    }

    public void search(int key){
        QNode current=start;
        while(current!=null){if(current.value!=key){current=current.next;}
        else{System.out.println("Element Found");System.exit(0);}}

        if(current.next==null){System.out.println("Element Not Found");}
    }

    public void insertAtIndex(int index,int value){
        QNode current=start;
        QNode addnode=new QNode();
        addnode.value=value;


        if(index==0){addnode.next=start;start=addnode;}

        else{
            for(int i=0;i<index-1;i++){current=current.next;}
            addnode.next=current.next;
            current.next=addnode;}
    }

    public void deleteAtIndex(int index){
        QNode current=start;

        if(index==0){start=start.next;}

        else{for(int i=0;i<index-1;i++){current=current.next;}
            current.next=current.next.next;}
    }

    public void enque(int value){
        insertAtEnd(value);
    }

    public void deque(){
        deleteAtEnd();
    }

    public void print(){
        QNode current=start;
        while(current!=null){System.out.println(current.value+" ");current=current.next;}
    }

}

public class LinkedListQueue{
    public static void main(String[] args) {

        LinkedListQDemo l=new LinkedListQDemo();
        Scanner sc=new Scanner(System.in);

        System.out.println("LINKED-LIST QUEUE DEMO. Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Inserting the elements");
        for(int i=1;i<=n;i++){System.out.println("Element "+i+":");int k=sc.nextInt();l.insertAtEnd(k);}

        System.out.println("Printing the LinkedList Queue");
        l.print();

        System.out.println("Enque a value: ");
        int value = sc.nextInt();
        l.enque(value);
        System.out.println("LinkedList Queue after enque");
        l.print();

        System.out.println("Enque another value: ");
        int value2 = sc.nextInt();
        l.enque(value2);
        System.out.println("LinkedList Queue after enque");
        l.print();

        System.out.println("Deque the queue: ");
        l.deque();
        System.out.println("LinkedList Queue after deque");
        l.print();

        System.out.println("Deque the queue: ");
        l.deque();
        System.out.println("LinkedList Queue after deque");
        l.print();
    }
}