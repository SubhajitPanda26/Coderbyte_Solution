import java.util.*;

public class bracketMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(func(str));
        sc.close();
    }

    public static int func(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty())
                    st.pop();
                else
                    return 0;
            }
        }
        if (st.isEmpty())
            return 1;
        else
            return 0;
    }
}