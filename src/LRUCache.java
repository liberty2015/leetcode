import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/245/data-structure/1032/
 */
public class LRUCache {

    private LRULinkedHashMap lruLinkedHashMap;

    public LRUCache(int capacity) {
        this.lruLinkedHashMap = new LRULinkedHashMap(capacity);
    }

    public int get(int key) {
        Integer val=this.lruLinkedHashMap.get(key);
        if (val!=null){
            return val;
        }else {
            return -1;
        }
//        return this.lruLinkedHashMap.get(key);
    }

    public void put(int key, int value) {
        this.lruLinkedHashMap.put(key, value);
    }


    private class LRULinkedHashMap extends LinkedHashMap<Integer, Integer> {

        int initCapacity;

        LRULinkedHashMap(int capacity) {
            super(capacity, 0.75f, true);
            initCapacity = capacity;
        }

        /**
         *
         * 重写LinkedHashMap 的removeEldestEntry方法，以实现LRU算法，
         * 告诉afterNodeInsertion函数是否可以删掉最老最少使用的元素
         * https://blog.csdn.net/ns_code/article/details/37867985
         */
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > initCapacity;
        }
    }
}
