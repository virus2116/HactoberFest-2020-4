# https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/exploring-ruins/
'''
# Sample code to perform I/O:
 
name = raw_input()          # Reading input from STDIN
print 'Hi, %s.' % name      # Writing output to STDOUT
 
# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''

# Write your code here
string = raw_input()
finalStr = ''
for i in range(0, len(string)):
    if (string[i] == '?'):
        if(i == 0):
            if(len(string) == 1):
                finalStr += 'a'
            elif(string[i+1] == 'a'):
                finalStr += 'b'
            else:
                finalStr += 'a'
        elif(i == len(string)-1):
            if(finalStr[i-1] == 'a'):
                finalStr += 'b'
            else:
                finalStr += 'a'
        else:
            if(finalStr[i-1] == 'a' or string[i+1] == 'a'):
                finalStr += 'b'
            else:
                finalStr += 'a'
    else:
        finalStr += string[i]


print finalStr
