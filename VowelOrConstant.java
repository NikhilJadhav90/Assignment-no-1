/*
Program to Check Whether a character is Vowel or Consonant.
 */
import java.util.*;
public class VowelOrConstant {
    public static void main(String args[])
    {
        char c='V';
        
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')       
        {
            System.out.println("Letter is Vowel");
        }
        else
        {
            System.out.println("letter is constant");
        }
    }
}
