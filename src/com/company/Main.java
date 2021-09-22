package com.company;

public class Main {

    public static void main(String[] args) {
	// Think Java - Exercise 7.2

        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }

        /* MAIN:
        * The output of this program will be a print of the return value for "mus(bob)" which are 30.
        */

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

        /* MAKE:
        * The method called make takes an integer array with the value n = 5 and inside the method there is another
        * integer array named "a" and it's used in the "for" loop and will give this return --->
        * Return: a[0] = 1, a[1] = 2, a[2] = 3, a[3] = 4, a[4] = 5.
        */


    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }

        /* DUB:
        * This method will take the array "bob" (from main) and it will be renamed to "jub" which will be used in a "for" loop
        * and inside the loop "jub" starts at index [0] and the value of the element in index [0] will be multiplied by two.
        * This will continue for each index until "i" are either equal or larger than jub.length, and then it will terminate the loop.
        * "jub" will then have these values: jub[0] = 2 , jub[1] = 4 ,jub[2] = 6 ,jub[3] = 8 ,jub[4] = 10.
         */

    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }

        /* MUS:
        * The last method here accumulates the sum of the array "zoo". The value of each element for each index will be added
        * to the value "fus" until the condition for the "for" loop isn't true anymore and then the loop
        * will terminate and return "fus"'s value.
        */

}
