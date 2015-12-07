import java.util.*;

public class Wrap {
    public int s1,s2,s3,min,total;
    
    public Wrap() {
	s1 = 0;
	s2 = 0;
	s3 = 0;
    }
    public Wrap(int w, int l, int h) {
	this();
	s1 = w * l;
	s2 = w * h;
	s3 = h * l;
	min = Math.min(s1, Math.min(s2, s3));
	total = 2 * (s1 + s2 + s3) + min;
    }

    public static void main(String[] args) {
	int sum = 0;
	Scanner sc = new Scanner(System.in); // $java Wrap < input.in
	while (sc.hasNext()) {
	    String[] inputs = sc.next().split("x");
	    int[] raw = new int[3];
	    for (int i = 0; i < inputs.length; i++) {
		raw[i] = Integer.parseInt(inputs[i]);
	    }
	    Wrap box = new Wrap(raw[0], raw[1], raw[2]);
	    sum += box.total;
	}
	System.out.println("Total Wrapping Paper Needed: " + sum);
    }
}
