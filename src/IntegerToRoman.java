/**
 * Created by liberty on 2017/7/16.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        if (num<1||num>3999){
            return "";
        }
        StringBuilder builder=new StringBuilder();
        String numStr=Integer.toString(num);
        char[] chars=numStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c=chars[i];
            int level=chars.length-i;
            int n=(c-48)*level;
            int n1=c-48;
            switch (level){
                case 4:
                    for (int j=0;j<n1;i++){
                        builder.append("M");
                    }
                    break;
                case 3:
                    if (n1<5){
                        int n2=5-n1;
                        for ()
                    }else if (n1>5){

                    }else {
                        builder.append("D");
                    }
                    break;
                case 2:

                    break;
                case 1:

                    break;
            }
        }

    }

    public static void main(String[] args) {

    }
}
