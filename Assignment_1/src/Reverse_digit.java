// Reverse the Digits of a Number using Recursion

public class Reverse_digit {
    static int ans=0;
    static int reverse(int n){
        //Base case
        if(n==0){
            return ans;
        }
        if(n>0){
            int temp=n%10; //storing last digit
            ans=ans*10+temp; //stores reversed number
            reverse(n/10);
        }
        return ans;
    }
    public static void main(String[] args){
        int n=13708;
        int result=reverse(n);
        System.out.println("Reversed Number: " +result);
    }
}
