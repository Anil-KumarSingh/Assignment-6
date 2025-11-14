//Check if a String contains only Digits using Recursion

public class Digits {
    static boolean only_Digits(String s){
        //Base case: if string is empty
        if(s.length()==0){
            return false;
        }
        //Base case: one character - check it its a= digit
        if(s.length()==1){
            return Character.isDigit(s.charAt(0));
        }

        //Recursive case: check first char and rest of string
        return Character.isDigit(s.charAt(0))&& only_Digits(s.substring(1));
    }
    public static void main(String[] args){
        System.out.println(only_Digits(""));
        System.out.println(only_Digits("12345"));
        System.out.println(only_Digits("12ab45"));
        System.out.println(only_Digits("00345"));
    }
}
