# Week 5 LinkedList and DoublyLinkedList tutorial

## Question 1
```
1 public E xyz(int index,E e)
2 {
3   Node<E> current=head;
4   Node<E> temp;
5   if(index<0) return null;
6   else if(index>=size-1) {
7       this.addLast(e);
8       return null;
9   }
10  else if(index==0) {
11      temp=head;
12      head.element=e;
13      return temp.element;
14  }else{
15      for (int i = 1; i < index; i++) {
16          current=current.next;
17      }
18  temp=current.next;
19  current.next.element=e;
20  return temp.element;
21 }
22 }
```
Given method xyz with 2 arguments:
a) Based on the above source code, explain what the lines of code do from line 10 – 21.
    **If the index is 0, the new element is added to the head position. else, we will tranverse through the linkedlist to the index just before the required one. And start the adding new element operation.**
b) What is the main purpose of the method xyz()?
    **adding the new element to the specified index by the user**
c) Obviously, there are some bugs in the source code. Debug the code and make it concise and 
simpler.

proposed correction
``` java
public E xyz(int index,E e) {

    Node<E> current=head;
    Node<E> temp;

    if(index<0) return null;

    else if(index>=size-1) {
        size++;             // need size increment
        return this.addLast(e);           // return e indicates successful operation
    }
    
    else if(index==0) {
        size++;             // need size increment
        return this.addFirst(e); // it is safe to assume addFirst exist, as it shorten our code
    }

    // the else section here wasn't necessary

    for (int i = 1; i < index; i++) 
        current=current.next;

    temp=current.next;
    current.next.element=e;
    (current.next).next = temp; // the new added node needs to point to the next index
    return temp.element;
 }
```

## Question 2
```
1 else{
2       Node<E> temp = head;
3       for(int i=0; i<index; i++){
4           temp = temp.next;
5       } 
6       element = temp.element;
7       temp.next.prev = temp.prev;
8       temp.prev.next = temp.next;
9       temp.next = null;
10      temp.prev = null;
11      size --;
12 }
```


Based on the source code above, assume the index given is 3
a) Explain what the lines of code do from line 2-11.
**Whelp, on line 2 to 4 we transverse to the specified index 3.**
**In line 7 to 8, we detached the pointer of the next and previous node, which was pointing to the current index 3 node**
**In line 9 to 10 we just eliminated both pointers of the index 3 node which was pointing at the prev and next node**
**line 11 just decrement the size, since a node has just been detached from the linked list**
**I am not sure of the purpose of line 6. He seems to be pointless and must be a failure to his parents**

b) Draw the nodes for lines 7 - 10 (wip)

**line 7**
**line 8**
**line 9**
**line 10**

## Question 3
A doubly linked list keeps a set of characters. The head, the middle and the tail nodes respectively
contains alphabet ‘a’, ‘b’ and ‘c’. These nodes are in successive order. Create a new node that contains
alphabet ‘z’. Add this new node at the last location of this linked list. Draw all of these nodes including
their correct references
