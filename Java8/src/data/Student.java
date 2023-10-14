package data;

import java.util.List;

public class Student {

	private String name;
	private int grade;
	private List<String> favouriteLectures;

	public Student(String name, int grade, List<String> favouriteLectures) {
		super();
		this.name = name;
		this.grade = grade;
		this.favouriteLectures = favouriteLectures;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<String> getFavouriteLectures() {
		return favouriteLectures;
	}

	public void setFavouriteLectures(List<String> favouriteLectures) {
		this.favouriteLectures = favouriteLectures;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", favouriteLectures=" + favouriteLectures + "]";
	}
}