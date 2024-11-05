package hazhel_tr;

import java.util.Scanner;

public class Group_assignment {
	
	static class Student{
		 private String studentID;
		 private String name;
	     private int age;
         private double gpa;
         
         public String getName() {
         	return name;
         }
         public String getstudentID() {
         	return studentID;
         }
         public int getAge() {
         	return age;
         }
         public double getGpa() {
         	return gpa;
         }
         public void setName(String newName) {
         	this.name = newName;
         }
         public void setstudentID(String newID) {
         	this.studentID = newID;
         }
         public void setAge(int newAge) {
         	this.age = newAge;
         }
         public void setGpa(double newGpa) {
         	this.gpa = newGpa;
         }
	}
         
         public static void main(String[] args) {
        	 Scanner scan = new Scanner(System.in);
        	 Student student1 = new Student();
      		 Student student2 = new Student();
      		 String name, id;
      		 int selection, choose;
      		 int age;
      		 double gpa;
      		 
      		//input of the students info
     		System.out.print("Enter your First Student's name: ");
     		name = scan.next();
     		student1.setName(name);
     		System.out.print("Enter your First Student ID: ");
     		id = scan.next();
     		student1.setstudentID(id);
     		System.out.print("Enter your First Student's age: ");
     		age = scan.nextInt();
     		student1.setAge(age);
     		System.out.print("Enter your First Student's gpa: ");
     		gpa = scan.nextDouble();
     		student1.setGpa(gpa);
     		
     		System.out.print("Enter your Second Student's name: ");
     		name = scan.next();
     		student2.setName(name);
     		System.out.print("Enter your Second Student ID: ");
     		id = scan.next();
     		student2.setstudentID(id);
     		System.out.print("Enter your Second Student's age: ");
     		age = scan.nextInt();
     		student2.setAge(age);
     		System.out.print("Enter your Second Student's gpa: ");
     		gpa = scan.nextDouble();
     		student2.setGpa(gpa);
     		
     		//to set the students info
    		for(;;) {
    			//for the user to choose whether to look or update
    			System.out.println("_________________________________");
    			System.out.println("INPUT SUCCESSFUL!");
    			System.out.println("1. Show Students detail");
    			System.out.println("2. Update age and GPA of Student");
    			System.out.print("Please choose a number above: ");
    			selection = scan.nextInt();
    			System.out.println("_________________________________");
    			
    			switch(selection) {
    			case 1:
    				//output of the student's info and using get to return the variable
    				System.out.println("STUDENT'S INFO: ");
    				System.out.println("First Student: ");
    				System.out.println("Name: " + student1.getName());
    				System.out.println("Student ID: " + student1.getstudentID());
    				System.out.println("Age: " + student1.getAge());
    				System.out.println("GPA: " + student1.getGpa());
    				
    				System.out.println("Second Student: ");
    				System.out.println("Name: " + student2.getName());
    				System.out.println("Student ID: " + student2.getstudentID());
    				System.out.println("Age: " + student2.getAge());
    				System.out.println("GPA: " + student2.getGpa());
    				break;
    				
    		    //if user wants to update the students age and gpa
    			case 2:
    				System.out.println("1. First Student \t \t 2. Second student");
    				System.out.print("Pls choose above: ");
    				choose = scan.nextInt();
    				
    				switch (choose) {
    				case 1:
    					System.out.print("First student's age: ");
    					age = scan.nextInt();
    					student1.setAge(age);
    					System.out.print("First student's GPA: ");
    					gpa = scan.nextDouble();
    					student1.setGpa(gpa);
    					break;
    				case 2:
    					System.out.print("Second student's age: ");
    					age = scan.nextInt();
    					student2.setAge(age);
    					System.out.print("Second student's GPA: ");
    					gpa = scan.nextDouble();
    					student2.setGpa(gpa);
    					break;
    				}
    			}
    	  
    		}
         }
     		
     		
	
	
}
