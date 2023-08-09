package deque;

public class ArrayDeque<T> {
    int size=8;
    T[] array=(T[])new Object[size];

    int first_idx=size/2-1;
    int out_idx=size/2-1;
    ArrayDeque(){

    }
    public void resize(int new_size){
        T[] new_array=(T[])new Object[new_size];
        int new_first_idx=size/2-(out_idx-first_idx)/2;
        int new_out_idx=new_first_idx;
        for(T temp:array){
            new_array[new_out_idx]=temp;
            new_out_idx++;
        }
        out_idx=new_out_idx;
        first_idx=new_first_idx;
        size=new_size;
    }
    public void if_resize(){
        if(first_idx<0||out_idx>size){
            resize(size*2);
        }else if((out_idx-first_idx)<size/4&&size!=8){
            resize(size/2);
        }
    }

    public void addFirst(T item){
        if_resize();
        first_idx--;
        array[first_idx]=item;

    }
    public void addLast(T item){
        if_resize();
        array[out_idx]=item;
        out_idx++;
    }
    public boolean isEmpty(){
        if((out_idx-first_idx)==0){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        return out_idx-first_idx;
    }
    public void printDeque(){
        for(int i=first_idx;i<out_idx;i++)
            System.out.print(array[i]+" ");
    }
    public T removeFirst(){
        first_idx++;
        T temp=array[first_idx-1];
        if_resize();
        return temp;

    }
    public T removeLast(){
        T temp=array[out_idx-1];
        out_idx--;
        if_resize();
        return temp;
    }
    public T get(int index){
        return array[first_idx+index];
    }

}
