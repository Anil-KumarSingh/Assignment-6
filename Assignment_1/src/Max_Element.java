//write a recursive function to find and return the maximum element from a given array.

public class Max_Element {
       static int find_Max(int arr[],int n) {
           //Base case:if single element is present
           if (n == 1) {
               return (arr[0]);
           }
           //find max in smaller array
           int max = find_Max(arr, n - 1);

           //compare the last element with max of the rest elements
           return Math.max(arr[n - 1], max);
       }
       public static void main(String[] args){
           int arr[]={3,4,1,7,9};
           int result=find_Max(arr,arr.length);
           System.out.println("Maximum element:" + result);
       }

}
