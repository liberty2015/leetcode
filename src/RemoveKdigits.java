/**
 * Created by Administrator on 2018/11/13.
 */

/**
 * https://leetcode-cn.com/problems/remove-k-digits/
 * 402. 移除K位数字
 * <p>
 * 采用贪心算法：依次求得[局部最优解]，最后得到[全局最优解]
 */

public class RemoveKdigits {

    public String removeKdigits(String num, int k) {
//        if (num.length() <= k)
//            return "0";
//        char[] chars = num.toCharArray();
//        int j = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            if (i+1==chars.length){
//                chars[i]=' ';
//                j++;
//                if (j == k)
//                    break;
//            }else if (chars[i] >= chars[i + 1]) {
//                chars[i] = ' ';
//                if (i==0&&chars[i+1]=='0'){
//                    chars[i+1]=' ';
//                    i++;
//                }
//                j++;
//                if (j == k)
//                    break;
//
//            }
//
//        }
//
//        char[] res = new char[chars.length - k];
//        j = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] != ' ') {
//                res[j++] = chars[i];
//            }
//        }
//        if (res.length==0){
//            res=new char[1];
//            res[0]='0';
//        }
//        return new String(res);
        int newLength = num.length()-k;
        char[] stack = new char[num.length()];
        int top = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (top > 0 && stack[top-1] > c && k > 0) {
                top--;
                k--;
            }
            stack[top++] = c;
        }
        int offset = 0;
        while (offset < newLength && stack[offset] == '0') {
            offset++;
        }

        return offset == newLength ? "0" : new String(stack, offset, newLength-offset);

    }

    public static void main(String[] args) {
        System.out.printf(new RemoveKdigits().removeKdigits("1234567890", 9));
    }
}
