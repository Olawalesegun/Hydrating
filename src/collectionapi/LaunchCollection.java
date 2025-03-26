package collectionapi;

import java.lang.reflect.Array;
import java.util.*;

class ListEx{
    public static void main(String[] args) {
        List<Integer> arr2 = new ArrayList();
        arr2.add(7);
        // arr2.add(4, 9);

        ArrayList arr3 = new ArrayList();
        arr3.add(2);
        arr3.addFirst("B");

        for(Object obj: arr3){
            System.out.println("value is: " + obj);
        }

        PriorityQueue pq = new PriorityQueue();
        pq.add(5);
        pq.add(20);
        pq.add(3);
        pq.add(15);
        pq.add(17);

        Iterator itr = pq.iterator();

        while(itr.hasNext()){
            System.out.println("Using Iterator " + itr.next());
        }


}

public class LaunchCollection {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int arrLen = arr1.length;
        System.out.println("The length of mere array is: " + arrLen);

        arr1[0] = 2;
        arr1[1] = 3;
        arr1[2] = 4;
        arr1[3] = 5;
        arr1[4] = 6;

        System.out.println("Using Array Utility Class to fetch index 2: " + Array.get(arr1, 2));

        Array.set(arr1, 4, 9);

        for(int i: arr1){
            System.out.println("value is: " + i);
        }

        System.out.println("Getting the Array by index to return int: " + Array.getInt(arr1, 1));

        System.out.println("====================================================================");


    }
}
}
