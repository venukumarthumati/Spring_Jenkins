package com.javapalace.Spring_Jenkins.entity;

public class Student {
	
	private Long id;
	private String studentName;
	private String standard;
	private String marks;

	public Student(Long id, String studentName, String standard, String marks) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.standard = standard;
		this.marks = marks;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", standard=" + standard + ", marks=" + marks
				+ "]";
	}

}
