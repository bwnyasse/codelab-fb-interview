package leetcode.Amazon.hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Incorrect ! 
 * LRUCache
 */
public class LRUCache {

    private Map<Integer, Integer> values;
    private LinkedList<Integer> fifo;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.values = new HashMap<>();
        this.fifo = new LinkedList<>();
    }

    public int get(int key) {
        if(values.containsKey(key)){
            if(fifo.contains(key)){
                fifo.remove();
            }
            fifo.add(key);
            return values.get(key);
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {


        if (values.containsKey(key) || values.size() < capacity) {
            values.put(key, value);
            if(fifo.contains(key)){
                fifo.remove();
            }
            fifo.add(key);
        } else if (values.size() == capacity) {
            int keyToEvict = fifo.remove();
            values.remove(keyToEvict);
            values.put(key,value);
            fifo.add(key);
        }
    }
}