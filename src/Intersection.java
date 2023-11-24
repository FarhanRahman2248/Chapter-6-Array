/**
 * Class:Intersection
 * @author: Farhana Rahman
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 17,2023
 * <p>
 * Description:
 * Create an new ArrayList named intersection that contains only those items that
 * occur in both lists. If a value is duplicated in either list and it occurs in both lists,
 * it should only occur once in the intersection list. For the lists provided,
 * your ArrayList should contain: 2 4 8 10
 */

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        // Define two arrays containing integers
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        // Create an ArrayList to store the intersection of list1 and list2
        ArrayList<Integer> intersection = new ArrayList<>();

        // Create an array to track whether an element from list2 has been added to the intersection
        boolean[] addedElements = new boolean[list2.length];

        // Iterate through elements in list1 using a traditional for loop
        for (int i = 0; i < list1.length; i++) {
            int value = list1[i];

            // Check for common elements with list2
            for (int j = 0; j < list2.length; j++) {
                // If a common element is found and it hasn't been added before
                if (list2[j] == value && !addedElements[j]) {
                    // Add the common element to the intersection list
                    intersection.add(value);
                    // Set the flag to true to mark the element as added
                    addedElements[j] = true;
                    // Break to avoid adding duplicates
                    break;
                }
            }
        }

        // Print the intersection ArrayList
        System.out.println("Intersection: " + intersection);
    }
}
