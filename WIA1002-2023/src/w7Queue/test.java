package w7Queue;

/*
 * b) Write a test program that :
a. Have an initialize queue items consists of Durian and Blueberry in a fruitQ
b. Then add new items in the following order: Apple, Orange, Grapes, Cherry.
c. Display the queue.
d. Show the top item.
e. Get the queue size.
f. Delete Durian.
g. Get item in index position of 2
h. Check whether the queue consists of Cherry
i. Check whether the queue consists of Durian
j. Display the queue using the isEmpty() condition.
 */

public class test {
    public static void main(String[] args) {
        String[] test = {"Durian", "Blueberry"};
        
        MyQueue<String> fruit = new MyQueue<>(test);
        fruit.enqueue("Apple");
        fruit.enqueue("Orange");
        fruit.enqueue("Grapes");
        fruit.enqueue("Cherry");
        
        // display queue
        System.out.println(fruit.toString());
        
        // show top item
        System.out.println("\ntop item:");
        System.out.println(fruit.peek());
        
        // size
        System.out.println("\nsize: " + fruit.getSize());
        
        // delete durian 
        fruit.dequeue();
        
        // is there cherry?
        System.out.println("cherry is here?: "+fruit.contains("Cherry"));
        
        // durian?
        System.out.println("durian is here?: "+fruit.contains("Durian"));
        
        while(!fruit.isEmpty())
            fruit.dequeue();
    }
}
