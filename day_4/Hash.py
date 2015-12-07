#! /usr/bin/python

import hashlib
key = "yzbqklnj"
start = 1
while True:
    cipher = hashlib.md5(key + str(start)).hexdigest()
    #print start, "\t", cipher[0:5]
    if cipher[0:5] == "00000":
        print "Final Answer for Part 1: ", start
        break
    start += 1
while True:
    cipher = hashlib.md5(key + str(start)).hexdigest()
    if cipher[0:6] == "000000":
        print "Final Answer for Part 2: ", start
        break
    start += 1
        
    
