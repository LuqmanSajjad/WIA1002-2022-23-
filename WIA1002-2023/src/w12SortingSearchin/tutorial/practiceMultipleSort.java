/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w12SortingSearchin.tutorial;

/**
 *
 * @author jad
 */
public class practiceMultipleSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 1, 5, 6, 7};
        
        print(insertionSort(arr));
    }
    
    static int[] insertionSort (int[] arr) {
        for (int i=1; i<arr.length; i++) {
            // store current
            int current = arr[i];
            for (int k=i-1; k>=0; k--) {
                if (arr[k]>current) {
                    arr[k+1] = arr[k];
                    arr[k] = current;
                }
            }
        }
        return arr;
    }
    
    static void mergeSort (int[] arr) {
        
    }
    
    static void merge(int[] arr) {
        
    }
    
   
    
    static void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
