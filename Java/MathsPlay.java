/*
 *      MathsPlay.java
 *      
 *      Copyright 2014 Evets <evets@evets-lodop>
 *      
 *      This program is free software; you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation; either version 2 of the License, or
 *      (at your option) any later version.
 *      
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *      
 *      You should have received a copy of the GNU General Public License
 *      along with this program; if not, write to the Free Software
 *      Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 *      MA 02110-1301, USA.
 */



public class MathsPlay {
	
	public static void main (String args[]) {
		/* Declare variables.*/
		
		double x;   //The variable x
		double y;   //The variable y
		double z;   //The variable z!!!
		double a;   //For the square root bit...
		int b;   //Try indices!
		
		/*Do some sums*/
		
		x=11;
		y=2;
		z=x*y;  //a sum
		x=x+z;
           //another sum, with replacement
           
        a=Math.sqrt(x);  //square root of x
        b=9^3;            // b equals 9 cubed, hopefully (no, wrong code..)
           
        /*Output results*/
        
        System.out.print("One value might be ");
        System.out.println(z);
        System.out.print("And the other value could be.. ");
        System.out.println(x);
        System.out.print("Also, there is the square root of x too:  ");
        System.out.println(a);
        System.out.print("And what about indices? b is   ");
        System.out.println(b);
        
    } //end of main
    
} //end of class MathsPlay

