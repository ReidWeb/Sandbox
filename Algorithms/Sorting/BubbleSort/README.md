# BubbleSort
A bubble sort algorithm method for practice at using/implementing algorithms in Java.

This implementation of bubble sort is for sorting an array of data. There are utility methods included to help with the process of demonstrating the class.

## Bubble sort explained
Bubble sort is a relatively simple algorithm for sorting data. It should only really be used to sort small quantities of data, as there are much more efficient means to sort larger quantities of data.

Bubble sort works by running along the dataset, and comparing the items of data in pairs, it then determines if the order of the 2 items needs to be switched to sort the data. This process repeats the whole way along the data set, before repeating again. The process ends when a 'pass' over the dataset occurs and no changes have been made.

## Documentation

### Method Detail

#### bubbleSort
A method to sort an array of integers using a bubble sort algorithm.
##### Examplary method reference (Java)
```java
public static int[] bubbleSort(int[] arrayInts)
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

#### bubbleSortTestRun
A utility method to run tests for the bubble sort method.
##### Examplary method reference (Java)
```java
public static void bubbleSortTestRun()
```
