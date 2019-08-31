# Fall-2017---CPSC-1302-Computer-Science-II-ASSIGNMENT-2-Inheritance.-Featuring-Exception-Handling
 Fall 2017 - CPSC 1302 – Computer Science II

ASSIGNMENT 2: Inheritance. Featuring Exception Handling.

This assignment is due by 4:45 p.m. EST on Tuesday, Sept. 10, 2017. Late submissions will be graded as described in the syllabus. Assignments submitted at or after 12:01 a.m. EST, Sept 14, will not be accepted. Please start working on your assignment early. Please work individually.  

Code that does not compile will receive a grade of 0.

Lab
1) Polish your superclass to meet the following requirements:
(0.5 points) The class’ name is a singular noun that starts with an upper case letter
(0.5 points) at least 3 instance variables of different types (e.g., String, int, double, boolean, etc).
(0.5 points) a default constructor that is composed of a sequence of calls to the set() methods.
(0.5 points) a custom constructor that is composed of a sequence of calls to the set() methods.
(0.5 points) a get() method for each instance variable 
(0.5 points) a set() method for each instance variable. Each set() method uses the this keyword.
(0.5 points) a toString() method
(1 point) Has a protected instance variable, which allows the subclass to directly reference the variable. The remaining instance variables have to be private. 

2) Polish each of your subclasses to meet the following requirements:
(1 point) The subclass’ name is a singular noun that starts with an upper case letter. You are able to say that your subclass is a your super class (e.g., a Student is a Person; a Bicycle is a Vehicle, a Mammal is an Animal, etc)
(1 point) at least 1 instance variable that can be considered a feature of the subclass but not of the superclass (e.g., class student has an int studentID as an instance variable; class Bicycle has a double sizeOfHandles as an instance variable; class Mammal has an int amoutOfMilkPerYear as an instance variable) 
(0.5 point) a default constructor that is composed of a call to the superclass’ default constructor, followed by one or more calls to the set() methods to set your subclass’ own instance variable(s).
(0.5 point) a custom constructor that is composed of a call to the superclass’ custom constructor, followed by one or more calls to the set() methods to set your subclass’ own instance variable(s).
(0.5 points) a get() method for each instance variable 
(0.5 points) a set() method for each instance variable. Each set() method uses the this keyword.
(0.5 points) a toString() method
(1 point) A method that overrides one of the methods of the superclass. (e.g., A student’s name is not allowed to be “Darth”).

2) Write a Tester for your class that sets up a data set each of whose elements is of your superclass’ type. Your tester must meet the following requirements

(0.5 points) Instantiates and populates an array of a certain size – e.g, 10 elements
(1 point) Half the array should be composed of your superclass’ objects. The other half should be composed of your subclass’ objects.
(0.5 point) Uses a do-while loop and a switch statement to ask the user what they want to do with the data

(6 points @ 1.5 points each) Has at least four methods that will correctly handle the user’s selection when called.

Method 1: Print all of the array elements whose class is given by the user.
The header of your method might look like this
public static void displaySubclassElements (String SubclassName);

Method 2: return the number of elements whose class is given by the user.  
The header of your method might look like this
public static int nbrSubclassElements (String SubclassName);

Method 3: Return True if the array contains as many elements of one subclass as it has of the other. Returns False otherwise.
The header of your method might look like this
public static boolean isBalanced (YourSuperClass[] data);

Method 4: Traverses the array. Every time we visit an object, calls the method that you chose to override.
The header of your method might look like this
public static void callOverriddenMethod (YourSuperClass[] data);

(2 points) Your code catches and handles at least two of the following exceptions: ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException 

We are free to add extra functionality to the tester.

