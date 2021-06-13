# Mednet Coding Challenge

## How to use
1) Clone this repository.

2) Open a command prompt window and go to the directory where you saved the java program (MedNetChallenge.java). Assume it's C:\.

3) Type `javac MedNetChallenge.java` and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line (Assumption: The path variable is set).

4) Now, type `java MedNetChallenge` to run your program.

## "I got it running, now what?"

Once running MedNetChallenge, your first input will be inputting the Input Temperature and Units (ex: 32.1 Kelvin).

Your second input will be the target unit for the temperature conversion. The 4 Units supported are Kelvin, Celsius, Fahrenheit, and Rankine.

Your third input will be the student's response to the conversion question. This number gets shortened to the ones place and compared to the conversion of the input temperature.

Output: Output includes your grade (Correct/Incorrect), or invalid if the input temperature and units is not entered correctly.

## Why it was made

Our users are science teachers who are highly computer literate and very familiar with using
web-based tools. In their Heat and Temperature science unit, they want to assign students
temperature unit-conversion problems on paper worksheets. After students turn in their
completed worksheet, the teachers want to be able to enter the questions and student responses
into a computer to be graded.