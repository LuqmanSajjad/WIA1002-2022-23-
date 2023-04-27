/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Arrays;

/**
 *
 * @author jad
 */
public class java {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }   
}
