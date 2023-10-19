/* Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks.
 Initially, all the disks are stacked in decreasing value of diameter i.e., the smallest disk is 
 placed on the top and they are on rod A. The objective of the puzzle is to move the entire stack
  to another rod (here considered C), obeying the following simple rules:  
    - Only one disk can be moved at a time.
    - Each move consists of taking the upper disk from one of the stacks and placing it on top of 
      another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
    - No disk may be placed on top of a smaller disk. */

/* This interesting problem can be solved very easily using recursion. */
/* The main idea is..
 * Shift ‘N-1’ disks from ‘A’ to ‘B’, using C.
 * Shift last disk from ‘A’ to ‘C’.
 * Shift ‘N-1’ disks from ‘B’ to ‘C’, using A.
 */

import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter total number of plates: ");
        int noPlates = scn.nextInt();    // reads input from user.
   
        towerOfHanoiHelper(noPlates, 'A', 'B', 'C');
    }
    
    public static void towerOfHanoiHelper(int no, char st, char aux, char end) {
        // st represent the starting pole where all disks are present at start.
        // end represent the destination pole where all disks needs to be transfered. 
        // aux represent the auxilary pole using which the process needs to be done.

        if (no == 0)   return;
        towerOfHanoiHelper(no-1, st, end, aux);
        System.out.println("Move disk "+ no + " form " + st + " to " + end);
        towerOfHanoiHelper(no-1, aux, st, end);
    }
}
