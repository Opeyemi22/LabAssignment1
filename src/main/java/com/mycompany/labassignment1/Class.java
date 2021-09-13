// Opeyemi Orioke
// Lab Assignment #1

package com.mycompany.labassignment1;


public class Class {


    public static void main(String[] args){
       
            int totalnumber =100; // initially set an integer to the range of number being targeted (0-100)
            for(int i = 0; i < totalnumber ; i++) // for loop checking to see if number is within 0 - 100 range.
                if (i%2 == 0) // modulo operator checks for the remaining to see if its a even number when divided by two
                {
                System.out.println(i + " , This Number Is Even !");
                }
                else
                System.out.println(i + " , This Number Is Odd !");
            // print statements telling us whether the number is positive or negative.
    }
}

