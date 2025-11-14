//Count the Number of Zeros in a Number using Recursion

public class Zeroes {
    static int count_Zeroes(int n) {
        //Base case: if number is 0
        if (n == 0) {
            return 1;
        }

        //Base case: if Number is less than 10
        if (n < 10) {
            return 0;
        }

        //recursive case
        int last_Digit = n % 10;
        if (last_Digit == 0) {
            return 1 + count_Zeroes(n / 10);
        } else {
            return count_Zeroes(n / 10);
        }
    }
        public static void main (String[]args){
            int n = 12032000;
            System.out.println("Number of zeroes: " + count_Zeroes(n));
        }
    }

