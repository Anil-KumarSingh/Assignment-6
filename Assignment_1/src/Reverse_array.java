//Reverse an array using recursion

public class Reverse_array {
    static int[] reverse_Array(int arr[], int index){
        //Base case: when first and last element are same
        if(index==arr.length){
            return new int[arr.length];
        }
         //recursive call
        int[] reversed=reverse_Array(arr, index+1);

        //fill reversed array from end
        reversed[arr.length-1-index]=arr[index];
        return reversed;
    }

    //print array
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.println("Original Array: ");
        printArray(arr);
        int[] reversed=reverse_Array(arr,0);
        System.out.println("Reversed array");
        printArray(reversed);
    }
}
