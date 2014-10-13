package com.freedomsphere.soldiertrack;

public class Soldier {
	
	//constructor
	public Soldier(int id, String firstName, String middleName, String lastName, 
			String dob, String sex) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleName(middleName);
		this.setSex(sex);
		this.setDob(dob);
	}
	
	
	//properties
	private String firstName, lastName, middleName, dob, sex;
	private int id;
	
	
	
	//get methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getSex() {
		return sex;
	}
	public String getDob() {
		return dob;
	}
	public int getId(){
		return id;
	}
	
	//set methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setSex(String sex) {
		//test to make sure sex is valid, otherwise make them male
		if(sex == "male" || sex == "female")
		{
			this.sex = sex;
		}
		else
		{
			this.sex = "male";
		}
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Soldier ID: " + getId() +
				"\nName: " + getLastName() + ", " + getFirstName() + " " + getMiddleName().substring(0, 1) +
				".\nDOB: " + getDob() + "\tSex: " + getSex(); 
	}
	
	
	
	
	
}
