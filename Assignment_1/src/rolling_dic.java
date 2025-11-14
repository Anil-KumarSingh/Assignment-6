import java.util.*;

public class rolling_dic {
    static int roll(int n){
        if(n%7==0)
            return n/7;
        else
            return n/7+1;
    }
    public static void main(String[] args) {
        int result = roll(2);
        System.out.println(result);
    }
}
