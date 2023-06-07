/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABTEST2;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author jad
 */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10, 6, 9, 8, 7, 5};
        int[] output = sliding(array, 3);
        
        for (int element : output) {
            System.out.print(element + ", ");
        }
    }
    
    public static int[] sliding(int[] input, int k) {
        int n = input.length;
        int[] output = new int[n-k+1];

        for (int i=0; i<(n-k+1); i++) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            
            for (int j=i; j<i+k; j++) {
                queue.offer(input[j]);
            }
            output[i] = queue.poll();
        }
        
        return output;
    }
}
