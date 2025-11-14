//Check if an Array is Sorted (Strictly Increasing) using Recursion

public class Sorting_check {
    static boolean isSorted(int arr[],int n){
        //Base case: to check for single element and empty array
        if(n==0|| n==1) {
            return true;
        }
        //check for current pair and rest of the element of the array
        if(arr[n-2]<arr[n-1]){
            return isSorted(arr,n-1);
        }
        else;
         {
            return false;
        }
    }
        public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int arr2[]={4,3,7,3,8};
        boolean result1=isSorted(arr1,arr1.length);
        boolean result2=isSorted(arr2,arr1.length);
        System.out.println(result1);
        System.out.println(result2);

    }
}
