package com.college.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	private Integer studentId;
	private String studentName;
	private String studentFatherName;
	private String studentMotherName;
	private String studentEmail;
	private String studentPassword;
	
	public static void main(String[] args) {
		
		Student st=new Student();
		
		
		
		
	}

}
