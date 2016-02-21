#!/bin/bash

# This script runs all the tests for Phoenix
# If you are going to use this be sure to change 
# the location of jars to where they are on your computer!
pathToJunitAndHamcrestAndCpSuite='/home/george/ProgramFiles/junit-4.12.jar:/home/george/ProgramFiles/hamcrest-core-1.3.jar:/home/george/ProgramFiles/cpsuite-1.2.6.jar'
pathsToTests='test:test/gameplayTests'
pathsToClasses='.:phoenix:phoenix/gameplay:phoenix/positioningSystem'

find . -name "*.java" > sources.txt
# Xlint:path gives helpful feedback if java couldn't find the files in the classpath
javac -Xlint:path -cp $pathToJunitAndHamcrestAndCpSuite @sources.txt
java -cp $pathToJunitAndHamcrestAndCpSuite:$pathsToTests:$pathsToClasses TestSuite
rm sources.txt