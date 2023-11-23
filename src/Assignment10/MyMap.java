//Name: David Holland
//Class: CS 3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 10-Part-1-Hashing

package Assignment10;

import java.util.*;
public interface MyMap<K, V> {

    public void clear(); //Removes all entries from this map
    public boolean containsKey(K key);
    public Set<Entry<K, V>> entrySet();
    public V get(K key);
    public boolean isEmpty();
    public Set<K> keySet();
    public V put(K key, V value);
    public void remove(K key);
    public int size();
    public Set<V> values();

    public static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }

        @Override
        public String toString() { return "[" + key + ". " + value + "]" ;}

    }

}
