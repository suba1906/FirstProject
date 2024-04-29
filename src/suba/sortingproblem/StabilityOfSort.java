package suba.sortingproblem;

import java.util.Arrays;
import java.util.List;

public class StabilityOfSort {

	public static void main(String[] args) {

		class Student implements Comparable<Student> {

			private String StudentName;
			private int StudentMark;

			/**
			 * @return the studentName
			 */
			public String getStudentName() {
				return StudentName;
			}

			/**
			 * @param studentName the studentName to set
			 */
			public void setStudentName(String studentName) {
				StudentName = studentName;
			}

			/**
			 * @return the studentMark
			 */
			public int getStudentMark() {
				return StudentMark;
			}

			/**
			 * @param studentMark the studentMark to set
			 */
			public void setStudentMark(int studentMark) {
				StudentMark = studentMark;
			}

			public Student(String studentName, int studentMark) {
				super();
				StudentName = studentName;
				StudentMark = studentMark;
			}

			@Override
			public String toString() {
				return "Student [StudentName=" + StudentName + ", StudentMark=" + StudentMark + "]";
			}

			public Student() {
				super();
				// TODO Auto-generated constructor stub
			}

			@Override
			public int compareTo(Student o) {

				return this.StudentMark - o.getStudentMark();
			}

		}

		Student[] list = { new Student("suba", 97), new Student("elisa", 49), new Student("bala", 81),
				new Student("das", 49) };

		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
	}

}
