package org.prvn.labs.arrays;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class StaticArray {
  private int arr[];
  private int size;

  public StaticArray(){
    this(10);
  }

  public StaticArray(int length) {
    arr = new int[length];
  }

  public int insert(int value){

    if(size == arr.length){
      throw new RuntimeException("Array is already full");
    }
    arr[size++] = value;
    return value;
  }

  public void insert(int index, int value){
    if(index > arr.length  || index < 0 ){
       throw  new RuntimeException("index is out of range");
    }
    System.out.println("Previous value at index : " + index +" is  : " + arr[index]);
    arr[index] = value;
    System.out.println("Current value at index : " + index +" is  : " + arr[index]);
  }

  public void delete(int value){
    int index = search(value);

    if(index == 0){
      throw new RuntimeException("value not found");
    }
    IntStream.range(index,size-1).forEach(i -> arr[i] = arr[i+1]);

  }

  public int search(int value){
    AtomicInteger index = new AtomicInteger();
    IntStream.range(0, size-1).filter(i -> {
      if(arr[i]== value){
        index.set(i);
        return true;
      }
      return false;
    }).count();
    return index.get();
  }

  public void print(){
    IntStream.range(0, arr.length).forEach(i-> System.out.println(arr[i]));
  }
}
