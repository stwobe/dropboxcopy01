#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  adder.py
#  
#  Copyright 2016 Steve Roberts <flossie@mint_lmde2_lenovo>
#  
#  This program is free software; you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation; either version 2 of the License, or
#  (at your option) any later version.
#  
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#  
#  You should have received a copy of the GNU General Public License
#  along with this program; if not, write to the Free Software
#  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
#  MA 02110-1301, USA.
#  
#  practice usign the return statement

def add_up_two_numbers(a,b):
	print("")
	a = int(input("How much should a be?     "))
	print("")
	b = int(input("How much for b, please?   "))
	print("" * 3)
	print ("a = ", a)
	print("")
	print("b = ", b)
	print("")
	print("so a plus b = ")
	print("")
	return(a + b)
	answer = add_up_two_numbers(a,b)
	print(answer)

if __name__ == '__main__':
	a = 10
	b = 3
	add_up_two_numbers(a,b)

