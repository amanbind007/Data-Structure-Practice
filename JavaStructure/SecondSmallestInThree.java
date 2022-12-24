import java.util.Scanner;

import javax.sound.midi.Soundbank;

// Second Smallest
// You are given 3 distinct integer numbers X,Y and Z. Task is to print the second smallest number among the three provided numbers.
// Input format
// Input contains 3 distinct integers X,Y and Z.
// Output format
// Print the second smallest integer.
// Time Limit
// 1 ​secon
// Constraints
// 1<=X,Y,Z<=100
// Example
// Input
// 10 42 15
// Output
// 15



public class SecondSmallestInThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        if((X<Y && X>Z) || (X<Z && X>Y)){
            System.out.println(X);
        }
        if((Y<X && Y>Z) || (Y<Z && Y>X)){
            System.out.println(Y);
        }
        if((Z<X && Z>Y) || (Z<Y && Z>X)){
            System.out.println(Z);
        }
        
        
    }
}