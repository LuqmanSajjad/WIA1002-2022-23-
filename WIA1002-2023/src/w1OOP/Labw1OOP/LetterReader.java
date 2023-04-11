/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1OOP.Labw1OOP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jad
 */
public class LetterReader {
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("src/FilesW1/Sajjad_U2101039.txt"));
            while(read.hasNext()) {
                System.out.println(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
