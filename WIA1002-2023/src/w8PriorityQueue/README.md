# Tutorial Priority Queue

## 1. Describe the main difference between Queue and PriorityQueue.
- priority queue arranges the elements based on priority
- queue solely based on first in first out\

## 2. Briefly provide THREE (3) real-life example in using PriorityQueue.
- printer queue
- operating system (instruction)
- resource allocation manager - jobs request at super computer facility

## 3. Show the output for every System.out.println ((a) – (f)) in the following code:

``` java
import java.util.*;
public static void main(String args[]) {
    PriorityQueue<String> pQueue = new PriorityQueue<String>();
    pQueue.offer("C++");
    pQueue.offer("Python");
    pQueue.offer("Java");
    pQueue.offer("Fortran");

    System.out.println("peek() gives us: "+ pQueue.peek()); //(a)
```
```
"peek() gives us: C++
```

``` java
    System.out.println("The queue elements:"); //(b)
    Iterator itr = pQueue.iterator();
    while (itr.hasNext())
    System.out.println(itr.next()); //(b)
```
```
The queue elements:
C++
Fortran
Java
Python
```

``` java
    pQueue.poll();
    System.out.println("After poll():"); //(c)
    Iterator<String> itr2 = pQueue.iterator();
    while (itr2.hasNext())
    System.out.println(itr2.next()); //(c)
```
```
After poll():
Fortran
Java
Python
```

``` java
    pQueue.remove("Java");
    System.out.println("After remove():"); //(d)
    Iterator<String> itr3 = pQueue.iterator();
    while (itr3.hasNext())
    System.out.println(itr3.next()); //(d)
```
```
After remove():
Fortran
Python
```

``` java
    boolean b = pQueue.contains("Ruby");
    System.out.println ( "Priority queue contains Ruby or not?: " + b); //(e)
```
```
Priority queue contains Ruby or not?: false
```

``` java
    Object[] arr = pQueue.toArray();
    System.out.println ( "Value in array: "); //(f)
    for (int i = 0; i<arr.length; i++)
    System.out.println ( "Value: " + arr[i].toString()) ; //(f)
}
```
```
Value: Fortran
Value: Python
```

## 4. Answer the following sub-questions with referring to the following code:
``` java
public class PriorityQueue2 {
    public static void main(String... args ){
        PriorityQueueComparator pqc=new PriorityQueueComparator();
        PriorityQueue<String> pq=new PriorityQueue<String>(5,pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        for(String s:pq){
            System.out.println(s);
        }
    }
}

public class PriorityQueueComparator implements Comparator<String>{
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
            return 0;
        }
}
```
### a) What is the purpose of the PriorityQueueComparator in the code?
Provides a customized algorithm to determine the magnitude of values / priorities of the elements

### b) What is the output for the code?
```
Muhamad
Ali
Jason
```
