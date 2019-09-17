package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         */

        //Creating object using LinkedList
        Queue<Integer> qu = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4, 5, 7} to queue
        for (int i=0; i<7; i++)
            qu.add(i);

        // Show the elements in the queue.
        System.out.println("Elements in the queue are " + qu);

        // To remove the head of queue.
        int removedelement = qu.remove();
        System.out.println("Removed element is  " + removedelement);

        //Elements remained after removal
        System.out.println("Elements of the queue after removal are " + qu);

        // To view the head of queue
        int head = qu.peek();
        System.out.println("Head of the queue is now " + head);


         // size of queue
        int size = qu.size();
        System.out.println("Size of the queue is now " + size);


        // For loop to retrieve all the elements
        for(int i=0; i<size; i++){
            System.out.println(i);
        }
        System.out.println();
        Iterator<Integer> iterator=qu.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }

}
