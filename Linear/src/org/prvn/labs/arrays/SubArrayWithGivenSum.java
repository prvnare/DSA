package org.prvn.labs.arrays;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

  static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
  {
    //ArrayList<Integer> list = new ArrayList<>();
    // Your code here
    // for(int i =0 ; i<n; i++){
    //     if(arr[i] == s){
    //          list.add(i+1);
    //          list.add(i+1);
    //          break;
    //     }
    //     int temp = arr[i];
    //     for(int j = i+1 ; j<n; j++){
    //         temp =  temp + arr[j];
    //         if(temp == s){
    //             list.add(i+1);
    //             list.add(j+1);
    //             break;
    //         }
    //     }
    //      if(temp == s){
    //             break;
    //         }
    // }
    // if(list.size()==0){
    //     list.add(-1);
    // }
    // return list;
    int k=0;
    int sum=0;
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i];
      if(sum==s)
      {
        list.add(k+1);
        list.add(i+1);
        break;
      }
      if(sum>s)
      {
        i=k;
        k++;
        sum=0;
      }
    }
    if(list.size()==0)
    {
      list.add(-1);
    }
    return list;
  }
}
