# Week 10 Tutorial Recursion 

## 1. Explain the problem that occurs when executing the recursive method f(0).
public static int f(int n) {
if (n == 1)
return n;
else
return n * f(n-1);
}

## 2. Explain the problem that occurs when executing the recursive method f().
public static int f(int n) {
if (n == 0)
return n;
else
return f(n+1) + n;
}

## 3. Write a recursive method to reverse a string.
 String → gnirts
 
## 4. Write a recursive method to calculate the following :
5 + 4 + 3 + 2 + 1.
 State the base case and recursive case. Trace your solution using number, N of 5.
Algorithm :
1. Base case = 1
2. Recursive case = n + sum(n-1)
5. Write a recursive method printDigit that prints an integer argument as its constituent digits,
with a blank space separates each digit with the next. For example, if the argument is 4567,
this method will print 4 5 6 7 on the screen. 
