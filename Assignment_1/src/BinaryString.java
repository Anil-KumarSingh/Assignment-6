import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class BinaryString {
    // recursive function to generate all binary strings
    static void binStrRec(char[] s, int i, ArrayList<String> res) {
        //base case:
        int n = s.length;
        if (i == n) {
            res.add(new String(s));
            return;
        }
        // assign '0' at current position
        s[i] = '0';
        binStrRec(s, i + 1, res);

        //assign 1 to next position
        s[i] = '1';
        binStrRec(s, i + 1, res);
    }
    static ArrayList<String> binstr(int n) {
        char[] s = new char[n];
        Arrays.fill(s, '0');
        ArrayList<String> res = new ArrayList<>();
        binStrRec(s, 0, res);
        return res;
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = binstr(n);
        for (String x : ans) System.out.print(x + " ");
    }
}
