# WEEK 2 - GENERICS
## 1. Create a generic class called Container that accepts one parameter, T. Create a no-arg constructor.
Declare a private variable, t of type T. Create a method, add that returns nothing, accepting a
parameter of generic type. Initialize this parameter to the initially declared variable. Create a generic
method called retrieve() that returns the initially declared variable.
Create a main method within the Container class. Create two containers of type Integer and String.
Append two objects to the containers, one of type Integer having value 50, another of type String
having value Java. Display the Integer and String objects from the respective containers.

```java
public class Container <T> {
    private T t;
    
    public Container() {}
    
    public void add(T t) {
        this.t = t;
    }
    
    public T retrieve() {
        return t;
    }
    
    public static void main(String[] args) {
        Container<Integer> number = new Container<>();
        number.add(50);
        System.out.println(number.retrieve());
        
        Container<String> word = new Container<>();
        word.add("Java");
        System.out.println(word.retrieve());
    }
}
```

## 2. Create a class called MyArray that has two methods, a main method that creates 3 arrays of
a) integer containing the numbers 1,2,3,4 and 5
b) string containing names, Jane, Tom and Bob
c) character containing alphabet, a, b and c
 and a generic method listAll that displays the list of arrays.
 ``` java
 public class MyArray {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] characters = {'a', 'b', 'c'};
        
        listAll(numbers);
        listAll(names);
        listAll(characters);
        
    }
    
    public static <T> void listAll(T[] array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}
```
 
## 3. What is a raw type? Why is a raw type unsafe? Why is the raw type allowed in Java?
In Java, a raw type is a generic type that is used without specifying its type parameter(s).

For example, consider the following generic class:

``` java
public class Container<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```

If you use this class without specifying a type parameter, like this:

``` java
Container container = new Container(); // raw type
```

Then container is considered a raw type because its type parameter has not been specified.

Raw types are unsafe because they allow for the mixing of incompatible types, which can result in runtime errors. For example, if you have a Container object that is supposed to hold String values, but you add an Integer value to it, you can get a ClassCastException at runtime when you try to retrieve the value.

Raw types are allowed in Java for backward compatibility with pre-Java 1.5 code, which did not have support for generics. By allowing raw types, Java code written before the introduction of generics can still compile and run, even if it is not type-safe. However, it is generally recommended to avoid raw types and use generics instead, as they provide type-safety and can catch errors at compile-time rather than runtime.


## 4. What is erasure? Why are Java generics implements using erasure?
Erasure is a process in Java Generics that replaces type parameters with their upper bounds or with Object if no upper bound is specified, and removes all generic type information at compile time. The resulting bytecode is then the same as if generics were not used at all.

For example, consider the following generic class definition:

```java
public class MyList<T> {
    private List<T> myList = new ArrayList<T>();
    //...
}
```

During compilation, ==the compiler will replace all occurrences of the type parameter T with its upper bound, or with Object if no upper bound is specified.== This means that the resulting bytecode will not contain any information about the type parameter T, as it has been erased.

Java generics are implemented using erasure to maintain backward compatibility with pre-existing code that was written before the introduction of generics in Java. By implementing generics using erasure, Java made it possible to use generic code with non-generic legacy code that was not designed with generics in mind.

Using erasure also has the advantage of reducing the memory footprint of generic classes, as the compiled bytecode does not contain any type information about the type parameters. This can lead to more efficient runtime performance and smaller compiled bytecode size.

However, the downside of using erasure is that it can lead to type safety issues at runtime, as the type information about the type parameters is lost during the compilation process. This means that the compiler cannot perform type checking at compile time, and the developer must take extra care to ensure type safety in their code.
