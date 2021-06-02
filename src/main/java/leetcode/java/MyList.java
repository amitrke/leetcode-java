package leetcode.java;

/**
 * I am not sure if this question is there in Leetcode.
 */
public class MyList<T> {

    MyNode head;

    public MyList(T value) {
        head = new MyNode();
        head.value = value;
        head.next = null;
    }

    public void add(T value) {
        MyNode cursor = head;
        while(cursor.next != null) {
            cursor = cursor.next;
        }

        MyNode newNode = new MyNode();
        newNode.value = value;
        newNode.next = null;

        cursor.next = newNode;
    }

    @Override
    public String toString() {
        StringBuilder returnValue = new StringBuilder(); 
        MyNode cursor = head;
        do {
            returnValue.append(String.valueOf(cursor.value));
            if (cursor.next != null) {
                returnValue.append(", ");
                cursor = cursor.next;
            } else {
                break;
            }
        } while(true);
        return returnValue.toString();
    }

    class MyNode{
        T value;
        MyNode next;
    }
}
