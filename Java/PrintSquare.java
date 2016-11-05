/*
 *      PrintSquare.java
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
/* A program that reads an integer that is typed in by the
 * user and computes and prints the square of that integer.
 *  - from PDF javanotes
 * */

public class PrintSquare {
	
	public static void main (String args[]) {
		
		int userInput;    //The number input by the user.
		int square;       //The userInput, multiplied by itself.
		
		System.out.print("You have to type a number!!:  ");
		userInput = TextIO.getlnInt();
		square = userInput * userInput;
		System.out.print("The square of that number might well be ");
		System.out.println(square);

	} // end of main
} //end of class PrintSquare

