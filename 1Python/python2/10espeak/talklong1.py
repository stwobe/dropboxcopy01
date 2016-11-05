#! /usr/bin/env python
from espeak import espeak
import subprocess


def main():
    #espeak.synth("hi there")
    subprocess.call(['espeak', '-v', 'en-sc+whisper', '-s',
         '150', 'Yes I know, this is a Scottish voice!'])
main()

