package leetcode.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyListTest {
    
    @Test
    public void testOne(){
        MyList<Character> myList = new MyList<>('A');
        assertEquals("A", myList.toString());
        myList.add('B');
        assertEquals("A, B", myList.toString());
    }
}
