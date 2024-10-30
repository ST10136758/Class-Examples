/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10136758.poe.part1;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    
        Scanner exceptionReader = new Scanner(System.in);
        String taskName;
        String devName;
        String devSurname;
        String taskDescription;
        String taskStatus;
        int taskNumber;
        String taskId;
        String createdTaskId;
        int taskDuration;
        int totalTaskHours;
        int totalTaskNumbersDisplay;
        int[] durationCalculator = new int[totalTaskNumbersDisplay];
        
    
     Task(String taskName, String devName, String devSurname,String taskDescription, String taskStatus, int taskNumber, int taskDuration, int totalTaskNumbersDisplay, String taskId   ){
        this.taskName = taskName;
        this.devName = devName;
        this.devSurname = devSurname;
        this.taskNumber = taskNumber;
        this.taskDuration = taskDuration;
        this.taskDescription = taskDescription;
        this.taskId = taskId;
        this.totalTaskHours = totalTaskHours;
        this.totalTaskNumbersDisplay = totalTaskNumbersDisplay;
        this.taskStatus = taskStatus;
        
       
    }
    
    public boolean checkTaskDescription() {
        if(taskDescription.length() <=50 ){
         
            return true;
        } else {
            System.out.println("Your Task Description exceeds 50 words, please try again \n");
            System.out.println("Re-enter your Task's description now");
            taskDescription = exceptionReader.nextLine();
            return false;
        }
    
        
        
        
}
    
    public String getTaskName(){ 
        return taskName;
    }
    public void setTaskName(){
        this.taskName = taskName;
    }
    
    
     public String getDevName(){ 
        return devName;
    }
    public void setDevName(){
        this.devName = devName;
    }
    
    
     public String getDevSurname(){ 
        return devSurname;
    }
    public void setDevSurname(){
        this.devSurname = devSurname;
    }
    
    
     public String getTaskDescription(){
        return taskDescription;
    }
    public void setTaskStatus(){
        this.taskDescription = taskDescription;
    }
    
    
     public String getTaskStatus(){
        return taskStatus;
    } 
     public int getTaskNumber(){
        return taskNumber;
    }
     
     
      public int getTaskDuration(){ 
        return taskDuration;
    }  
    public void setTaskDuration(){
        this.taskDuration = taskDuration;
    }
    
    
     public String getTaskId(){   
        return taskId;
    } 
    public void setTaskId(){
        this.taskId = taskId;
    }
  

    
    public String printTaskDetails(){
        JFrame taskDisplay = new JFrame();
                taskDisplay.setVisible(true);
                taskDisplay.setBackground(Color.red);
                Font Gabriola35 = new Font("Gabriola",Font.PLAIN,35);
                taskDisplay.setFont(Gabriola35);
                taskDisplay.setName("Task(s) Detail Display");
                
                
                StringBuilder append = new StringBuilder();
                
                append.append("Total Task Numbers: " + totalTaskNumbersDisplay + "\n"+ "Task Status: " + taskStatus +  "\n"+ "Developer Details: "
                        + devName +" " + devSurname + "\n"+ "Task Number: " + taskNumber + "\n"+ "Task Name: " + taskName + "\n"+  "Task Description: " + taskDescription + "\n"+  "Task ID: " + taskId + "\n"+ "Task Duration: " + taskDuration + " hours" + "\n"+ "Total Hours Accumulated Duration: " + taskDuration + " hours" );
                
                
                JOptionPane.showMessageDialog(taskDisplay,append.toString()); 
                
                return "Task Printing Complete";
    
    }
    
    public String createTaskID(String devName, int taskNumber, String taskName){
        
       
                taskId = taskName.substring(0,2) + ":" + taskNumber +":" + devName.substring(devName.length()-3, devName.length());
                
                System.out.println("Something smells fishy");
           
        
          
 
        return taskId;
    }
    
    public int returnTotalHours(int totalTaskHours){
    
        for(int i = 0; i < durationCalculator.length -1; i++){
            
                  totalTaskHours += durationCalculator[i];
  
        }
        
        
                
        return totalTaskHours;
    }
    
    
    

    
}
