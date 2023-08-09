package deque;

import java.util.Deque;
import java.util.Iterator;

public class LinkedListDeque<T> {
    public class Node{
        Node pre,next;
        T value;
        Node(){
            pre=null;
            next=null;
            value=null;
        }
        Node(T t){
            value=t;
            pre=null;
            next=null;
        }
    }
    Node sent;
    int size;

    LinkedListDeque(){
        size=0;
        sent=new Node();
        sent.next=sent;
        sent.pre=sent;
    }
    LinkedListDeque(Node node,int size_out){
        size=size_out;
        sent=node;
        sent.next=sent;
        sent.pre=sent;
    }
    public void addFirst(T item){
        Node add=new Node(item);
        add.next=sent.next;
        add.pre=sent;
        (sent.next).pre=add;
        sent.next=add;
        size+=1;

    }
    public void addLast(T item){
        Node add=new Node(item);
        add.next=sent;
        add.pre=sent.pre;
        (sent.pre).next=add;
        sent.pre=add;
        size+=1;

    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        return size;
    }
    public void printDeque(){
        Node temp=sent;
        for(int i=0;i<size;i+=1){
            System.out.print((temp.next).value+" ");
            temp=temp.next;
        }
    }
    public T removeFirst(){
        if(size()!=0){
            T t=sent.next.value;
            sent.next=(sent.next).next;
            (sent.next).pre=sent;
            return t;
        }else{
            return null;
        }
    }
    public T removeLast(){
        if(size()!=0){
            T t=sent.pre.value;
            sent.pre=(sent.pre).pre;
            (sent.pre).next=sent;
            return t;
        }else{
            return null;
        }
    }
    public T get(int index){
        Node temp=sent;
        if(size>index){
            for(int i=0;i<size;i++){
                temp=temp.next;
            }
            return temp.value;
        }else{
            return null;
        }
    }
    public Iterator<Node> iterator(){
        return new LLDIterator();
    }
    public class LLDIterator<Node> implements Iterator{
        int i=0;
        public boolean hasNext(){
            if(i<size){
                return true;
            }else{
                return false;
            }
        }
        public T next(){
            i++;
            return get(i);

        }


    }

    public boolean equals(Object o){
        if(!(o instanceof Deque)){
            return false;
        }
        Iterator seer1=iterator();
        Iterator seer2=((Deque)o).iterator();
        while(seer1.hasNext()|seer2.hasNext()){
            if(seer1.next()!=seer2.next())
                return false;
        }
        return true;
    }
    public T getRecursive(int index){
        if(size<index){
            return null;
        }else if(index==1){
            return (sent.next).value;
        }else{
            LinkedListDeque temp=new LinkedListDeque(sent,size-1);
            return getRecursive(index-1);
        }
    }





}
