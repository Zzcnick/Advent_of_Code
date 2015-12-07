import java.util.*;

public class Wrap2 {
    public int e1,e2,e3,volume,ribbon,total;
    
    public Wrap2() {
        e1 = 0;
	e2 = 0;
	e3 = 0;
    }
    public Wrap2(int w, int l, int h) {
	this();
	e1 = w;
	e2 = l;
	e3 = h;
	volume = e1 * e2 * e3;
        ribbon = 2 * (e1 + e2 + e3 - Math.max(e1, Math.max(e2,e3)));
	total = volume + ribbon;
    }

    public static void main(String[] args) {
	int sum = 0;
	Scanner sc = new Scanner(System.in); // $java Wrap2 < input.in
	while (sc.hasNext()) {
	    String[] inputs = sc.next().split("x");
	    int[] raw = new int[3];
	    for (int i = 0; i < inputs.length; i++) {
		raw[i] = Integer.parseInt(inputs[i]);
	    }
	    Wrap2 box = new Wrap2(raw[0], raw[1], raw[2]);
	    sum += box.total;
	}
	System.out.println("Total Ribbon Needed: " + sum);
    }
}
