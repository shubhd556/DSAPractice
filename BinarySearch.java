import java.util.*;

public class Main {

    // Approach 1 : Basic approach
    public static int binarySearch(int []arr,int target)
    {
      int start =0,end = arr.length;
      while(start<=end)
      {
        int mid = (start+(end-start)/2);
        
        if(target>arr[mid])
        {
          start=mid+1;
        }
        else if(target<arr[mid])
        {
          end=mid-1;
        }
        else{
          return mid;
        }
      }
      
      return -1;
      
    }


    //Approach 2 : With Recursion 
    public static int binarySearchRecursion(int []arr,int target,int start,int end)
    {
      if(start<=end)
      {
        int mid = start+(end-start)/2;
        
        if(target>arr[mid])
        {
          return binarySearchRecursion(arr,target,mid+1,end);
        }
        else if(target<arr[mid])
        {
          return binarySearchRecursion(arr,target,start,mid-1);
        }
        else
        {
          return mid;
        }
      }
      return -1;
      
    }





    public static void main(String[] args) {
      
      int[] numbers = {10, 20, 30, 40, 50};
      System.out.println(binarySearch(numbers,0));
      
  }
}