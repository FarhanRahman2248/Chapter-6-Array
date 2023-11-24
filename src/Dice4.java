/**
 * Class:Dice4
 * @author: Farhana Rahman
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 17,2023
 * Description:
 * Create an ArrayList of Integers named dice4. Generate an Integer
 * representing a roll of a six-sided die 5 times, adding each result to
 * dice4. (hint: generate a random integer value between 1 and 6, inclusive).
 * Print the ArrayList using an enhanced for loop.
 */
import java.util.ArrayList;
import java.util.Random;

public class Dice4 {

        public static void main(String[] args) {
            // Create an ArrayList of Integers named dice4
            ArrayList<Integer> dice4 = new ArrayList<>();

            // Generate an Integer representing a roll of a six-sided die 5 times
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                // Generate a random number between 1 and 6 (inclusive)
                int roll = random.nextInt(6) + 1;
                // Add the result to dice4
                dice4.add(roll);
            }

            // Print the ArrayList using an enhanced for loop
            System.out.print("dice4 = ");
            for (int value : dice4) {
                System.out.print(value + " ");
            }
        }
    }


