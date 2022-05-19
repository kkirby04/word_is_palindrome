//palindrome: a word that is spelt the same backwards as it is spelt forwards

import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){

        //calling the isPalindrome function
        isPalindrome();

    }

    //creating isPalindrome function
    public static void isPalindrome(){
        //user input scanner
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        
        int i =0;
        int len = word.length()-1;
        
        //while 0 is less than the length of the string increment across the word
         while(i < len){
             //incrementing across the word
             char c1 = word.charAt(i++);
             
             //decrementing across the word starting from the end and working backwards
             char c2 = word.charAt(len--);
            
             //if the letter at the position of c1 and the letter at the position of c2 are not the same output 
             if(c1 != c2){
                 System.out.println(word + " is not a palindrome");
             }
             else{
                 System.out.println(word + " is a palindrome");
             }
         }
    }

}