//Convert decimal number to binary using recursion

public class D_to_B {
    static String decimal_to_binary(int n){
        //Base Case
        if (n == 0) {
            return "";
        }
        // Recursive case: divide by 2 and find remainder
        return decimal_to_binary(n/2)+(n%2);
    }
    public static void main(String[] args){
        int n=13;
        String binary=(n==0)?"0" : decimal_to_binary(n);
        System.out.println("Binary of " + n + " is " +binary);
    }
}
