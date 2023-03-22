/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jad
 */
public class StringProcessing {
    public static void main(String[] args) throws FileNotFoundException {
        
        String[][] fileList = {
            {"text1.txt", ","},
            {"text2.txt", ",\\s+"},
            {"text3.txt", ";\\s+"},
            {"text4.txt", "\\d+"}
        };
        
        int count;
        for(String[] file: fileList) {
            // setup
            count=0;
            Scanner read = new Scanner (new FileInputStream("src/FilesW1/" + file[0])); // file[0] is the fiileName
            System.out.printf("\n** %s **\n", file[0]);
            
            // reading as Strings
            while(read.hasNext()) {
                String[] string = read.nextLine().split( file[1] ); // file[1] is the regex
                for (String word: string) {
                    System.out.print(word);
                    count += word.length();
                }
                System.out.println();
            }  
            
            read.close();
            System.out.println("Number of characters retrieved: "+count);
        }     
    }
}
