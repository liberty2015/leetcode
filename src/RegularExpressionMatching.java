/**
 * Created by liberty on 2017/7/15.
 */
public class RegularExpressionMatching {
    static class Point{
        int point;
    }

    public static boolean isMatch(String s, String p) {
        Point i=new Point(),j=new Point();
        i.point=0;
        j.point=0;
        for (;i.point<s.length();i.point++){
            if (j.point>=p.length())
                return false;
            char cs=s.charAt(i.point);
            char cp=p.charAt(j.point);
            if (cs==cp||cp=='.'){
                j.point++;
                continue;
            }
            if (cp=='*'){
                if (j.point==0){
                    return false;
                }
                if (matchStar(s,p,i,j)){
                    continue;
                }else return false;
            }
//            if (j.point>0){
                if (j.point<p.length()-1&&p.charAt(j.point+1)=='*'){
//                    if (!matchPrevStar(s,p,i,j)){
//                        return false;
//                    }
                    j.point+=2;
                    i.point--;
                    continue;
                }else {
                    return false;
                }
//            }else {
//                return false;
//            }
        }
        if (j.point<p.length()-1)
            return false;
        return true;
    }

    private static boolean matchStar(String s,String p,Point i,Point j){
        char cpPrev=p.charAt(j.point-1);
        for (;i.point<s.length();i.point++){
            char cs=s.charAt(i.point);
            if (cpPrev==cs||cpPrev=='.'){
                i.point++;
            }else {
                return false;
            }
        }
        return true;
    }

    private static boolean matchPrevStar(String s,String p,Point i,Point j){
        char cpPrev=p.charAt(j.point);
        for (;i.point<s.length();i.point++){
            char cs=s.charAt(i.point);
            if (cpPrev==cs||cpPrev=='.'){
                i.point++;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aab";
        String p="c*a*b";
        System.out.println(isMatch(s,p));
    }
}
