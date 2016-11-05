#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  complex.py
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
#  Trying out the stuff about classes in Chapter 9 of official docs

class Complex:
	def __init__(self, realpart, imagpart):
		self.r = realpart
		self.i = imagpart
#		x = Complex(3.0, -4.5)
#		return (x.r, x.i)


