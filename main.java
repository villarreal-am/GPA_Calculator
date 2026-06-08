/*
AP, Dual Credit, and IB is tier 1
Honors is tier 2
Everything else is tier 3
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GPACalculator
{
    public static void main(String[] args)
    {
        
        // Variable initalization
        Scanner prompt = new Scanner(System.in);
        String input = "";
        int amtOfClasses = 0;
        float gpa = 0.0f;
        


       // Records grades
       while (input != "DONE") {
           // Handles grade
           System.out.println("Enter Grade:");
           input = prompt.nextLine();
           
           if (input.equalsIgnoreCase("DONE")) {
               break;
           }
           
           System.out.println("Enter weight for class:");
           int grade = Integer.parseInt(input);
           int gradeWeight = Integer.parseInt(prompt.nextLine());
           
           // Assigns number to GPA based off of class weight
           switch (gradeWeight) {
               case 1: // Tier 1
                   if (grade >= 97) {
                       gpa += 5.0;
                   } else if (grade >= 94) {
                       gpa += 4.8;
                   } else if (grade >= 90) {
                       gpa += 4.6;
                   } else if (grade >= 87) {
                       gpa += 4.4;
                   } else if (grade >= 84) {
                       gpa += 4.2;
                   } else if (grade >= 80) {
                       gpa += 4.0;
                   } else if (grade >= 77) {
                       gpa += 3.8;
                   } else if (grade >= 74) {
                       gpa += 3.6;
                   } else if (grade >= 71) {
                       gpa += 3.4;
                   } else {
                       gpa += 3.0;
                   }
                   break;
                   
               case 2: // Tier 2
                   if (grade >= 97) {
                       gpa += 4.5;
                   } else if (grade >= 94) {
                       gpa += 4.3;
                   } else if (grade >= 90) {
                       gpa += 4.1;
                   } else if (grade >= 87) {
                       gpa += 3.9;
                   } else if (grade >= 84) {
                       gpa += 3.7;
                   } else if (grade >= 80) {
                       gpa += 3.5;
                   } else if (grade >= 77) {
                       gpa += 3.3;
                   } else if (grade >= 74) {
                       gpa += 3.1;
                   } else if (grade >= 71) {
                       gpa += 2.9;
                   } else {
                       gpa += 2.5;
                   }
                   break;
                
                case 3: // Tier 3
                   if (grade >= 97) {
                       gpa += 4;
                   } else if (grade >= 94) {
                       gpa += 3.8;
                   } else if (grade >= 90) {
                       gpa += 3.6;
                   } else if (grade >= 87) {
                       gpa += 3.4;
                   } else if (grade >= 84) {
                       gpa += 3.2;
                   } else if (grade >= 80) {
                       gpa += 3.0;
                   } else if (grade >= 77) {
                       gpa += 2.8;
                   } else if (grade >= 74) {
                       gpa += 2.6;
                   } else if (grade >= 71) {
                       gpa += 2.4;
                   } else {
                       gpa += 2.0;
                   }
                    break;
           }
           
           amtOfClasses++;
       }
       
       // Calculates the numerical GPA
       gpa = gpa / amtOfClasses;
       System.out.println(gpa);
    }
}