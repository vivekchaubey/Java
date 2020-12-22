/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
* */
package Leet;

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
        {
            QNode n=start;
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
        while(current!=null){System.out.print(current.value+" ");current=current.next;}
    }

    public int toNumber(LinkedListQDemo ll){
        QNode current=start;
        int num=0;
        int factor=1;
        while(current!=null){
            num+=factor*current.value;
            current=current.next;
            factor=factor*10;
        }
        return num;
    }

    public LinkedListQDemo addLL(LinkedListQDemo ll1,LinkedListQDemo ll2){
        ll1.print();
        System.out.println();
        ll2.print();
        System.out.println();
        int num=ll1.toNumber(ll1)+ll2.toNumber(ll2);
        LinkedListQDemo ll=new LinkedListQDemo();
        while(num>=1){
            int each=num%10;
            num=(num-each)/10;
            ll.enque(each);
        }
        return ll;
    }
}

public class Leet002 {
    public static void main(String[] args) {
        //add 742
        LinkedListQDemo ll1=new LinkedListQDemo();
        ll1.enque(2);
        ll1.enque(8);
        ll1.enque(7);

        //add 853
        LinkedListQDemo ll2=new LinkedListQDemo();
        ll2.enque(3);
        ll2.enque(5);
        ll2.enque(8);

        LinkedListQDemo ll=ll1.addLL(ll1,ll2);
        ll.print();
    }
}
