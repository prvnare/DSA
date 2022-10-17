package org.prvn.labs.recursion;

import java.util.Arrays;

/**
  Recursion  --> calling a method with in the same method until its base condition satisfied

 Note :  1) Always there should be at least 1 base condition should be there to terminate the program otherwise program runs out of memory (STACK OVERFLOW)

 Exception in thread "main" java.lang.StackOverflowError

 */

public class BasicRecursion {

  public static void main(String[] args) {
    // print1toNUsingRecursion(1, 10);
    // printNto1UsingRecursion(10,10);
    // print1toNUsingRecursionBacktrack(10,10);
    // printNto1UsingRecursionBacktrack(1,10);
    // System.out.println(sumOfNNumbers(100));
    // System.out.println(factorial(8));
    // Arrays.stream(reverseAnArray(0, 7, new int[]{1, 2, 3, 4, 5, 6,7})).forEach(System.out::println);
    System.out.println(palindrome(0,6,"madama"));
  }

  public static void print1toNUsingRecursion(int start , int limit){
    //Base Condition
    if(start > limit){
      return;
    }
    System.out.println(start);
    // Recursive call
    print1toNUsingRecursion(start+1,limit);
  }

  public static void printNto1UsingRecursion(int start , int limit){
    //Base Condition
    if(start < 1){
      return;
    }
    System.out.println(start);
    // Recursive call
    printNto1UsingRecursion(start-1,limit);
  }

  public static void print1toNUsingRecursionBacktrack(int start , int limit){

    //Base Condition
    if(start < 1){
      return;
    }
    print1toNUsingRecursionBacktrack(start - 1 , limit);
    System.out.println(start);
  }

  public static void printNto1UsingRecursionBacktrack(int start , int limit){

    //Base Condition
    if(start > limit){
      return;
    }
    printNto1UsingRecursionBacktrack(start + 1 , limit);
    System.out.println(start);
  }

  public static  int sumOfNNumbers(int limit){

    if(limit < 1){
      return 0;
    }
    return limit + sumOfNNumbers(limit-1);

  }

  public static int factorial(int limit){
    if(limit == 1){
      return 1;
    }
    return limit * factorial(limit-1);
  }

  public static int[] reverseAnArray(int index, int size, int a[]){

    if(index >=size/2){
      return a;
    }
    int t = a[index];
    a[index]= a[size-1-index];
    a[size-1-index] = t;

    return reverseAnArray(index+1, size,a);
  }

  public static boolean palindrome(int index, int size,String value){

    if(index >= size/2){
      return true;
    }
    if(value.charAt(index)!= value.charAt(size-1-index)){
      return false;
    }
    return palindrome(index+1, size,value);
  }
}
