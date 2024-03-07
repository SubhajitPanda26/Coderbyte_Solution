import java.util.*;

public class stringScramble {
    public static void main(String[] args) {
        String str1 = "coder";
        String str2 = "cdore";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1 = new String(arr1);
        String s2 = new String(arr2);
        if (s1.equals(s2))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
