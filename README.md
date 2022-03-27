# isnb.js

International Standard Book Numbers is unique Identification number given to each puplished number

Creating a function that takes a string of numbers (possibly with an x at the end) and
1. Return "Invalid" if it is not valid ISBN-10 or ISBN-13
2. Return "Valid" if it a valid ISBN-13
3. If it is valid ISBN-10, convert it into an ISBN-13 and return the ISBN-13 

Convert a valid ISBN-10 to ISBN-13 by taking 987 to the start then changing the last digit so that 
the resulting number passes the ISBN-13 check
