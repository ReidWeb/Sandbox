# SelectionSort
A selection sort algorithm method for practice at using/implementing algorithms in Java.

This implementation of selection sort is for sorting an array of data. There are utility methods included to help with the process of demonstrating the class.

## Selection sort explained
Selection sort is a relatively simple algorithm for sorting data. It should only really be used to sort small quantities of data, as there are much more efficient means to sort larger quantities of data.

Selection sort is a relatively simple algorithm for sorting data. It is rather inefficient for large data sets. The sort works by finding the largest element in the array and placing at the end of the array.

## Documentation

### Method Detail

#### selectionSort
A method to sort an array of integers using a selection sort algorithm.
##### Examplary method reference (Java)
```java
public static int[] selectionSort(int[] arrayInts)
```
**Paramaters:**

*arrayInts* - an array of integers

**Returns:**

the sorted array of integers

#### generateRandomArray
A utility method to generate a random data set of integers, which can then be sorted.
##### Examplary method reference (Java)
```java
public static int[] generateRandomArray(int intNumItems)
```
**Paramaters:**

*intNumItems* -  the number of items in the desired data set.

**Returns:**

a randomly generated data set of integers

#### outArray
A utility method to generate a string output of an array
##### Examplary method reference (Java)
```java
public static java.lang.String outArray(int[] arrayData)
```
**Paramaters:**

*arrayData* -  the array you want to display

**Returns:**

a comma delimited string output of the array

#### selectionSortTestRun
A utility method to run tests for the selection sort method.
##### Examplary method reference (Java)
```java
public static void selectionSortTestRun()
```
