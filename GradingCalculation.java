package com.company;

import java.util.Scanner; 

public class Grading
{
	public static void main(String[] args)
	{ 
	int a = 68, b=75, c=80, d=77; 

	int Grade = a++ - 68;  	//first expression grade student a
	System.out.println("Grade1 = "+ Grade);
	System.out.println("a = "+ a);


	Grade = ++b - 75; 		//second expression grade student b
	System.out.println("Grade2 = "+ Grade);
	System.out.println("b = "+ b);

	Grade = ++c - 80 + c++; 	//third expression grade student c
	System.out.println("Grade3 = "+ Grade);
	System.out.println("c = "+ c);

	standard = d++ + ++d +77;	 // standard grade for all students
	System.out.println("Grade4 = "+ Grade);
	System.out.println("d = "+ d);

	int point = 0;

	// loop while standard grade is not reached 
	while (Grading < standard) {
	Grading += standard;
	Grading -= standard; 
	point ++; 
}

	if(subject != 0){
	System.out.println(" You currently need " + point + " point(s) to reach the standard.");
	} else{
	System.out.println(" Congrats, you have reached the standard grade");  // if the standard grade has been reached
		}

	}
}