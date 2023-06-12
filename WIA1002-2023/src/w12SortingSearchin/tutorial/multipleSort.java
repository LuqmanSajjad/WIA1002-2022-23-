/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w12SortingSearchin.tutorial;

import java.util.Random;


public class multipleSort {
    
    static int compared = 0;
    static int calledMergeSort = 0;
    
    public static void main(String[] args) {
        
//        int[] test = {4, 47, 27, 1, 20, 3, 36, 18, 9, 42};
        
        int[] test = new int[6];
        Random rand = new Random();
        for (int i=0; i<test.length; i++) {
            test[i]=rand.nextInt(50);
        }
        
        System.out.println("Initial array ::");
        print(test);
        System.out.println();
        
        
        System.out.println("\n## Insertion sort ");
        int[] insertion = new int[test.length];
        System.arraycopy(test, 0, insertion, 0, test.length);
        insertionSort(insertion);
        print(insertion);
        
        
        System.out.println("\n\n## Merge sort ");
        int[] merging = new int[test.length];
        System.arraycopy(test, 0, merging, 0, test.length);
        mergeSort(merging);
        print(merging);
        System.out.println("\nrecursion calls       :"+calledMergeSort);
        System.out.println("Comparing iterations  :"+compared);
        
        
        System.out.println("\n\n## Bubble sort ");
        int[] bubbling = new int[test.length];
        System.arraycopy(test, 0, bubbling, 0, test.length);
        bubbleSort(bubbling);
        print(bubbling);

        System.out.println("\n\n## Selection sort ");
        int[] selecting = new int[test.length];
        System.arraycopy(test, 0, selecting, 0, test.length);
        selectionSort(selecting);
        print(selecting);
       
        
//        
    }
    
    public static void insertionSort(int[] arr) {
        int iteration =0;
        
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            
            for (int j=i-1; j>=0; j--) {
                iteration++;                // this is considered an interation
                
                if (current < arr[j]) {
                    arr[j+1] = arr[j];  // push the element forward
                    arr[j] = current;   // fill in the space with current element - you can also fill up at the end, but has to put extra condition, which may or may not cause performance
                } else break;
            }
//            System.out.print("\niter"+iteration+") ");
//            print(arr);                                     // visualisation purpose
        }
        
        System.out.println("\niterations: "+iteration);
    }
    
    public static void print(int[] arr) {
        for (int i: arr) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
    
    public static void mergeSort(int[] list) {
        
        if (list.length >1) {
            calledMergeSort++;
            // merge sort first half
            int[] firstHalf = new int[list.length/2];
            System.arraycopy(list, 0, firstHalf, 0, list.length/2);
            mergeSort(firstHalf);
            
            // merge sort second half
            int secondLength = list.length - list.length/2;
            int[] secondHalf = new int[secondLength];
            System.arraycopy(list, list.length/2, secondHalf, 0, secondLength);
            mergeSort(secondHalf);
            
            // mergeback
            merge(firstHalf, secondHalf, list);
        }
    }
    
    private static void merge(int[] firstHalf, int[] secondHalf, int[] list) {
        int i=0, k=0, c=0;
        
        while (i<firstHalf.length && k<secondHalf.length) {
            if (firstHalf[i] < secondHalf[k])
                list[c++] = firstHalf[i++];
            else 
                list[c++] = secondHalf[k++];
            compared++;
        }
        
        while (i<firstHalf.length) 
            list[c++] = firstHalf[i++];
        while (k<secondHalf.length) 
            list[c++] = secondHalf[k++];
        
//        print(list); // debugging purpose
    }
    
    
    private static void bubbleSort(int[] input) {
        int iteration =0;
        
        for (int i=0; i<input.length-1; i++) {          // the outer layer acts as a border, determining the side in which the sorting no longer necessary
            boolean swapped = false;
            for (int j=input.length-1; j>i; j--) {
                if (input[j-1] > input[j]) {
                    int hold = input[j-1];
                    input[j-1] = input[j];
                    input[j] = hold;
                    swapped = true;
                }
                iteration++;                    // this point is considered an iteration
            }
            if (!swapped) break;
        }
        
        System.out.println("iterations: "+iteration);
    }
    
    
    private static void selectionSort (int[] input) {
        int iteration =0;
       
        for (int i=0; i<input.length-1; i++) {
            int minimum = input[i];
            int selection=i;
            
            for (int j=i+1; j<input.length; j++) {          // last time you forgot that j supposed to be equal to i+1, you made it intially be zero which cost you ridiculous amount of wasted fucking time. Well at least now you understand this super simple algorithm to the back of your hand. 
                iteration++;
                if (input[j] < minimum) {
                    minimum = input[j];
                    selection = j;
                }
            }
            
            if(selection != i) {
                input[selection] = input[i];
                input[i] = minimum;
            }
            
            System.out.println();
            print(input);
        }
        System.out.println("Iterations" + iteration);
    }
}
