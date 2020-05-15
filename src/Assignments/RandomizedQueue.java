package Assignments;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

class RNode<Item>{
    Item value;
    RNode<Item> prev;
    RNode<Item> next;
}

public class RandomizedQueue<Item> implements Iterable<Item>{

    private Item value;
    private RNode<Item> first;
    private RNode<Item> last;
    private int sizeDeque=0;

    public void enqueue(Item item){
        RNode<Item> current=new RNode<>();
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

    private void print(){
        RNode<Item> curr=last;
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

    public Item sample(){
        RNode<Item> curr=first;
        if(isEmpty()){
            throw new NoSuchElementException("empty queue");
        }else{
            Random r=new Random();
            int position= r.nextInt(sizeDeque)+1;
            int count=1;
            while(count<position){
                curr = curr.prev;
                count+=1;
            }
        }
        return curr.value;
    }

    public RandomizedQueue(){
        value=null;
        first=null;
        last=null;
    }

    public Item dequeue(){
        Item value=sample();
        RNode<Item> curr=first;
        if(isEmpty()){
            throw new NoSuchElementException("empty queue");
        }else{
            while(curr.value!=value){
                curr=curr.prev;
            }
            curr.prev.next=curr.next;
            curr.next.prev=curr.prev;
            sizeDeque-=1;
        }
        return value;
    }

    public static void main(String[] args) {
        RandomizedQueue<String> rq=new RandomizedQueue<>();
        rq.enqueue("a");
        rq.enqueue("b");
        rq.enqueue("c");
        rq.enqueue("d");
        rq.enqueue("e");
        rq.print();
        rq.dequeue();
    }

    private static class RDequeIterator<Item> implements Iterator<Item>{

        RNode<Item> current;
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

        public RDequeIterator(RNode<Item> node){
            current=node;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new RDequeIterator<>(last);
    }
}
