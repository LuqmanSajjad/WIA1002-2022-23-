
# Tutorial Data Structure Week 4 (Linked list)
## Question 1

a. Assume that a node class called Node<E> exist. Create two nodes called node1 and
  node2. Node1 contains alphabet ‘a’ and node2 contains alphabet ‘z’. Also, create 2
  references, head and tail. Let head points to node 1 and tail points to node 2

``` java
  Node<Character> node1 = Node<>('a');
  Node<Character> node2 = Node<>('z');
  Node<Character> head = node1;
  Node<Character> tail = node2);
```
  
b. Draw the nodes from (a) 

<img width="747" alt="image" src="https://user-images.githubusercontent.com/127722651/230758425-c42afcc9-659d-4202-a250-7157fb59e774.png">
  
c. Write a statement/code for node1 accessing the node2. Modify 1(b) to show this. 
  
``` java
  node1.next() = node2;
```
<img width="732" alt="image" src="https://user-images.githubusercontent.com/127722651/230758067-0e371b11-7b15-4f05-8677-80f7bf65cace.png">
  
d. Create a new node, firstNode. Add this new node at the first location of all existing
nodes. Draw these nodes. 

``` java
  Node<Character> firstNode = Node<>('b');
  firstNode.next() = head;
  head = firstNode;
```

<img width="583" alt="image" src="https://user-images.githubusercontent.com/127722651/230758606-e30e3823-0929-4769-b91d-7f795df4d3aa.png">
  
e. If we have no information about the status of a linked-list, what are the conditions we
need to consider to perform the operation in (d)?

`Is the list empty? if empty then just add assign head to it. Else just do it normally`
  
f.
  Write a list of operations/steps/pseudocode needed to add the firstNode to the first
  location.
  
``` java
  if(head == null)
    head = firstNode
  else 
    firstNode.next() = head
    head = firstNode
```
  
  

  
g. 
    Write codes to assign the firstNode to the first location.
  
``` java
  public void add (E input) {
    Node<Character> newNode = new Node<>(input);
    if(head == null)
      head = newNode;
    else 
      newNode.next() = head;
      head = newNode;
  }
```
  
h. Repeat (d) – (f), for the following operations :
i. addLast() – value of element, c

``` java
public void addLast (E input) {
    if(tail == null)
      tail = new Node<>(input);
    else 
      tail.next() = new Node<>(input);
      tail = tail.next();
}
```

ii. add(int index, E e) – value of element, d

``` java
public void add (int index, E input) {
    if (index ==0) {
        addFirst(e);
    }
    if (index > size) // what if we don't want to use size?
        addLast(e);

    Node<E> current = head;
    for(int i=1; i<index; i++) // stop before requested index
        current = curent.next;

    Node<e> newNode = new Node<>(e);
    newNode.next = current.next;
    current.next = newNode;
}
```

<img width="633" alt="image" src="https://user-images.githubusercontent.com/127722651/230759896-64552b7a-41ea-4173-9e16-23d8bf5d04c3.png">



iii. removeFirst()

iv. removeLast()
v. remove(int index) – remove at index 1



## Question 2
Given is a method containing incorrect statements that checks if an element is in a list.

         public void operationX(E e) {
           pointerB.next = pointerB;

           for(int i++; i>size; int i) {
           System.out.println(current.element);
           if(current.element = e)
           }

           Node<E> pointerB = head;
           return false;
         }

a) What is the name of the method for operationX?
    `remove`
b) Correct the statements by rewriting them in the correct order and syntax.Write the correct/right method name to replace operationX.
    
``` java
public boolean operationX(E e) {
    /* work in progress. I am not sure how to rearrange the code, without adding new lines of my own */
    Node<E> current = head;

    for(int i; i<size; i++) {
        System.out.println(current.element);
        if(current.next.element = e) {
            current.
            return true;
        }
        current = current.next; 
    }

    Node<E> pointerB = head;
    return false;
}
```

## Question 3
Given the following nodes. Answer the following:
<img width="715" alt="image" src="https://user-images.githubusercontent.com/127722651/231208565-6df3b3a2-37d2-48e2-ad99-2c074e9d36a9.png">

a) Based on the above figure, what is the name of the method for above operation?
    `removeLast()`
    
b) Write codes to represent the above figure. (Kindly use the variables stated in the
figure)
``` java
public E removeLast() {
    Node<E> pointer1 = head;
    if(head==null) 
        return null;

    if(size==1) 
        return removeFirst();
    
    while(temp.next != tail) {
        pointer1 = pointer1.next;
    }
    
    Node<E> temp = tail;
    tail = pointer1;
    tail.next = null;
    return temp;
}
```

