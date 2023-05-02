/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w6Stacks;

/**
 Tower of Hanoi solver
 
 Rules:
    i) Only one disk may be moved at a time.

    ii) Each move consists of taking the upper disk from one of the rods and sliding it
    onto another rod, on top of the other disks that may already be present on that rod.

    iii) No disk may be placed on top of a smaller disk.
    You are required to write the source code using Java syntax to solve Tower of Hanoi
    Problem using stacks data structure.
   
 * @author jad
 */

/*
This class is for simulating the function of the peg in Tower of Hanoi game.
*/
public class TowerOfHanoi {
    private MyStack<Integer> peg = new MyStack<>();

    public TowerOfHanoi() {}
    
    public TowerOfHanoi(int totalDisk) {
        for(int i=totalDisk; i>0; i--)
            peg.push(i);
    }
    
    /*
    moving the disk
    */
    private void move(TowerOfHanoi destination) {
        destination.peg.push(this.peg.pop());
    }
    
//    I do not understand why I cannot override here. It says lack priviledge.
//    @Override
//    public String toString() {
//        return peg.toString();
//    }
    
    private void Display() {
        System.out.println(peg.toString());
    }
    
    
    /*
    simulation of the game
    */
    public static void main(String[] args) {
        TowerOfHanoi peg1 = new TowerOfHanoi(4);    // the first peg has 4 disk
        TowerOfHanoi peg2 = new TowerOfHanoi();
        TowerOfHanoi peg3 = new TowerOfHanoi();
        
        solve(4, peg1, peg2, peg3);
    }
    
    public static void solve(int disk, TowerOfHanoi source, TowerOfHanoi dest, TowerOfHanoi helper) {
        if (disk == 1)
            source.move(dest);
        
        solve(disk - 1, source, helper, dest);
        source.move(dest);
        solve(disk -1, helper, dest, source);
    }
}

/*
PseudoCode for the solution ::

START
Procedure Tower_Of_Hanoi(disk, source, dest, helper)
    IF disk == 1, THEN
            move disk from source to dest             
    ELSE
            Tower_Of_Hanoi (disk - 1, source, helper, dest)     
            move disk from source to dest          
            Tower_Of_Hanoi (disk - 1, helper, dest, source)     
    END IF   
END Procedure

*/
