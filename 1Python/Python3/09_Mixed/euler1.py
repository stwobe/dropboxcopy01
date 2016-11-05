#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  euler1.py
#  
#  Copyright 2014 Steve Roberts <susie@linux-mdhq>
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
#http://stackoverflow.com/questions/13503320/euler-project-3-in-python

n,i = 6008514751231312143,2

while i*i <= n:      
    if n%i == 0:
        n //= i
    else: 
        i+=[1,2][i>2]

