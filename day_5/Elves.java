import java.util.*;
import java.io.*;

public class Elves {
    public static final String VOWELS = "aeiou";
    
    public static boolean nice(String s) { // Is it good?
	int vowels = 0;
	boolean twoRow = false;
	for (int i = 0; i < s.length()-1; i++) {
	    String letter = s.substring(i,i+1);
	    if (VOWELS.indexOf(letter) != -1) {
		vowels += 1;
	    }
	    if (letter.equals(s.substring(i+1,i+1))) {
		twoRow = true;
	    }
	}
	if (VOWELS.indexOf(s.substring(s.length()-1, s.length())) != -1)
	    vowels += 1;
	return (vowels > 2 && twoRow); 
    }

    public static boolean bad(String s) { // Is it bad?
	for (int i = 0; i < s.length()-1; i++) {
	    String check = s.substring(i,i+2);
	    if (check.equals("ab") ||
		check.equals("cd") ||
		check.equals("pq") ||
		check.equals("xy"))
		return true;
	}
	return false;
    }
	
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count = 0;
	while (sc.hasNext()) {
	    String s = sc.next();
	    if (nice(s) && !(bad(s)))
		count += 1;
	    System.out.println(count);
	}
	System.out.println("Count: " + count);
    }
}
