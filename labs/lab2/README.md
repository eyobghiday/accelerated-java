# Lab 3 - Arrays and Objects

## 06/25/2021

## Objectives

1. Learn to use arrays to store data
2. Learn to write data to a file
3. Learn how to write Java methods in a class
4. Learn to write instance variables and necessary methods in a class
5. Learn to test the Classes

## Exercises

1. Write a program that will continue to prompt the user for numbers until they enter "Done" to finish, then prompts the user for a file name so that these values can be saved to that file. For example, if the user enters "output.txt", then the program should write the numbers that have been read to "output.txt".

2. Write a program that will find the minimum value and print it to the console for the given array:
```
{72, 101, 108, 108, 111, 32, 101, 118, 101, 114, 121, 111, 110, 101, 33, 32, 76, 111, 111, 107, 32, 97, 116, 32, 116, 104, 101, 115, 101, 32, 99, 111, 111, 108, 32, 115, 121, 109, 98, 111, 108, 115, 58, 32, 63264, 32, 945, 32, 8747, 32, 8899, 32, 62421}
```

3. Write the class, `GeoLocation.java`. Do the following:
  * Create two instance variables, lat and lng, both of which should be doubles.
  * Write the default constructor.
  * Write the non-default constructor.
  * Write 2 accessor methods, one for each instance variable.
  * Write 2 mutator methods, one for each instance variable.
  * Write a method that will return the location in the format "(*lat*, *lng*)" (the toString method).
  * Write a method that will return true if the latitude is between `-90` and `+90`.
  * Write a method that will return true if the longitude is between `-180` and `+180`.
  * **Optional**: Write a method that will take a String in the format "(*lat*, *lng*)" and return a GeoLocation.
  * Now write an application class that instantiates two instances of `GeoLocation`. One instance should use the default constructor and the other should use the non-default constructor. Display the values of the instance variables by calling the accessor methods.

