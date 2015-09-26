import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A merge sort algorithm for practice at using/implementing algorithms in Java.
 * <p>
 * This implementation of merge sort is for sorting an array of integer data. There are utlity methods included to
 * help with the process of demonstrating the class.
 * </p>
 * <h2>Merge sort explained</h2>
 * <p>
 * Merge sort is a more complex algorithm than a bubble sort, however it is still relatively simple and is much more
 * efficient at sorting larger quantities of data. It is often referred to as a 'divide-and-conquer' algorithm for
 * the way in which it works. It was invented in 1945 by mathematician and computing pioneer John von Neumann.
 * Merge sort recursively divides the array of elements into smaller arrays, sorts them and then merges these
 * arrays into the completed sorted array.
 * </p>
 * <p>
 * Conceptually, merge sort works as follows:
 * <ol>
 * <li>Divide the unsorted list into two sublists of about half the size</li>
 * <li>Divide each of the two sublists recursively until we have list sizes of length 1</li>
 * <li>Merge the two sorted sublists back into one sorted sublist</li>
 * </ol>
 * </p>
 *
 * @author Peter Reid
 * @version 1.0
 * @see <a href="http://ds-algo.blogspot.co.uk/2007/06/merge-sort-explained.html">Explanation</a>
 * @since 26/09/15
 */
public class MergeSort {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mergeSortTestRun();
    }

    /**
     * A method to sort an array of integers using a merge sort algorithm
     *
     * @param arrayInts an array of integers
     * @return the sorted array of integers
     */
    public static int[] mergeSort(int[] arrayInts) {

        if (arrayInts.length <= 1) { // If the array is a single item already - return it
            return arrayInts;
        }

        //Split the mother array in two
        int[] arrayOne = new int[arrayInts.length / 2];
        int[] arrayTwo = new int[arrayInts.length - arrayOne.length];
        //Copy first half of arrayInts into arrayOne
        System.arraycopy(arrayInts, 0, arrayOne, 0, arrayOne.length);
        //Copy the second half of arrayInts into arrayTwo
        System.arraycopy(arrayInts, arrayOne.length, arrayTwo, 0, arrayTwo.length);

        //Sort each array recursively
        mergeSort(arrayOne);
        mergeSort(arrayTwo);

        //Merge the two arrays together overwriting the original array
        merge(arrayOne, arrayTwo, arrayInts);
        return arrayInts;

    }

    /**
     * A method to merge together arrays
     *
     * @param arrayOne the first array to merge
     * @param arrayTwo the second array to merge
     * @param arrayResult the third array to merge
     */
    public static void merge(int[] arrayOne, int[] arrayTwo, int[] arrayResult) {
        //Merge both arrays to form the result array
        //Next item to consider in first array
        int intFirst = 0;
        //Next item to consider in array two
        int intSecond = 0;

        //Next open index in result array
        int intOpen = 0;
        //As long as intFirst or intSecond is past the end move the smaller item into result
        while (intFirst < arrayOne.length && intSecond < arrayTwo.length){
            if (arrayOne[intFirst] < arrayTwo[intSecond]){
                arrayResult[intOpen] = arrayOne[intFirst];
                intFirst++;
             } else {
                arrayResult[intOpen] = arrayTwo[intSecond];
                intSecond++;
            }
            intOpen++;
        }
        //Copy what's left in the array
        System.arraycopy(arrayOne,intFirst,arrayResult,intOpen,arrayOne.length - intFirst);
        System.arraycopy(arrayTwo,intSecond, arrayResult, intOpen, arrayTwo.length - intSecond);
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
     * A utility method to run tests for the merge sort method.
     */
    public static void mergeSortTestRun() {
        //Declare vars
        int intInput = 0;

        System.out.println("How many numbers do you want to generate and sort?");
        try {
            intInput = input.nextInt();
            int[] testArray = generateRandomArray(intInput);
            System.out.println("Unsorted array: " + outArray(testArray));
            int[] sortedArray = mergeSort(testArray);
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
