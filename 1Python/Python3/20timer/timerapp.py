# This is a timer that tells you when to stop working.

import time


def delay():
    length_of_work_session = int(input("How long do you want to work for?    "))
    print("")
    print("You are planning to work for ",
         length_of_work_session, "minutes.    ")
    while length_of_work_session > 0:
        print("")
        print("You have ", length_of_work_session, "left.    ")
        time.sleep(60)
        length_of_work_session -= 1
# add continue command here to get nice statement at ending
# add espeak to say that the time is over??
delay()
