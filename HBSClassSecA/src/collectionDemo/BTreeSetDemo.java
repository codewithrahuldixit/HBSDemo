package collectionDemo;

import java.util.TreeSet;

public class BTreeSetDemo {

	public static void main(String[] args) {
	
		
		MyComparator m1 = new MyComparator();
		TreeSet t1 = new TreeSet(m1);
		t1.add(new Student(1,"Viraj"));
		t1.add(new Student(2,"Satyam"));
		t1.add(new Student(3,"Kamal"));
		t1.add(new Student(4,"Rahul"));
		System.out.println(t1);

	}

}
