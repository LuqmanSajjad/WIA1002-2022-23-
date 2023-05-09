# Tutorial Queue Week 7

1. Name four everyday examples of a queue other than those discussed during lecture.
```

```

2. What is the difference between a queue and stack?
```
- Queue first in first out, Stack first in last out
- 
```

3. Use the following code segment to answer parts (a) through (c):
```
Queue<Integer> q = new Queue<Integer>();
Scanner keyIn = new Scanner(System.in);
for (int i = 1;i <= 5; i++)
{
    if (keyIn.nextBoolean())
    System.out.print(i + " ");
    else
    q.enqueue(i);
}
}
while (!q.isEmpty())
    System.out.print(q.dequeue() + " ");

System.out.println();
```

(a) What is the output for the following input sequence?

`true false false true true`

**OUTPUT:**
```
1 4 5 false false 
```

(b) Is it possible to have output: 1 3 5 4 2? If yes, give an input sequence that produces the
output; or else, provide justification to your answer.

```
No because printing i can only be done incrementally based on the for loop above.
```

(c) Give at least three input sequences that produce the output: 1 2 3 4 5
```
// input 1 
true true true true true
// input 2

```
4. Hand trace a queue X through the following operations:

    X.enqueue(new Integer(14));     // X = [14]
    X.enqueue(new Integer(3));      // X = [14, 3]
    X.enqueue(new Integer(5));      // X = [14, 3, 5]
    Object Y = X.dequeue();         // X = [3, 5] Y = 14
    X.enqueue(new Integer(7));      // X = [3, 5, 7] 
    X.enqueue(new Integer(9));      // X = [3, 5, 7, 9] 
    Y = X.dequeue();                // X = [5, 7, 9] Y = 3
    X.enqueue(new Integer(2));      // X = [5, 7, 9, 2] Y = 3
    X.enqueue(new Integer(4));      // X = [5, 7, 9, 2, 4] Y = 3

Given the resulting queue X above, what would be the result of each of the following?

a)
```
X.front();
```
`5`

b)
```
Y = X.dequeue();
X.enqueue(new Integer(10));
X.front();
```
`
X = [7, 9, 2, 4] Y = 5
X = [7, 9, 2, 4, 10] 
7
`

c)
```
Y = X.dequeue();
```
```7```

```
d) X.front();`
```
`9`

5. Provide and explain three operations / functions of Linked List based Queue that you can add
to the GenericQueue class, other than those discussed in the lecture (i.e., enqueue, dequeue
and getSize – from Slide 10 in the lecture slide).

```
void addLast(O o) - basically just like queue
void removeFirst(O o) - basically just dequeue

others are just utilities: 
void getIndex(O o) - 
```
