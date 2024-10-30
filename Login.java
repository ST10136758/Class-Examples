/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10136758.poe.part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String username;
    private String userpassword;
  
    
    //create constructor for your variable fields
    //constructor must have the same name as your class, and must be in the utilised class
    
    public String GetUsername(){
        return username;
    }
    
     public String GetPassword(){
        return userpassword;
    }
    
    public Login(String Username, String Password){ 
        
        
//the variable 
        Username = username;
        Password = userpassword;
        
////removing blank spaces in username and password
//        this.password = password.trim();
//        this.username = username.trim();
    }
    
    //username must be 3 caracters long
    //password must be 6 characters long
    
    public static  boolean CheckUsername(String username) {
        if(username.length() <=5 && username.contains("_")){
            System.out.println("Username succesfly captured");
            return true;
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and  is no more than 5 charcaters long");
            return false;
        }
        
    }
    
    //this method checks if the password is valid
	public static boolean validPassword (String password)
	{
	    
	    if (password.length() >=8 ){
                System.out.println("Password succesfly captured");
                return true;
                
	        } 
        	else 
        	{
	    System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter,a number and a special charcter.");
	    return false;
	        }
	        }
	
        //This method will:
	//Review each character to see if the password has a number, capital, lowercase, 
	//if any are wrong will give a false reading and password not excepted
	
	public static boolean checkPasswordComplexity (String password){
	    boolean hasNumber = false;
	    boolean hasCapital = false;
	    boolean hasLowercase = false;
            boolean hasSpecial = false;
	    char c;
            
            Pattern specialPattern = Pattern.compile("[a-zA-Z0-9]*"); //creates a specific pattern that will be able to be recognized later, in this case the pattern is every character other than the special charcters
            Matcher specialMatcher = specialPattern.matcher(password); //checks if pattern matches the value in (), the password
            
	    
	    for(int i=0; i <password.length(); i++){
	        c = password.charAt(i); //c is equal to every character in the password, CharAt(i) makes sure that the for loop continues for every value of i
	        
	        if(Character.isDigit(c)){
	            hasNumber = true;
	          } 
	        else if(Character.isUpperCase(c)){
	            hasCapital = true;
	          }
	          
	        else if(Character.isLowerCase(c)){
	            hasLowercase = true;
	          } 
                else if(!specialMatcher.matches()){ //if the string and pattern don't match it must contain a special charcter
                return true;
            }
                    
	        else if(hasNumber && hasCapital && hasLowercase && hasSpecial ){ //makes sure every validation is met
	            return true;
	          } 
               
                    
                }
	return false; //a boolean must have a true and false perameter, will not run without both return statements
}

}
