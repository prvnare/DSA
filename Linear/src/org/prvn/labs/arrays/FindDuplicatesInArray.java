package org.prvn.labs.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**

 Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

 Example 1:

 Input:
 N = 4
 a[] = {0,3,1,2}
 Output: -1
 Explanation: N=4 and all elements from 0
 to (N-1 = 3) are present in the given
 array. Therefore output is -1.

 Example 2:

 Input:
 N = 5
 a[] = {2,3,1,2,3}
 Output: 2 3
 Explanation: 2 and 3 occur more than once
 in the given array.

 Your Task:
 Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in sorted manner. If no such element is found, return list containing [-1].

 Expected Time Complexity: O(n).
 Expected Auxiliary Space: O(n).
 Note : The extra space is only for the array to be returned.
 Try and perform all operation withing the provided array.

 Constraints:
 1 <= N <= 105
 0 <= A[i] <= N-1, for each valid i

 */
public class FindDuplicatesInArray {
  public static ArrayList<Integer> duplicates(int arr[], int n) {

    // Takes more than the 4 sec ---> Not an Optimized solution


    // code here
    // Arrays.sort(arr);
    // ArrayList<Integer> list = new ArrayList<>();
    // for(int i=0; i<n-1;i++){
    //     if(arr[i] == arr[i+1] && !list.contains(arr[i])){
    //             list.add(arr[i]);
    //             i = i+1;
    //     }
    // }

    // if(list.size() == 0 ){
    //      list.add(-1);
    // }
    // return list;



    HashSet<Integer> h=new HashSet<>();
    HashSet<Integer> p=new HashSet<>();
    for(int i=0;i<arr.length;i++){
      if(h.contains(arr[i])==false){
        h.add(arr[i]);
      }
      else{
        p.add(arr[i]);
      }
    }
    if(p.isEmpty()){
      p.add(-1);
    }
    ArrayList<Integer> a=new ArrayList<>(p);
    Collections.sort(a);
    return a;
  }
}
