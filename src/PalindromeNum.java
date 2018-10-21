/**
 * Created by liberty on 2017/7/13.
 */
public class PalindromeNum {
    public static boolean isPalindrome(int x) {
        boolean result=true;
        String str=Integer.toString(x);
        char[] chars=str.toCharArray();
        int len=chars.length/2;
        int size=chars.length-1;
        for (int i=0;i<len;i++){
            if (chars[i]!=chars[size-i]){
                result=false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11233));
    }
}
