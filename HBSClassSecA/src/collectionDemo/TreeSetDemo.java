package collectionDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		MyComparator m1 = new MyComparator();
		TreeSet t1 = new TreeSet(m1);
		t1.add(new Student(10,"Rahul Dixit"));
		t1.add(new Student(5,"Kamal"));
		t1.add(new Student(11,"Abhishek"));
		t1.add(new Student(15,"Zeesaan"));
		System.out.println(t1);

	}

}
