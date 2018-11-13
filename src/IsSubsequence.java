/**
 * Created by Administrator on 2018/11/13.
 */

/**
 * https://leetcode-cn.com/problems/is-subsequence/
 * 392. 判断子序列
 */

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length()>100||s.length()>t.length())
            return false;
        if (s.length()==0)
            return true;
        int index=0;
        for (int i = 0; i < t.length(); i++) {
            if (index>=s.length())
                break;
            char c=s.charAt(index);
            if (c==t.charAt(i)){
                index++;
            }
        }

        return index>=s.length();
    }

    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("","ahbgdc"));
    }
}
