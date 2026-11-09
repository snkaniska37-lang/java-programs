import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a string:");
	    String result="";
	    String og_string=sc.nextLine().toLowerCase().trim();
	    for(int i=og_string.length()-1;i>=0;i--){
	        result=result+og_string.charAt(i);
	    }
	    if (og_string.equals(result)){ 
	       System.out.println(og_string+" is a Palindrome");
	    }
	    else{
	        System.out.println(og_string+" is not a Palindrome");
	    }

	    
	    
	}
}
