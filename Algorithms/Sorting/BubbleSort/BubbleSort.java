import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A bubble sort algorithm method for practice at using/implementing algorithms
 * in Java.
 * <p>
 * This implementation of bubble sort is for sorting an array of data. There are
 * utility methods included to help with the process of demonstrating the class.
 * </p>
 * <h2>Bubble sort explained</h2>
 * <p>
 * Bubble sort is a relatively simple algorithm for sorting data. It should only
 * really be used to sort small quantities of data, as there are much more
 * efficient means to sort larger quantities of data.
 * </p>
 *
 * <p>
 * Bubble sort works by running along the dataset, and comparing the items of
 * data in pairs, it then determines if the order of the 2 items needs to be
 * switched to sort the data. This process repeats the whole way along the data
 * set, before repeating again. The process ends when a 'pass' over the dataset
 * occurs and no changes have been made.
 * </p>
 *
 * @author Peter Reid
 * @version 1.0
 */
public class BubbleSort {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bubbleSortTestRun();
    }

    /**
     * A method to sort an array of integers using a bubble sort algorithm.
     *
     * @param arrayInts an array of integers
     * @return the sorted array of integers
     */
    public static int[] bubbleSort(int[] arrayInts) {
        int changes;
        do {
            changes = 0;
            for (int index = 0; index < (arrayInts.length - 1); index++) {
                if (arrayInts[index] > arrayInts[index + 1]) { //If the item at 2nd index is larger
                    //Swap items around
                    int intTmp = arrayInts[index];
                    arrayInts[index] = arrayInts[index + 1];
                    arrayInts[index + 1] = intTmp;
                    changes++;
                }
            }
        } while (changes != 0);
        return arrayInts;
    }

    /**
     * A utility method to generate a random data set of integers, which can
     * then be sorted.
     *
     * @param intNumItems the number of items in the desired data set.
     * @return a randomly generated data set of integers
     */
    public static int[] generateRandomArray(int intNumItems) {
        //Create array
        int[] arrayInts = new int[intNumItems];

        //Generate random data
        for (int index = 0; index < intNumItems; index++) {
            arrayInts[index] = (int) (java.lang.Math.random() * 10000);
        }
        return arrayInts;
    }

    /**
     * A utility method to generate a string output of an array
     *
     * @param arrayData the array you want to display
     * @return a comma delimited string output of the array
     */
    public static String outArray(int[] arrayData) {
        String strOut = "";
        for (int index = 0; index < arrayData.length; index++) { //Loop along the array
            //Add each value to string
            strOut += arrayData[index];
            if (index < (arrayData.length - 1)) { //Output commas after each value up to the last
                strOut += ", ";
            }
        }
        return strOut;
    }


    /**
     * A utility method to run tests for the bubble sort method.
     */
    public static void bubbleSortTestRun() {
        //Declare vars
        int intInput = 0;

        System.out.println("How many numbers do you want to generate and sort?");
        try {
            intInput = input.nextInt();
            int[] testArray = generateRandomArray(intInput);
            System.out.println("Unsorted array: " + outArray(testArray));
            int[] sortedArray = bubbleSort(testArray);
            System.out.println("Sorted array: " + outArray(sortedArray));
        } catch (InputMismatchException imex) {
            System.out.println("Invalid input: please enter an integer value");
        } catch (NegativeArraySizeException nasex) {
            System.out.println("Invalid input: please enter a positive input value");
        } catch (Exception ex) {
            System.out.println("ERORR: " + ex.getMessage());
        }

    }

}
