import org.junit.Test;

/**
 * Created by Administrator on 2018/10/21.
 */
public class testCase {

    @Test
    public void testZigZag() {
        String s = "A";
        System.out.println(new ZigZag().convert(s, 1));
    }

    @Test
    public void testLRUCacheCase() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }
}
