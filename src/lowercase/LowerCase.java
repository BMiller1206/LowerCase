//*****************************************************************************
//Name: Brent Miller
//Date: 070915
//Project Name: Lowercase
//Description: Given a string write a program to convert it inot lowercase.
//The first argument will be a path to a filename containing sentences, one per
//line. Print out the lowercase version of the sentence, each on a new line.
//*****************************************************************************
package lowercase;

import java.util.Scanner;
import java.io.*;

//begin class LowerCase
public class LowerCase 
{   
    //begin main
    public static void main(String[] args) throws IOException
    {    
        Scanner reader = new Scanner(new FileReader("intext.txt"));
        
        // print out each line to console in lower case 
        while (reader.hasNext())
        {
            System.out.println((reader.nextLine()).toLowerCase());            
        }//end while           
    }//end main    
}//end class LowerCase