# Week 10 Tutorial Recursion 

## 1. Explain the problem that occurs when executing the recursive method f(0).
```
    public static int f(int n) {
        if (n == 1)
            return n;
        else
            return n * f(n-1);
    }
```
myAns :: if n equals to 0, it will be an infinite recursion

## 2. Explain the problem that occurs when executing the recursive method f().
```
public static int f(int n) {
    if (n == 0)
        return n;
    else
        return f(n+1) + n;
}
```
myAns :: if the input is a positive integer, it will be an infinite recursion

## 3. Write a recursive method to reverse a string.
`String → gnirts# 3.`

solution::
```
public static String reverse(String string) {
    if (string.isEmpty()) 
            return "";
    int lastIndex = string.length()-1;
    return "" + string.charAt(lastIndex) + reverse(string.substring(0, lastIndex));
}
``` 
improvised from chatGPT::
```
return reverse(string.substring(1)) + string.charAt(0);
```

## 4. Write a recursive method to calculate the following :
    5 + 4 + 3 + 2 + 1.

State the base case and recursive case. Trace your solution using number, N of 5.
        
    Algorithm :
        1. Base case = 1
        2. Recursive case = n + sum(n-1)

``` java
public static int addAll(int number) {
    if (number==1) {
        System.out.print(number + " = ");
        return 1;
    } else {
        System.out.print(number + " + ");;
        return number + addAll(number-1);
    }
}
```

## 5. Write a recursive method printDigit that prints an integer argument as its constituent digits,
with a blank space separates each digit with the next. For example, if the argument is 4567,
this method will print 4 5 6 7 on the screen. 

``` java
public static void printAllInt(int number) {
    if (number==0) {
        return;
    } else {
        printAllInt(number/10);
        System.out.print(number%10 + " ");
    }
}
```