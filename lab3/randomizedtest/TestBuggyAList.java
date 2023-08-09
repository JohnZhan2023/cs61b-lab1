package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */

public class TestBuggyAList {
    // YOUR TESTS HERE
    @Test
    public void show() {
        BuggyAList<Integer> Bl = new BuggyAList<Integer>();
        AListNoResizing<Integer> AnR = new AListNoResizing<Integer>();
        Bl.addLast(4);
        AnR.addLast(4);
        Bl.addLast(5);
        AnR.addLast(5);
        Bl.addLast(6);
        AnR.addLast(6);

        assertEquals(Bl.removeLast(), AnR.removeLast());
        assertEquals(Bl.removeLast(), AnR.removeLast());
        assertEquals(Bl.removeLast(), AnR.removeLast());
    }

    @Test
    public void randmizedTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> A = new BuggyAList<>();
        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 3);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                A.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size1 = L.size();
                int size2 = A.size();
                System.out.println("size: " + size1 + " and " + size2);
            } else if (operationNumber == 2) {
                // removeLast
                if (L.size() > 0) {
                    int val = L.removeLast();
                    System.out.println("L‘s Last value is: " + val);
                } else {
                    System.out.println("L NO VALUE");
                }
                if (A.size() > 0) {
                    int val = A.removeLast();
                    System.out.println("A‘s Last value is: " + val);
                } else {
                    System.out.println("A NO VALUE");
                }
            }
        }

    }
}