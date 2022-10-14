package org.prvn.labs.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**

 Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.



 Example 1:

 Input:
 A[] = {1, 2, 4, 5, 7}
 B[] = {5, 6, 3, 4, 8}
 X = 9
 Output:
 1 8
 4 5
 5 4
 Explanation:
 (1, 8), (4, 5), (5, 4) are the
 pairs which sum to 9.

 Example 2:

 Input:
 A[] = {-1, -2, 4, -6, 5, 7}
 B[] = {6, 3, 4, 0}
 X = 8
 Output:
 4 4
 5 3


 Your Task:
 You don't need to read input or print anything. Your task is to complete the function allPairs() which takes the array A[], B[], its size N and M respectively and an integer X as inputs and returns the sorted vector pair values of all the pairs u,v where u belongs to array A and v belongs to array B. If no such pair exist return empty vector pair.
 Note : All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1<u2 then
 (u1,v1) should be printed first else second.


 Expected Time Complexity: O(NLog(N))
 Expected Auxiliary Space: O(N)


 Constraints:
 1 ≤ N, M ≤ 106
 -106 ≤ X, A[i], B[i] ≤ 106



 */
public class FairAllPairsWithGivenSum {

  public Pair[] allPairs( long A[], long B[], long N, long M, long X) {
    // Your code goes here
    ArrayList<Pair> list = new ArrayList();
    Arrays.sort(A);
    Arrays.sort(B);


    int count =0;
    for(int i = 0;i< N;i++){
      for(int j =0;j<M;j++){
        if(X== A[i] + B[j]){
          list.add(new Pair(A[i],B[j]));
        }
      }
    }
    Pair[] pairs = new Pair[list.size()];
    for(int i= 0;i< pairs.length;i++){
      pairs[i] = list.get(i);
    }
    return pairs;
  }
}
