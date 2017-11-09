/**
 * 
 */
package com.myOwn.pojo;

/**
 * @author Mahesh Chouhan
 *
 */
public class Student {

	private String Name;
	private String Description;
	private int age;
	private String mobileNumber;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Description=" + Description + ", age=" + age + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	
}
