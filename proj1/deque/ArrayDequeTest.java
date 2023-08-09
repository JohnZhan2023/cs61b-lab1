package deque;

import org.junit.Test;

public class ArrayDequeTest {
    @Test
    public void ADcreate(){
        ArrayDeque<Integer> test=new ArrayDeque<Integer>();
        test.addFirst(1);
        test.addFirst(2);
        test.addLast(3);
        test.printDeque();
        int a=test.get(2);
        System.out.println("result is"+a+"and isempty result is "+test.isEmpty());

    }
}
