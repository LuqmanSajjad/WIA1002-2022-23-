/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w12SortingSearchin.tutorial;


public class multipleSort {
    public static void main(String[] args) {
        int[] test = {1,3,2,4,6,9,4,90, 12, 23};
        
        System.out.println("\n## Insertion sort ");
        int[] insertion = new int[test.length];
        System.arraycopy(test, 0, insertion, 0, test.length);
        insertionSort(test);
        print(test);
        
        
        System.out.println("\n\n## Merge sort ");
        int[] merging = new int[test.length];
        System.arraycopy(test, 0, merging, 0, test.length);
        mergeSort(merging);
        print(merging);
        
        
        System.out.println("\n\n## Bubble sort ");
        int[] bubbling = new int[test.length];
        System.arraycopy(test, 0, bubbling, 0, test.length);
        bubbleSort(bubbling);
        print(bubbling);

        
        
//        
    }
    
    public static void insertionSort(int[] arr) {
        int iteration =0;
        
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            
            for (int j=i-1; j>=0; j--) {
                iteration++;                // this is considered an interation
                
                if (current < arr[j])
                    arr[j+1] = arr[j];
                else {
                    arr[j+1] = current;
                    break;   
                }
                
            }
        }
        
        System.out.println("iterations: "+iteration);
    }
    
    public static void print(int[] arr) {
        for (int i: arr) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
    
    public static void mergeSort(int[] list) {
        if (list.length >1) {
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
        }
        
        while (i<firstHalf.length) 
            list[c++] = firstHalf[i++];
        while (k<secondHalf.length) 
            list[c++] = secondHalf[k++];
        
//        print(list); // debugging purpose
    }
    
    
    private static void bubbleSort(int[] input) {
        boolean swapped = false;
        int iteration =0;
        
        for (int i=0; i<input.length-1; i++) {
            for (int j=i+1; j<input.length; j++) {
                if (input[i] > input[j]) {
                    int hold = input[i];
                    input[i] = input[j];
                    input[j] = hold;
                    swapped = true;
                }
                iteration++;                    // this point is considered an iteration
            }
            if (swapped) break;
        }
        
        System.out.println("iterations: "+iteration);
    }
    
}
