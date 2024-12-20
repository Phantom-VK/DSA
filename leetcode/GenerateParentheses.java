package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backTrack(new StringBuilder(), n, 0, 0);
        return result;
    }

    private void backTrack(StringBuilder current, int n, int openN, int closeN) {
        if (openN == n && closeN == n) {
            result.add(current.toString());
            return;
        }

        if (openN < n) {
            current.append("(");
            backTrack(current, n, openN + 1, closeN);
            current.deleteCharAt(current.length() - 1);
        }

        if (closeN < openN) {
            current.append(")");
            backTrack(current, n, openN, closeN + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
