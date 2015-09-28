import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A selection sort algorithm method for practice at using/implementing algorithms in Java.
 * <p>
 * This implementation of selection sort is for sorting an array of data. There are utility methods included to help
 * with the process of demonstrating the class.
 * </p>
 * <h2>Selection sort explained</h2>
 * <p>
 *     Selection sort is a relatively simple algorithm for sorting data. It is rather inefficient for large data sets.
 *     The sort works by finding the largest element in the array and placing at the end of the array.
 * </p>
 *
 * @author Peter Reid
 * @version 1.0
 * @since 28/09/2015
 */
public class SelectionSort {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        selectionSortTestRun();
    }

    /**
     * A method to sort an array of integers using a merge sort algorithm
     *
     * @param arrayInts an array of integers
     * @return the sorted array of integers
     */
    public static int[] selectionSort(int [] arrayInts) {

        int intArrayLen = arrayInts.length;
        int intMin;

        for (int index = 0; index < (intArrayLen); index++) {

            //Set the initial index of the min value to the first element
            intMin = index;

            for (int indexTwo = intMin + 1; indexTwo < intArrayLen; indexTwo++) {

                if (arrayInts[indexTwo] < arrayInts[intMin]) { //If this element is less than current min, then it is new min
                    //Found new min
                    intMin = indexTwo;
                }
            }

            if (intMin != index) {
                //Swap values
                int intTmp = arrayInts[index];
                arrayInts[index] = arrayInts[intMin];
                arrayInts[intMin] = intTmp;
            }

        }
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
     * A utility method to run tests for the selection sort method.
     */
    public static void selectionSortTestRun() {
        //Declare vars
        int intInput = 0;

        System.out.println("How many numbers do you want to generate and sort?");
        try {
            intInput = input.nextInt();
            int[] testArray = generateRandomArray(intInput);
            System.out.println("Unsorted array: " + outArray(testArray));
            int[] sortedArray = selectionSort(testArray);
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
