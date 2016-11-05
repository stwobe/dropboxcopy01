#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  six_curiosity_6_correct_2_with_main.py
#  
#  Copyright 2014 Steve <theo@Steve-Lubuntu>
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

def main():
	b = 6
	while b < 6666666666666666666666666666666666666666666666666666666666666667:
		print b*b
		b=(10*b)+6
	
	return 0

if __name__ == '__main__':
	main()

