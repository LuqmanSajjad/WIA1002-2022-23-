/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w5DoublyLinkedList.KinderGarten;

import java.util.Scanner;

/**
 *
 * @author jad
 */
public class KindergartenStudents {
    public static void main(String[] args) {
        SinglyLinkedList<String> studentList = new SinglyLinkedList<>();
        
        System.out.println("enter the students namelist. enter 'n' to end....");
        Scanner scan = new Scanner(System.in);
        String input= "";
        while (true) {
            input = scan.nextLine();
            if (input.equals("n"))
                break;
            studentList.add(input);
        } 
        
        System.out.println("\nYour students:");
        studentList.printList();
        
        System.out.println("\ntotal Students: " + studentList.getSize());
        
        System.out.println("\nAll the name's correct? press r to rename student name,");
        System.out.println("\nEnter the student to rename:");
        input = scan.nextLine();
        System.out.println("Enter new name:");
        studentList.replace(input, scan.nextLine());
        
        System.out.println("\nThe new student list: ");
        studentList.printList();
        
        System.out.println("\ndo you want to remove a student?");
        System.out.println("Enter the student to remove");
        studentList.removeElement(scan.nextLine());
        
        System.out.println("\nnumber of updated students: "+ studentList.getSize());
        System.out.println("\nYour students:");
        studentList.printList();
        
        System.out.println("\nRegistration successfull :)");
    }
}
