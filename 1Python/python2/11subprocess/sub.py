#! /usr/bin/env python
import subprocess
import time

time.sleep(0.8)

subprocess.call(['ls'])

time.sleep(1.8)

subprocess.call(['ls', '-lH'])

time.sleep(0.4)
