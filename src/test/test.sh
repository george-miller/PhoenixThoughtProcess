#!/bin/bash

# This script runs all the tests for Phoenix
# If you are going to use this be sure to change 
# the location of jars to where they are on your computer!

find . -name "*.java" > sources.txt
javac -Xlint:path -cp /Users/georgemiller/ProgramFiles/junit-4.12.jar:/Users/georgemiller/ProgramFiles/hamcrest-core-1.3.jar:/Users/georgemiller/ProgramFiles/cpsuite-1.2.6.jar @sources.txt
java -cp /Users/georgemiller/ProgramFiles/junit-4.12.jar:/Users/georgemiller/ProgramFiles/hamcrest-core-1.3.jar:/Users/georgemiller/ProgramFiles/cpsuite-1.2.6.jar:.:./gameplayTests TestSuite
rm sources.txt