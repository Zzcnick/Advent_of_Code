import java.io.*;
import java.util.*;

public class Presents {
    public List<int[]> checked = new ArrayList<int[]>();
    public int x,y;

    public Presents() {
	x = 0;
	y = 0;
	checked.add(new int[]{x,y}); // Initial position.
    }	

    public static void main(String[] args) {
	Presents path = new Presents();
	Scanner sc = new Scanner(System.in); // $java Presents < input.in
	String directions = sc.next();
	for (int i = 0; i < directions.length(); i++) {
	    path.move(directions.substring(i,i+1));
	}
	// Removing Duplicates
	Set<int[]> finalPath = new HashSet<int[]>();
	finalPath.addAll(path.checked);
	path.checked.clear();
	path.checked.addAll(finalPath);
	// System.out.println(path);
	System.out.println("Houses Delivered To: " + path.checked.size());
    }

    public void move(String s) {
	if (s.equals("<")) {
	    x -= 1;
	} else if (s.equals(">")) {
	    x += 1;
	} else if (s.equals("^")) {
	    y += 1;
	} else if (s.equals("v")) {
	    y -= 1;
	}
	addPath();
    }
    public void addPath() {
	int[] i = new int[]{x,y};
	checked.add(i);
    }
	    
    public String toString() {
	String retVal = "";
	Object[] print = checked.toArray();
	for (Object i : print) {
	    int[] row = (int[])i;
	    retVal += "[" + ("" + row[0]) + "," + ("" + row[1]) + "]\n";
	}
	return retVal;
    }
}
