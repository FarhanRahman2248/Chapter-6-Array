/**
 * Class:RemoveErrantEntry
 * @author: Farhana Rahman
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: November 17,2023
 * Description:
 * Consider the follow ArrayList:
 * ArrayList<LocalDate> centennials = new ArrayList<>();
 * centennials.add(LocalDate.of(1776, Month.JULY, 4));
 * centennials.add(LocalDate.of(1876, Month.JULY, 4));
 * centennials.add(LocalDate.of(1900, Month.JULY, 4));
 * centennials.add(LocalDate.of(1976, Month.JULY, 4));
 * centennials.add(LocalDate.of(2076, Month.JULY, 4));
 * As you can observe, a java programmer has mistakenly entered the 1900
 * date item into the ArrayList. Without removing the associated
 * centennials.add(...) source line, write the code to remove the errant
 * entry.
 *
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RemoveErrantEntry {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        // Print ArrayList and size before removal
        System.out.println("Before removal:");
        printArrayList(centennials);
        System.out.println("size = " + centennials.size());

        // Remove the errant entry (1900) using removeIf
        centennials.removeIf(date -> date.getYear() == 1900);

        // Print ArrayList and size after removal
        System.out.println("After removal:");
        printArrayList(centennials);
        System.out.println("size = " + centennials.size());
    }

    private static void printArrayList(ArrayList<LocalDate> list) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        for (LocalDate date : list) {
            System.out.println(date.format(formatter));
        }
    }
}
