/*
Double-ended Linkedlist implementation of a double ended que.
It works both as stack and que.
*/

package Assignments;

import java.util.Iterator;
import java.util.NoSuchElementException;

class DNode<Item>{
    Item value;
    DNode<Item> prev;
    DNode<Item> next;
}

public class Deque<Item> implements Iterable<Item>{

    private Item value;
    private DNode<Item> first;
    private DNode<Item> last;
    private int sizeDeque=0;

    public void addLast(Item item){
        DNode<Item> current=new DNode<>();
        current.value=item;
        current.prev=null;
        current.next=null;

        if(item==null){
            throw new IllegalArgumentException("null input. not allowed");
        }else{
            if(isEmpty()){
                first=current;
                last=current;
            }else{
                current.next=last;
                last.prev=current;
                last=current;
            }
            sizeDeque+=1;
        }
    }

    public void addFirst(Item item){
        DNode<Item> current=new DNode<>();
        current.value=item;
        current.prev=null;
        current.next=null;

        if(item==null){
            throw new IllegalArgumentException("null input. not allowed");
        }else{
            if(isEmpty()){
                first=current;
                last=current;
            }else{
                current.prev=first;
                first.next=current;
                first=current;
            }
            sizeDeque+=1;
        }
    }

    private void print(){
        DNode<Item> curr=last;
        while (curr!=null){
            System.out.print(curr.value+",");
            curr=curr.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){return sizeDeque==0;}

    public int size(){
        return sizeDeque;
    }

    public Deque(){
        value=null;
        first=null;
        last=null;
    }

    public Item removeFirst(){
        Item value=first.value;
        if(isEmpty()){
            throw new NoSuchElementException("empty deque. cant remove anything");
        }else{
            first.prev.next=null;
            first=first.prev;
        }
        sizeDeque-=1;
        return value;
    }

    public Item removeLast(){
        Item value=last.value;
        if(isEmpty()){
            throw new NoSuchElementException("empty deque. cant remove anything");
        }else{
            last.next.prev=null;
            last=last.next;
        }
        sizeDeque-=1;
        return value;
    }

    public static void main(String[] args) {
        Deque<String> dq=new Deque<>();
        dq.addFirst("a");
        dq.print();
        dq.addFirst("d");
        dq.print();
        dq.addLast("b");
        dq.print();
        dq.addFirst("c");
        dq.print();
        dq.addLast("e");
        dq.print();
        dq.removeFirst();
        dq.print();
        dq.removeFirst();
        dq.print();
        dq.removeLast();
        dq.print();
        dq.removeLast();
        dq.print();
    }

    private static class DequeIterator<Item> implements Iterator<Item>{

        DNode<Item> current;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item=current.value;
            current=current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove not allowed from iterator");
        }

        public DequeIterator(DNode<Item> node){
            current=node;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new DequeIterator<>(last);
    }
}
