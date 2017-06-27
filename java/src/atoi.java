/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class atoi {
    public static int myAtoi(String str){
        if (str==null||str.equals("")){
            return 0;
        }
        str=str.trim();
        char[] chars = str.toCharArray();
        double num=0;
        int length=chars.length;
        char fix=chars[0];
        int flag=0;
        int i=0;
        if (fix=='+'){
            i++;
            flag=1;
        }else if (fix=='-'){
            flag=-1;
            i++;
        }
        for(;i<length;i++){
            if (chars[i]>=48&&chars[i]<=57){
                int a=chars[i]-48;
                num=num*10;
                num+=a;
            }
            else {
                break;
            }
        }
        if (flag==1){
            num=+num;
        }else if (flag==-1){
            num=-num;
        }
        if (num>Integer.MAX_VALUE){
            num=Integer.MAX_VALUE;
        }else if (num<Integer.MIN_VALUE){
            num=Integer.MIN_VALUE;
        }
        return (int) num;
    }

    public static int atoi1(String str) {
        if (str == null || str.length() < 1)
            return 0;

        // trim white spaces
        str = str.trim();

        char flag = '+';

        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        // use double to store result
        double result = 0;

        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-')
            result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        String num="2147483648";
        System.out.println(myAtoi(num));
    }
}
