import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class Checker implements Comparator {

	public int compare(Object o1, Object o2) {		
		
		Double cgpa1 = ((Student) o1).getCgpa();
		Double cgpa2 = ((Student) o2).getCgpa();

		String fname1 = ((Student) o1).getFname();
		String fname2 = ((Student) o2).getFname();

		int id1 = ((Student) o1).getId();
		int id2 = ((Student) o2).getId();
		
		if (cgpa1 > cgpa2) {
			return -1;
		} else if (cgpa1 < cgpa2) {
			return 1;
		} else if (cgpa1.equals(cgpa2)) {
			
			if (fname1.compareTo(fname2) > 0) {
				return 1;
			} else if (fname1.compareTo(fname2) < 0) {
				return -1;
			} else if (fname1.compareTo(fname2) == 0) {
				if (id1 > id2) {
					return -1;
				} else if (id1 < id2) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		return 0;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		Checker checker = new Checker();
		
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList, checker);

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
