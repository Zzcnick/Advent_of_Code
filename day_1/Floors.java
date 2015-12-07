import java.util.*;

public class Floors {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // Run with $java Floors < input.in
	int total = 0;
	while (sc.hasNext()) {
	    String raw = sc.next();
	    for (int i = 0; i < raw.length(); i++) {
		if (raw.substring(i,i+1).equals("(")) {
		    total += 1;
		} else {
		    total -= 1;
		}
	    }
	}
	System.out.println("Total: " + total);
    }
}
		
