package nyc.c4q.RosmaryFC;
/**
 * Created by c4q-rosmary on 4/3/15.
 */
/**
 * //notes: not sure if notes are acceptable in code!
 //System.out.println(aList);
 //        //how do I return an index?
 //        //        System.out.println(aList.indexOf(99));// equals 4
 //        //        System.out.println(aList.get(4));// equals 99
 //        //        System.out.println(aList.size());// equals 6
 //        //        System.out.println(aList.get(1));// equals 3
 //        //        System.out.println( search(aList, 2));//prints out 3 6 times and then -1
 //        System.out.println(search(aList, 99));
 //        System.out.println(search(aList, 2));
 //        System.out.println(search(aList, 60));

 //cannot iterate over ArrayList??
 //        for(int indexOf : aList) {
 //
 //        }
 */
import java.util.ArrayList;
import java.util.Scanner;

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

    for(int i = 1; i <= aList.size(); i++){//Iterates over aList
        if(aList.indexOf(x) == i) { //if index of x equals i, return that index(would be the first index of x)
            return aList.indexOf(x);
        }
    }
        return -1;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
    ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(3);
        aList.add(45);
        aList.add(1);
        aList.add(2);
        aList.add(99);
        aList.add(2);

        System.out.println("Give me a number: ");
        int x = input.nextInt();
        int searchResult = (search(aList,x));
        System.out.println("Your input " + x + " is at index " + searchResult);

    }

}
