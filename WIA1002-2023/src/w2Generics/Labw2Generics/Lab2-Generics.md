# LAB 2 - GENERICS
## 1. Create a generic class called MyGeneric that accepts one parameter.Declare a variable called e for the type parameter. Create a no-argconstructor. Create a constructor that accepts one generic parameter.Create a setter and getter method for the generic type. Create a test program that creates two instances of generic class of type String called strObj and of type Integer called intObj. Set value for each of these objects. Display these values using the getter method.

``` java
public class MyGeneric <e> {
    private e stuff;
    
    public MyGeneric() {}
    
    public void set(e stuff) {
        this.stuff = stuff;
    }
        
    public e get() {
        return stuff;
    }
    
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric();
        strObj.set("hello");
        
        MyGeneric<Integer> intObj = new MyGeneric();
        intObj.set(2342);
        
        System.out.println("String object value     : " + strObj.get());
        System.out.println("Integer object value    : " + intObj.get());
    }
}
```
## 2. In a class called CompareMax, create a generic static method called maximum where the generic type extends the Comparable interface, which receives three parameters. Find the maximum of three values invoked by the main method.

``` java
public class CompareMax {
    public static void main(String[] args) {
        System.out.println(maximum(1,12,3));
        System.out.println(maximum(1232.32, 325.22, 234.23));
        
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(5);
        
        System.out.println(test);
    }
    
    static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        if(a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(c) > 0)
            return b;
        else 
            return c;
    }
    
}
```
##  3a)  Modify the following program to become a generic class called StorePairGeneric. 

```
    public class StorePair {
        private int first, second;

        public StorePair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

        public void setPair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return "first = " + first + " second = " + second;
        }
    }
```

``` java
public class StorePairGeneric <T> {
    private T first, second;
    
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }
}
```
## 3b) Override the Object equals() method in the StorePair class to compare the first values of two objects for equality.
``` java
@Override
    public boolean equals(Object obj) {
        return (obj == this.first);
    }
```

## 3c) Have the StorePair class implement the Comparable interface. Override the compareTo()method to compare the first values of two objects.
```java
public class StorePairGeneric <T> implements Comparable<T> {

    ...
    ...

    @Override
    public int compareTo(T o) {
        if (first > o) // error : bad operand type for binary operator
            return 1;
        if (first < o) // bad operand type for binary operator
            return -1; 
        return 0;
    }
}
```

## 3d) Create a test program that creates three objects of the StorePair generic class called a, b and c. Set the first and second values of a, b, c as (6,4), (2,2), (6,3).
``` java
work in progress...
```
## 3e) Invoke the compareTo()and equals() methods that compares the three objects created in (d) in the test program.
``` java
work in progress...
```