import java.io.Console;
import java.util.*;
import java.lang.*;


public class StringFun{

    public static void main(String[] args) {  
    //getting input
    Console Console = System.console();
    //Console otherStringConsole = System.console();
    //Console subStringConsole = System.console();

    //reading the input
    String s = Console.readLine("enter value for s:");
    String otherString = Console.readLine("enter value for otherString:");
    String subString = Console.readLine("enter value for subString:");

    //getting lengths
    int lengthOfS = s.length();
    int lengthOtherString = otherString.length();
    int lengthSubString = subString.length();

    //using equals method, compares exact string values and returns a boolean
    boolean sEqualsOtherString = s.equals(otherString);
    boolean sEqualsSubString = s.equals(subString); 
    
    //using substring method, gets substring by passing two indexes and returns a string value
    String subStringValue = s.substring(0, s.length() - 1);

    //trim method, trims white space or trailing and returns string w/out whitespace
    String trimValue = otherString.trim();

    //character index number method, it passes a character and returns index as an int
    int indexValue = s.indexOf('a');
    
    //index character return method, it pases an index as an int and returns a character 
    char charValue = s.charAt(indexValue); 

    //check for empty string, returns true or false is string is empty
    boolean checkEmpty = s.isEmpty();
    
    //replaces substring, returns a new string with replacement 
    String newString = s.replace('e', 'o');

    System.out.println("The length of length of s: " +lengthOfS);
    System.out.println("The length of other string: " +lengthOtherString);
    System.out.println("The length of substring: " +lengthSubString);
    System.out.println("Does the value of s equal otherString?: " +sEqualsOtherString);
    System.out.println("Does the value of s equal subString?: " +sEqualsSubString);
    System.out.println("The subString value of s is: " +subStringValue);
    System.out.println("otherString trimmed:" +trimValue);
    System.out.println("The index value of 'a' in variable s: " +indexValue);
    System.out.println("The character value at index:"+indexValue+" for varible s is: " +charValue);
    System.out.println("Is variable s an empty string: " +checkEmpty);
    System.out.println("The variable s with 'o' replaced for 'e': " +newString);


    }
    
    }

    