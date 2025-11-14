// Write a recursive function that takes an integer as input and returns the total number of digits.

import java.util.*;
public class Count_Digits {
    static int Count_digits(int n){
        //base case if 'n' is a single digit number
        if (n/10==0){
            return 1;
        }
        else;
        return 1+Count_digits(n/10); //recursive call:remove one digit and count
    }
    public static void main(String[] args) {
        int n = 35646;
        int result=Count_digits(n);
        System.out.println(result);
    }
}
