/**
 * Class:Dice2
 * @author: Farhana Rahman
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 17,2023
 * Description:
 * Create an integer array named dice2 with a size of 6.
 * Populate each array location with a roll of a six-sided die
 * (hint: an int value of 1 through 6). Print the array out using an indexed for loop.
 */
import java.util.Random;

public class Dice2 {
    public static void main(String[] args) {
        // Create an array named dice2 with a size of 6
        int[] Dice2 = new int[6];

        // Populate each array location with a roll of a six-sided die
        Random random = new Random();
        for (int i = 0; i < Dice2.length; i++) {
            // Generate a random number between 1 and 6 (inclusive)
            Dice2[i] = random.nextInt(6) + 1;
        }

        // Print the array using an indexed for loop
        System.out.print("Dice2 = ");
        for (int i = 0; i < Dice2.length; i++) {
            System.out.print(Dice2[i] + " ");
        }
    }
}
