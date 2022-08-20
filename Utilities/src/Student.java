
/**
 * @author Jaspal Singh
 *
 *         This is a student parent class contains student methods and
 *         properties.
 */

public class Student {
	private int stuId;
	private String fName;
	private String lName;
	private String course;
	private String grade;
	private String stuAddress;
	private String collegeName;

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * @return student id
	 */
	public int getStuId() {
		return stuId;
	}

	/**
	 * @return student first name.
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @return student last name
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @return student course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @return student grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @return student address
	 */
	public String getStuAddress() {
		return stuAddress;
	}


	/**
	 * @return student college name.
	 */
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * @param stuId       is a student id.
	 * @param fName       is a first name of student
	 * @param lName       is a last name of student
	 * @param course      is a course student select
	 * @param grade       is a grade of student
	 * @param stuAddress  is address of student
	 * @param collegeName is college name of student
	 */
	/*
	 * public Student(int stuId, String fName, String lName, String course, String
	 * grade, String stuAddress, String collegeName) { this.stuId = stuId;
	 * this.fName = fName; this.lName = lName; this.course = course; this.grade =
	 * grade; this.stuAddress = stuAddress; this.collegeName = collegeName; }
	 */

	public void display() {
		System.out.println("Student name: " + getfName() + " " + getlName());
		System.out.println("Student Id: " + getStuId());
		System.out.println("Student course: " + getCourse());
		System.out.println("Student grade: " + getGrade());
		System.out.println("Student address: " + getStuAddress());
		System.out.println("Student college name: " + getCollegeName());
	}

	public void display(Student[] stu) {
		for (var student : stu) {
			System.out.println("Student name: " + student.getfName() + " " + student.getlName());
			System.out.println("Student Id: " + student.getStuId());
			System.out.println("Student course: " + student.getCourse());
			System.out.println("Student grade: " + student.getGrade());
			System.out.println("Student address: " + student.getStuAddress());
			System.out.println("Student college name: " + student.getCollegeName());
		}

	}

	/**
	 * @param stu array of student type
	 * @param id to search
	 * @return student object against searched id
	 * 
	 * this method do normal search and return whole object.
	 */
	public Student searchById(Student[] stu, int id) {
		for (var student : stu) {
			if (student.getStuId() == id) {
				return student;
			}
		}
		return null;
	}

	
	/**
	 * @param stu student type array
	 * @param id student id to search
	 * @param start index of array
	 * @param end index of array
	 * @return index at which value found otherwise -1
	 * 
	 * this method do binary search
	 */
	public int binarySearchById(Student[] stu, int id, int start, int end) {
		var middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}

		if (stu[middle].getStuId() < id) {
			return binarySearchById(stu, id, middle + 1, end);
		}

		if (stu[middle].getStuId() > id) {
			return binarySearchById(stu, id, start, middle - 1);
		}

		if (stu[middle].getStuId() == id) {
			return middle;
		}

		return -1;
	}

	/**
	 * @param stu array of student type
	 * this method do bubble sorting
	 */
	public void bubbleSortStudentById(Student[] stu) {
		for (int i = 0; i < stu.length; i++) {
			for (int j = i + 1; j < stu.length; j++) {
				if (stu[i].getStuId() > stu[j].getStuId()) {
					var temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		}
	}

	/**
	 * @param stu array of student type
	 * this method do bubble sorting
	 */
	public void bubbleSortStudentByFirstName(Student[] stu) {
		for (int i = 0; i < stu.length; i++) {
			for (int j = i + 1; j < stu.length; j++) {
				if (stu[i].getfName().compareTo(stu[j].getfName()) > 0) {
					var temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		}
	}

	/**
	 * @param stu array of student type
	 * this method do bubble sorting
	 */
	public void bubbleSortStudentByLastName(Student[] stu) {
		for (int i = 0; i < stu.length; i++) {
			for (int j = i + 1; j < stu.length; j++) {
				if (stu[i].getlName().compareTo(stu[j].getlName()) > 0) {
					var temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		}
	}

	/**
	 * @param stu array of student type
	 * this method do bubble sorting
	 */
	public void bubbleSortStudentByCourses(Student[] stu) {
		for (int i = 0; i < stu.length; i++) {
			for (int j = i + 1; j < stu.length; j++) {
				if (stu[i].getCourse().compareTo(stu[j].getCourse()) > 0) {
					var temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		}
	}

	
	/**
	 * @param stu array of student type
	 * this method do insertion sorting
	 */
	public void insertionSortByCourse(Student[] stu) {
		int len = stu.length;
		for (int j = 1; j < len; j++) {
			var key = stu[j];
			int i = j - 1;
			while ((i > -1) && (stu[i].getCourse().compareTo(key.getCourse()) > 0)) {
				stu[i + 1] = stu[i];
				i--;
			}
			stu[i + 1] = key;
		}
	}

}
