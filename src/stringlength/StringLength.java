
package stringlength;

import java.util.Scanner;

public class StringLength {
    
    public static void main(String[] args) {
        
        //Request a String from the user at the command line and find it's length.
        
        System.out.print("Please enter a String: ");
        Scanner in = new Scanner(System.in);
        String StringLength;
        int length;
        StringLength = in.nextLine();
        length = StringLength.length();
        
        /*Program should output: "Your string has a length of X characters." where X is the String's length.
        * Allow for the String to be one or more words of input.
        * Be sure to use the suitable method for determining the length of the String.
        */
        
        System.out.println("Your string has a length of " + length + " characters.");
    }
    
}
