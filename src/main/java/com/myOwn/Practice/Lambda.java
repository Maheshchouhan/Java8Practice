/**
 * 
 */
package com.myOwn.Practice;

import java.util.ArrayList;
import java.util.List;

import com.myOwn.pojo.Student;

/**
 * @author Mahesh Chouhan
 *
 */
public class Lambda {

public static void main(String args[]){
	List<Student> studentList=new ArrayList<Student>();
	Student student=new Student();
	student.setAge(15);
	student.setDescription("Good");
	student.setMobileNumber("8050914144");
	student.setName("mahesh");
	studentList.add(student);
	Student student2=new Student();
	student2.setAge(20);
	student2.setDescription("Average");
	student2.setMobileNumber("8050914141");
	student2.setName("chouhan");
	studentList.add(student2);
	Student student3=new Student();
	student3.setAge(19);
	student3.setDescription("Average");
	student3.setMobileNumber("8050914143");
	student3.setName("umesh");
	studentList.add(student3);
	
	studentList.sort((s1,s2)->s1.getAge()-s2.getAge());
	System.out.println("Sort by age "+studentList);
	studentList.forEach((eachstudents)->System.out.println(eachstudents));
	
	studentList.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
	System.out.println("Sort by name "+studentList);
	studentList.forEach((eachstudents)->System.out.println(eachstudents));
	
}
}
