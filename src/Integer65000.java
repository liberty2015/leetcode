import java.util.*;

/**
 * Created by Administrator on 2018/11/1.
 */
public class Integer65000 {

    public int[] findNum(int[] nums) {
//        HashMap<Integer,Boolean> map=new HashMap<>();
//        for (int i = 0; i <= 65535; i++) {
//            map.put(i,false);
//        }
//        for (int num :
//                nums) {
//            map.put(num, true);
//        }
//        List<Integer> list = new ArrayList<>();
//        for (Map.Entry<Integer, Boolean> entry:
//        map.entrySet()){
//            Boolean value = entry.getValue();
//            if (!value){
//                list.add(entry.getKey());
//            }
//        }
//        int[] result=new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i]=list.get(i);
//        }
//        return result;
        List<Integer> list = new ArrayList<>();
        boolean[] bools=new boolean[65535];
        for (int num :
                nums) {
            bools[num] = true;
        }
        for (int i = 0; i < bools.length; i++) {
            if (!bools[i]){
                list.add(i);
            }
        }
        int[] result=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }
        return result;
    }
}
