# Lab Stacks week 6

## Question 1
a) create a MyStack class using ArrayList. Implement the following methods

``` java
public class MyStack <E> {
    private ArrayList<E> stack = new ArrayList<>();
    
    public void push(E o) {
        stack.add(o);
    }
    
    public E pop() {
        return stack.remove(stack.size() -1);
    }
    
    public E peek() {
        return stack.get(stack.size() -1);
    }
    
    public int getSize() {
        return stack.size();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public String toString() {
        return stack.toString();
    }
    
    public boolean search(E o) {
        return stack.contains(o);
    }
}
```

b) Write a test program for Q1(a) called TestMyStack class. Create a stack of type Character from MyStack.
    1) Following the given order, add elements, a b and c in the stack. 
    2) Print the stack. 
    3) Check if element ‘b’ is in the stack. 
    4) Check if element ‘k’ is in the stack

``` java
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> chars = new MyStack<>();
        chars.push('a');
        chars.push('b');
        chars.push('c');

        System.out.println("characters Stack: " + chars.toString());

        System.out.println("Element 'b' presence in stack: " + chars.search('b'));

        System.out.println("Element 'k' presence in stack: " + chars.search('k'));
    }
}
```

c) In the same test program as Q1(b), create a second stack of type integer.
    1) Following the given order, add elements, 1 2 and 3 in the stack.
    2) Print the stack.
    3) Check if element ‘6’ is in the stack.

``` java
MyStack<Integer> ints = new MyStack<>();
ints.push(1);
ints.push(2);
ints.push(3);

System.out.println("\n\nintegers stack: "+ints.toString());

System.out.println("Element '6' present in stack: "+ ints.search(6));
```

## Question 2
Write a new test program for Q1(a) called TestIntMyStack class.
    a) Prompt user to enter an integer value.
    b) Push the values 1 through the user entered value onto the stack.
    c) Print the size of the stack.
    d) Display the contents of the stack by repeatedly calling pop() until the
    stack is empty.

What is the output of the elements? What is the order, why?

``` java
public class TestMyIntStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 10 values to be push into the stack: \n");
        for (int i = 0; i < 10; i++)
            stack.push(scan.nextInt());
        
        System.out.println("\nStack size: "+stack.getSize());
        // display
        System.out.println("\nPrinting the stack using pop()");
        for (int i = 0; !stack.isEmpty() ; i++) {
            System.out.println(stack.pop());
        }
    }
}
```

``` output
Enter 10 values to be push into the stack: 
1
2
3
4
5
6
4
7
8
10

Stack size: 10

Printing the stack using pop()
10
8
7
4
6
5
4
3
2
1
``` 
the printing is in reverse becuase Stack uses the First in Last out concept in its data structure

## Question 3
Assuming that an unknown number of positive integers are stored in a stack, S.
Using only stack ADT operations write an algorithm/function to find the sum of
every element in S.

``` java
public int totalSum() {
    MyStack<E> hold = new MyStack<>();
    int sum=0;
    while (!stack.isEmpty()) {
        hold.push(stack.pop());     // preserving the current stack
        sum += hold.peek();
    }
    stack = hold;
    return sum;
}
```

## Question 4
A string is a palindrome if it spells the same way forwards and backwards. Write a
Java program that uses a Stack to determine if a string is a palindrome or not. Let
your string be of maximum size 15 characters. Note however that the actual size
may be 15 or less.

**Optimized solution**
``` java
public static boolean checkPalindrome(String input) {
        MyStack<Character> stack = new MyStack<>();
        int mid = input.length()/2;
        if (input.length() %2 != 0) mid++;
        
        for (int i=0; i<mid ; i++)              // store the first half
            stack.push(input.charAt(i));
        
        for (int i=mid; i<input.length() ; i++)      // compare with the next half
            if(stack.pop()!=input.charAt(i)) return false;

        return true;
}
```
_source: chatGPT_
Comparing this to my solution, the solution above compares 
the first half of the string to the other half, instead 
of comparing the whole string. 

## Question 5
The Tower of Hanoi is a mathematical game or puzzle. It consists of three rods, and
a number of disks of different sizes which can slide onto any rod. The puzzle starts
with the disks in a neat stack in ascending order of size on one rod, the smallest at
the top, thus making a conical shape. The objective of the puzzle is to move the
entire stack to another rod, obeying the following rules:

i) Only one disk may be moved at a time.

ii) Each move consists of taking the upper disk from one of the rods and sliding it
onto another rod, on top of the other disks that may already be present on that rod.

iii) No disk may be placed on top of a smaller disk.
You are required to write the source code using Java syntax to solve Tower of Hanoi
Problem using stacks data structure.

### PseudoCode
```
Procedure Tower_Of_Hanoi(disk, source, dest, helper)
    IF disk == 1, THEN
            move disk from source to dest             
    ELSE
            Tower_Of_Hanoi (disk - 1, source, helper, dest)     
            move disk from source to dest          
            Tower_Of_Hanoi (disk - 1, helper, dest, source)     
    END IF   
END Procedure
```

### implementation
``` java
public class TowerOfHanoi2 {
    static MyStack<Integer> peg1 = new MyStack<>();
    static MyStack<Integer> peg2 = new MyStack<>();
    static MyStack<Integer> peg3 = new MyStack<>();
    
    public static void main(String[] args) {
        int totalDisk = 10;
        for (int i=totalDisk; i>0; i--) 
            peg1.push(i);
        
        solve(totalDisk, peg1, peg2, peg3);
    }
    
    public static void solve(int disk, MyStack<Integer> source, MyStack<Integer> dest, MyStack<Integer> helper) {
        if (disk==1) {
            dest.push(source.pop());
            display(peg1, peg2, peg3);
            return;
        }
        solve(disk-1, source, helper, dest);
        dest.push(source.pop());
        display(peg1, peg2, peg3);
        solve(disk-1, helper, dest, source);
    }
    
    public static void display(MyStack<Integer> peg1, MyStack<Integer> peg2, MyStack<Integer> peg3) {
        System.out.println("peg1 : "+peg1);
        System.out.println("peg2 : "+peg2);
        System.out.println("peg3 : "+peg3);
        System.out.println();
    }
}
```
