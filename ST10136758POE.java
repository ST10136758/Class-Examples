/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Current Issues


package com.mycompany.st10136758.poe.part1;


import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author RC_Student_lab
 */
public class ST10136758POE {

    public static void main(String[] args) {
        
       
    Scanner ui = new Scanner(System.in);
    Scanner intScan = new Scanner(System.in);

    boolean registeredUser = false;
    String username = null;
    String firstname = null; 
    String lastname = null;
    String userpassword = null;
    String blankSpace;
    int choice;
    int statusDecision;
    int totalTaskDuration;
    int totalTaskNumbers =0;
    boolean loggedIn = false;
    
    String inputTaskName;
    String inputDevName;
    String inputDevSurname;
    String inputTaskDescription;
    String inputTaskStatus;
    int currentTaskNumber = 999;
    int tasksCreated = 0;
    String inputTaskId;
    int inputTaskDuration;
    ArrayList<Task> taskList = new ArrayList();
    
    
   

    while(!registeredUser){

      
      System.out.println("\nGood Day User\n"
                + "Today we will be creating your Easy Khaban account.\n"
                + "To begin this process please enter in your username below\n"
                + "(Username contain an underscore and have no more than 5 letters");
        
      username = ui.nextLine();                              
       
      System.out.println("Now please enter your password below\n"
               + "Password must contain at least 1 Uppercase, 1 Lowercase, 1 Number, 1 Special Character and be at least 8 letters long");
      
      userpassword = ui.nextLine();
       
      System.out.println("Write your first name below");
      firstname = ui.nextLine();
      
      System.out.println("Write your last name below");
      lastname = ui.nextLine();
      
               if (Login.CheckUsername(username) && Login.validPassword(userpassword)) {
               Login newAccount = new Login(username, userpassword);

               
               System.out.println("User has been successfully registered");
               registeredUser = true;        
               }
               else {
                   System.out.println("User has not been successfully registered!!"); 
                   System.out.println("Please follow the instructions given and try again");
               } 
     
               
    if(registeredUser){
            System.out.println("To login\n"
                       + "Please enter your username below");
            String usernameConfirmation = ui.nextLine();
               
            System.out.println("Please enter your password below to complete log in process.");
            String passwordConfirmation = ui.nextLine();
               
                       if(loginUser( username,  passwordConfirmation,  usernameConfirmation,  userpassword) == false){
            System.out.println(" \n \n Welcome" + firstname + " " + lastname + " to Easy Khaban");
                       
                       loggedIn = true;
                       } else{
                           System.out.println("The Username or Password you entered were invalid");
                           loggedIn = false;
                       }
    }
            
          if(loggedIn == true) 
             
              
           System.out.println(" \n Please Select an Option from the following menu to continue" +
           "\n(1) Add Task" +
           "\n(2) Show Report" +
           "\n(3) Quit");
            
            choice = ui.nextInt();
            
            
          do{  
            
            switch(choice){
            case 1:
                
             
                System.out.println("Please enter how many tasks you would like to add");
                totalTaskNumbers = intScan.nextInt();
                blankSpace = ui.nextLine();
 
                currentTaskNumber = 0;
          
 
                for(int i = 0; i < totalTaskNumbers; i++ ){
                    int[] durationCounter = new int[totalTaskNumbers];
                    

                System.out.println("Please enter the name of your task");
                inputTaskName = ui.nextLine();
                
                System.out.println("Please enter a description of your task (Description must not exceed 50 words)");
                inputTaskDescription = ui.nextLine();
                
                
                System.out.println("Please enter the number correlating to the status of your task, either : \n(1)To Do \n(2)Done  \n(3)Doing ");
                statusDecision = intScan.nextInt();
                
                switch(statusDecision){
                    case 1: inputTaskStatus = "To Do"; break;
                    case 2: inputTaskStatus = "Done"; break;
                    case 3: inputTaskStatus = "Doing"; break;
                    default: inputTaskStatus = "You entered an invalid option during the Task Status menu stage";
                    
                }
                
                
                
                System.out.println("Please enter the first name of your task developer");
                inputDevName = ui.nextLine();
                
                System.out.println("Please enter the surname of your task developer");
                inputDevSurname = ui.nextLine();
                
                System.out.println("Please enter the expected duration to complete this task in hours");
                inputTaskDuration = intScan.nextInt();
                
                durationCounter[currentTaskNumber] = inputTaskDuration;
                
                              
                Task aTask = new Task(inputTaskName, inputDevName, inputDevSurname, inputTaskDescription, inputTaskStatus, currentTaskNumber, inputTaskDuration, totalTaskNumbers, "place_holder");
                taskList.add(aTask);
                
                currentTaskNumber++;
                inputTaskDuration = 0;
                aTask.createTaskID(aTask.devName, aTask.taskNumber, aTask.taskName);
                aTask.checkTaskDescription();
                
                
                
                System.out.println(aTask.createdTaskId + "\n "+ aTask.taskId + "\n" + "The input status: " + inputTaskStatus + "\n" + aTask.taskStatus + "\n Calculator Sum: " + durationCounter[0]);
                System.out.println("Press enter to continue");
                blankSpace = ui.nextLine();
                
                aTask.printTaskDetails();
                
                tasksCreated ++;
                
                    if (tasksCreated != totalTaskNumbers){
                        aTask.returnTotalHours(aTask.totalTaskHours);
                    }
               
 
                }
                
                System.out.println("Task(s) Creation Completed");
                
                
                
                
                break;
            case 2: System.out.println("Coming Soon");
                System.exit(0);
                break;
            case 3: 
                System.out.println("Existing the System");
                System.exit(0);
                break;
                
            default: System.out.println("Invalid Option, Please Choose Again!");
            
                                 }
          } 
          while(choice !=3);
   }      
              
        }
            

    public static boolean loginUser(String username, String passwordConfirmation, String usernameConfirmation, String userpassword){
        
        if(username == usernameConfirmation  && userpassword == passwordConfirmation){    
            return true;
        }
         
        else{ return false; }
    
    
    }
}


