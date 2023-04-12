/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author jad
 */
public class Practice {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            PrintWriter type = new PrintWriter(new FileOutputStream("src/FilesW1/AyoTesting.txt"));
            ObjectOutputStream type2 = new ObjectOutputStream(new FileOutputStream("src/FilesW1/practiceGenerics.dat"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
       
    }
}
   
