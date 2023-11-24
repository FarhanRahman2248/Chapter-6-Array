/**
 * Class:Dice1
 * @author: Farhana Rahman
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 17,2023
 * Description:
 * Create an integer array named dice1 with a size of 10.
 * Populate each array location with a roll of a six-sided die
 * (hint: an int value of 1 through 6). Print the array out using an enhanced for loop.
 */
import java.util.Random;

public class Dice1 {
    public static void main(String[] args) {
        // Create an array named dice1 with a size of 10
        int[] dice1 = new int[10];

        // Populate each array location with a roll of a six-sided die
        Random random = new Random();
        for (int i = 0; i < dice1.length; i++) {
            // Generate a random number between 1 and 6 (inclusive)
            dice1[i] = random.nextInt(6) + 1;
        }

        // Print the array using an enhanced for loop
        System.out.print("dice1 = ");
        for (int value : dice1) {
            System.out.print(value + " ");
        }
    }
}
