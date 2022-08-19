//this class includes the methods for accessing a student text file

//import the necessary modules
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentFileReader {
	
	//create an array list of types Student
	private static ArrayList<Student> studentsList = new ArrayList<Student>();
	
	//create method to get file contents
	public static void getStudents() throws FileNotFoundException {
		File file = new File("students.txt");
		Scanner readFile = new Scanner(file);
		
		StringTokenizer token = null;
		
		// initialize variables to be used in the constructor
		String firstName = "";
		String lastName = "";
		int subject1 = 0;
		int subject2 = 0;
		int subject3 =0;
		int subject4 = 0;
		int subject5 = 0;
		int total = subject1 + subject2 + subject3 + subject4 + subject5;
		
		while(readFile.hasNext()) {
			
			//get and assign text file contents to variables
			token = new StringTokenizer(readFile.nextLine(), ",");
			firstName = token.nextToken();
			lastName = token.nextToken();
			subject1 = Integer.parseInt(token.nextToken());
			subject2 = Integer.parseInt(token.nextToken());
			subject3 = Integer.parseInt(token.nextToken());
			subject4 = Integer.parseInt(token.nextToken());
			subject5 = Integer.parseInt(token.nextToken());
			total = subject1 + subject2 + subject3 + subject4 + subject5;
			
			//Create the student object with the data fetched from file
			Student student = new Student(firstName, lastName, subject1, subject2, subject3, subject4, subject5, total);
			studentsList.add(student);
			
			//ranking the students from top performer(using the Collections.sort()) method
			Collections.sort(studentsList, new Comparator<Student>()
					{
				public int compare(Student s1, Student s2) {
					return Integer.compare(s2.getTotal(), s1.getTotal());
				}
					});
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		getStudents();
		
		for(Student student: studentsList) {
			System.out.println(student);
		}
		
	}

}
