import java.util.*;

public class runLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ans = "";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch != str.charAt(i + 1)) {
                ans = ans + count + ch;
                count = 1;
            } else {
                count++;
            }
        }
        ans = ans + count + str.charAt(str.length() - 1);
        System.out.println(ans);
        sc.close();
    }
}
