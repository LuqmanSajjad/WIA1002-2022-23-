package finalS12020;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jad
 */

/*
well the question actually allows accessing Node in the main class itself
*/
public class HashMap {
    Node head;
    int size=0;
    
    public <V> void put (String key, V element) {
        Node current = getNode(key);
        if (current != null) {
            current.element = element;
        }
        
        Node<V> newNode = new Node<>(key, element);
        if (size==0) head = newNode;
        else {
            current = head;
            while(current.next!=null) {
                current = current.next;
            }  
            current.next = newNode;
        }
        size++;
    }
    
    public Object get (String key) {
        Node current = getNode(key);
        return current.element;
    }
    
    public Node getNode (String key) {
        if (size==0) return null;
        Node<?> current = head;
        while (current!=null) {
            if (key.equals(current.key)) {
                return current;        
            }
            current = current.next;
        }
        return null;
    }
    
    public String toString() {
        String output="";
        if (size==0) return "hashmap is empty";
        else {
            Node current = head;
            while (current!=null) {
                output += current.key + ": " + current.element.toString() + "\n";
                current = current.next;
            }
        }
        return output;
    }
    
    public static void main(String[] args) {
        HashMap hash = new HashMap();
        hash.put("name", "Sheila");
        hash.put("age", 90);
        hash.put("balance", 234.20);
        
        System.out.println(hash.toString());
    }
    
    
}

class Node <Object> {
    String key;
    Object element;
    Node next;
    
    public Node (String id, Object element) {
        this.key = id;
        this.element = element;
    }
}
