/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortingofanarray2;

import java.util.Arrays;

/**
 *
 * @author nayeem
 */
public class Sortingofanarray2 {

    public static void main(String[] args) {
        //variable declaration area
        int i;
        int[] x = {7, 8, 6, 4, 2, 1, 3, 5};

        Arrays.sort(x);

        System.out.print("Descending Order:");

        for (i=7; i>=0;i--) 
        {
            System.out.print(" " + x[i]);

        }

        System.out.println(" ");

    }

}
