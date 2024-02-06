package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li=new ArrayList();
		List <Integer> li1=new ArrayList<Integer> ();
		li.add("vinod");
		li.add(25);
		//li.add("ravi");
		li.add("vinod");
		li.add(26);
		li.get(2);
		li.remove("vinod");
		li.add("ravi");
		System.out.println(li);
		//Set<Comparable> s=new HashSet<Comparable>(li);
		//System.out.println(s);

	}

}
