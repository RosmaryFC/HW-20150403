package nyc.c4q.RosmaryFC;
/**
 * Created by c4q-rosmary on 4/3/15.
 */

import java.util.ArrayList;

/**
 * 1. Linear Search on ArrayList

 You are given an ArrayList of unknown size containing integers.
 Write a class called LinearSearch which implements a static method search which
 accepts as input an ArrayList alist and an integer x, and returns the first index it
 sees of x in alist. If the integer is not present return in the list return -1

 Eg. if arraylist contains: [3, 45, 1, 2, 99] and x = 1
 Returns : 2
 */
public class LinearSearch {
    public static int search (ArrayList aList, int x) {
    //cannot iterate over ArrayList??
//        for(int indexOf : aList) {
//
//        }

    for(int i = 0; i < aList.size(); i++){
        aList.indexOf(x);

    }


        return -1;
    }


    public static void main (String[] args) {
    ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(3);
        aList.add(45);
        aList.add(1);
        aList.add(2);
        aList.add(99);
        System.out.println(aList);
        //how do I return an index?
        System.out.println(aList.indexOf(99));
        System.out.println(aList.size());

        System.out.println( search(aList, 2));
    }

}
