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
    public Set<Entry<K, V>> entrySet(); //Returns a set consisting of the entries in this map
    public V get(K key);
    public boolean isEmpty();
    public Set<K> keySet(); //Returns a set consisting of the keys in this map
    public V put(K key, V value);
    public void remove(K key);
    public int size();
    public Set<V> values();

    public static class Entry<K, V> { //A key-value pair entry
        K key;
        V value;

        public Entry(K key, V value) { //Constructs an entry with the specified key and value
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; } //Returns the key stored in this entry
        public V getValue() { return value; } //Returns the value stored in this entry

        @Override
        public String toString() { return "[" + key + ". " + value + "]" ;}

    }

}
