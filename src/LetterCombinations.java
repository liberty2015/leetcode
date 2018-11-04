import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits))
            return new ArrayList<>();

        String[] letters = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        char[] chars = digits.toCharArray();

        List<String> res = new ArrayList<>();
        LinkedList<Character> stack = new LinkedList<>();
        letterCombine(0, stack, res, chars, letters);
        return res;
    }

    private void letterCombine(int i, LinkedList<Character> stack, List<String> res, char[] digits, String[] letters) {

        if (i > digits.length - 1) {
            StringBuilder sb = new StringBuilder();
            for (int k = stack.size() - 1; k >= 0; k--) {
                sb.append(stack.get(k));
            }
            String resStr = sb.toString();
            res.add(resStr);
            return;
        }
        int digit = digits[i] - 48;
        String letter = letters[digit - 1];
        ++i;
        for (int k = 0; k < letter.length(); k++) {
            stack.push(letter.charAt(k));
            letterCombine(i, stack, res, digits, letters);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        String test = "23";
        List<String> strings = new LetterCombinations().letterCombinations(test);
        System.out.println(Arrays.toString(strings.toArray()));
    }
}
