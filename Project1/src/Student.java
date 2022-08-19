//Class for defining student object

public class Student {
	
	private String firstName;
	private String lastName;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;
	private int total = subject1 + subject2 + subject3 + subject4 + subject5;
	
	public Student(String firstName, String lastName, int subject1, int subject2, int subject3, int subject4,
			int subject5, int total) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.total = total;
	}
    
	//generate setters and getters
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSubject1() {
		return subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	public int getSubject4() {
		return subject4;
	}

	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}

	public int getSubject5() {
		return subject5;
	}

	public void setSubject5(int subject5) {
		this.subject5 = subject5;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + ": Subject 1 =" + subject1 + ", Subject 2 =" + subject2 + ", Subject 3 ="
				+ subject3 + ", Subject 4 =" + subject4 + ", Subject 5 =" + subject5 + ": TOTAL = " + total;
	}	
	

}
