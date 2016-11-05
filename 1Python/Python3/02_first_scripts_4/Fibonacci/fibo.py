#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#       fibonacci_1.py
#       
#       Copyright 2014 Evets <evets@evets-lodop>
#       
#       This program is free software; you can redistribute it and/or modify
#       it under the terms of the GNU General Public License as published by
#       the Free Software Foundation; either version 2 of the License, or
#       (at your option) any later version.
#       
#       This program is distributed in the hope that it will be useful,
#       but WITHOUT ANY WARRANTY; without even the implied warranty of
#       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#       GNU General Public License for more details.
#       
#       You should have received a copy of the GNU General Public License
#       along with this program; if not, write to the Free Software
#       Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
#       MA 02110-1301, USA.

#import time 
def fib(n):
	a, b = 0, 1
	while a < n:
		print (a, end=(' ')
		a, b = b, a+b
		#time.sleep(.001)
	#print("poop")
#fib(90000000000000034990909090909090909879879879879879879879000000000000000000000000000000343000000000000000343400000000988734)
	print()
fib(10000)
