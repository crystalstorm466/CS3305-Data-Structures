//Name: David Holland
//Class: CS 3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 10-Part-1-Hashing

package Assignment10;


class HashNode {
    int key;
    int value;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;

    }
}


public class MyHashMap {
    int capacity;
    int size;

    HashNode[] array;
    HashNode dummy; //dummi

    public MyHashMap() {
        this.capacity = 20;
        this.size = 0;
        this.array = new HashNode[this.capacity];
        this.dummy = new HashNode(-1, -1);
    }

    public int hashCode(int key) { return key % this.capacity; } //implements hash function to find index for a key

    public void insertNode(int key, int value) { //function to add key value pair
        HashNode temp = new HashNode(key, value);
        int hashIndex = hashCode(key);

        while(this.array[hashIndex] != null && this.array[hashIndex].key != key && this.array[hashIndex].key != -1 ) {
            hashIndex++;
            hashIndex %= this.capacity;
        }

        //if a new node is inserted increase size
        if (array[hashIndex] == null || this.array[hashIndex].key == 1) {
            this.size++;
        }
        this.array[hashIndex] = temp;
    }

    // Function to delete a key value pair
    public int deleteNode(int key) {
        // Apply hash function to find index for given key
        int hashIndex = hashCode(key);
        // finding the node with given key
        while (this.array[hashIndex] != null) {
            // if node found
            if (this.array[hashIndex].key == key) {
                HashNode temp = this.array[hashIndex];
                // Insert dummy node here for further use
                this.array[hashIndex] = this.dummy;
                // Reduce size
                this.size--;
                return temp.value;
            }
            hashIndex++;
            hashIndex %= this.capacity;
        }
        // If not found return -1
        return -1;
    }

    // Function to search the value for a given key
    public int get(int key) {
        // Apply hash function to find index for given key
        int hashIndex = hashCode(key);
        int counter = 0;
        // finding the node with given key
        while (this.array[hashIndex] != null) {
            // If counter is greater than capacity to avoid infinite loop
            if (counter > this.capacity) {
                return -1;
            }
            // if node found return its value
            if (this.array[hashIndex].key == key) {
                return this.array[hashIndex].value;
            }
            hashIndex++;
            hashIndex %= this.capacity;
            counter++;
        }
        // If not found return 0
        return 0;
    }
    public int sizeOfMap() { return this.size; }

    public boolean isEmpty() { return this.size == 0; }

    public void display() {
        for (int i = 0; i < this.capacity; i++) {
            if (this.array[i] != null && this.array[i].key != -1) {
                System.out.println("key = " + this.array[i].key + " value = " + this.array[i].value);

            }
        }
    }

}
