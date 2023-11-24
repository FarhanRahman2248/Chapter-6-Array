/**
 * Class:ArrayListSizeExample
 * @author: Farhana Rahman
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 17,2023
 * Description:
 * Consider the follow ArrayList:
 * ArrayList<LocalDate> centennials = new ArrayList<>();
 * centennials.add(LocalDate.of(1776, Month.JULY, 4));
 * centennials.add(LocalDate.of(1876, Month.JULY, 4));
 * centennials.add(LocalDate.of(1976, Month.JULY, 4));
 * centennials.add(LocalDate.of(2076, Month.JULY, 4));
 * write the code necessary to determine the ArrayList size.
 */
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ArrayListSizeExample {

        public static void main(String[] args) {
            ArrayList<LocalDate> centennials = new ArrayList<>();
            centennials.add(LocalDate.of(1776, Month.JULY, 4));
            centennials.add(LocalDate.of(1876, Month.JULY, 4));
            centennials.add(LocalDate.of(1976, Month.JULY, 4));
            centennials.add(LocalDate.of(2076, Month.JULY, 4));

            // Determine the ArrayList size
            int size = centennials.size();

            // Print the size
            System.out.println("size = " + size);
        }
    }


