import java.util.*;

public class permutationOfString {
    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private static void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            backtrack(chars, index + 1, result);
            swap(chars, index, i); // backtrack
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "ABC";
        List<String> permutations = permute(s);
        System.out.println(permutations);
    }
}