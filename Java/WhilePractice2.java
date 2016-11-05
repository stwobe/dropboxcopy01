/*
 *      WhilePractice.java
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
/* from http://math.hws.edu/eck/cs124/javanotes6/c3/s1.html*/

public class WhilePractice2 {
	
    public static void main (String args[]) {
		
		int number;  //The number to be printed.
		number = 1;  //Start with 1.
		while ( number < 60000 ) { //Keep going as long as number is less than 6.
		
		   System.out.print(number);
		   System.out.print(" ");
		   number = number + 1;   //Go to the next numbeer.
		
		}   				 
			                  
		System.out.println("Magic!!");
			             	                   
	}
}

