/**
 * Created by Administrator on 2018/11/5.
 */

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 */

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s==null||"".equals(s))
            return true;
        if (s.length()==1){
            return false;
        }
        int i=0,j=s.length()-1;
        while (i<j){
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            char ch2=s.charAt(j);
            if (ch=='('){
                if (ch1==')'){
                    i=i+2;
                }else if (ch2==')'){
                    i++;
                    j--;
                }else {
                    return false;
                }
            }else if (ch=='['){
                if (ch1==']'){
                    i=i+2;
                }else if (ch2==']'){
                    i++;
                    j--;
                }else {
                    return false;
                }
            }else if (ch=='{'){
                if (ch1=='}'){
                    i=i+2;
                }else if (ch2=='}'){
                    i++;
                    j--;
                }else {
                    return false;
                }
            }else if (ch==')'||ch=='}'||ch==']'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(new ValidParentheses().isValid("){"));
    }
}
