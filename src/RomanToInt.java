/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 * 13. Roman to Integer
 */

public class RomanToInt {

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int ret = 0;
        char prev=' ';
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if (ch=='I'){
                ret+=1;
            }else if (ch=='V'){
                if (prev=='I'){
                    ret--;
                    ret+=4;
                }else {
                    ret+=5;
                }
            }else if (ch=='X'){
                if (prev=='I'){
                    ret--;
                    ret+=9;
                }else {
                    ret+=10;
                }
            }else if (ch=='L'){
                if (prev=='X'){
                    ret-=10;
                    ret+=40;
                }else {
                    ret+=50;
                }
            }else if (ch=='C'){
                if (prev=='X'){
                    ret-=10;
                    ret+=90;
                }else {
                    ret+=100;
                }
            }else if (ch=='D'){
                if (prev=='C'){
                    ret-=100;
                    ret+=400;
                }else {
                    ret+=500;
                }
            }else if (ch=='M'){
                if (prev == 'C') {
                    ret-=100;
                    ret+=900;
                }else {
                    ret+=1000;
                }
            }

            prev=ch;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("MCMXCIV"));
    }
}
