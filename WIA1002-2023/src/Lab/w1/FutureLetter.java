/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jad
 */
public class FutureLetter {
    public static void main(String[] args) {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("src/FilesW1/Sajjad_U2101039.txt", true));
            Scanner scan = new Scanner(System.in);
            
            // header
            System.out.println("Enter appending texts... type quit to exit...\n");
            String sentence="";
            
            // prompt
            while(true) {
                sentence = scan.nextLine();
                if(sentence.equalsIgnoreCase("quit"))
                    break;
                file.write("\n" + sentence);
            }
            
            // save
            file.close();
            
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}