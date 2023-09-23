package collectionDemo;

public class Student implements Comparable{
	private int id;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s1 = (Student)o;
		if(id<s1.id)
			return -1;
		if(id>s1.id)
			return +1;
			return 0;
			
	
	}
	
	
}
