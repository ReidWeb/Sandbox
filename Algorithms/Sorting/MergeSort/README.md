# MergeSort
A merge sort algorithm for practice at using/implementing algorithms in Java.

This implementation of merge sort is for sorting an array of integer data. There are utlity methods included to help with the process of demonstrating the class.

## Merge sort explained
Merge sort is a more complex algorithm than a bubble sort, however it is still relatively simple and is much more efficient at sorting larger quantities of data. It is often referred to as a 'divide-and-conquer' algorithm for the way in which it works. It was invented in 1945 by mathematician and computing pioneer John von Neumann. 

Merge sort recursively divides the array of elements into smaller arrays, sorts them and then merges these arrays into the completed sorted array.

Conceptually, merge sort works as follows:

1. Divide the unsorted list into two sublists of about half the size
2. Divide each of the two sublists recursively until we have list sizes of length 1
3. Merge the two sorted sublists back into one sorted sublist

Developed with the assistance of [reference material](http://ds-algo.blogspot.co.uk/2007/06/merge-sort-explained.html).

## Documentation

### Method Detail

#### mergeSort
A method to sort an array of integers using a merge sort algorithm.
##### Examplary method reference (Java)
```java
public static int[] mergeSort(int[] arrayInts)
```
**Paramaters:**

*arrayInts* - an array of integers

**Returns:**

the sorted array of integers

#### merge

A method to merge together arrays

##### Examplary method reference (Java)
```java
public static void merge(int[] arrayOne, int[] arrayTwo, int[] arrayResult)
```
**Paramaters:**

*arrayOne* - the first array to merge
*arrayTwo* - the second array to merge
*arrayResult* - the third array to merge

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

#### mergeSortTestRun
A utility method to run tests for the merge sort method.
##### Examplary method reference (Java)
```java
public static void mergeSortTestRun()
```
