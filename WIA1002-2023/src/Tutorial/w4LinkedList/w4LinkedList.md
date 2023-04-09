
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
  
f) 
  Write a list of operations/steps/pseudocode needed to add the firstNode to the first
  location.
  
``` java
  if(head == null)
    head = firstNode
  else 
    firstNode.next() = head
    head = firstNode
```
  
  

  
g) 
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
  
h) Repeat (d) – (f), for the following operations :
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


continue question 2:
https://spectrum.um.edu.my/pluginfile.php/1328931/mod_resource/content/0/T04%20-%20LinkedList%20%28Q%29.pdf
