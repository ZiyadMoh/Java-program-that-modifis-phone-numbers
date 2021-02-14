# Java-program-that-modifis-phone-numbers
Write a Java program that uses regular expressions to make a modified copyof a text file that contains, among other things, some   10-digit   phonenumbersthat   begin   with   +966.   The modified  copy  will  contain  the  same  text  but  in  every  phone number +966 must be replaced with 00966.Test your program well to make sure that it works correctly with all phone numbers regardless of their position in the file (beginning, middle,or end of  aline).  Also,  if  the  text  file contains  a  +  symbol  as  in  2+3=5 that has nothing to do with phone numbers, it should be copied as it is without any modifications. 

This is the test text:
My  phone  number  in  SA  is  +9665930234.  This  phone  number will appear in the output file as 009665930234. Even if I write it atthe end of the line as in this line +9665930234 Or at the beginning of theline as in the following line+9665930234. It will appear as 009665930234every time in the output file. However, the + in 2+3=5 will appear as it is without any modification

This is the output:
My phone number in SA is 009665930234. This phone number will appear in the output file as 009665930234. Even if I write it at the end of the line as in this line 009665930234 Or at the beginning of the line as in the following line009665930234. It will appear as 009665930234 every time in the output file. However, the + in 2+3=5 will appear as it is without any modification
