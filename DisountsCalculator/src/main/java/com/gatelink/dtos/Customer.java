package com.gatelink.dtos;


/**This class creates the Customer object that is used by the application to store and manage customer information
 * */

public class Customer {	
private String firstName;
private String lastName;
private int age;
private boolean isHomeOwner;
private int recentAccidents;
private int numberOfCarsInsured;
private boolean isVeteran;
private int commuteMiles;
private boolean isGoodStudent;
private String totalDiscount;
private String recommend;
private String result = "success";

//getters and setters

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isHomeOwner() {
	return isHomeOwner;
}
public void setHomeOwner(boolean isHomeOwner) {
	this.isHomeOwner = isHomeOwner;
}
public int getRecentAccidents() {
	return recentAccidents;
}
public void setRecentAccidents(int recentAccidents) {
	this.recentAccidents = recentAccidents;
}
public int getNumberOfCarsInsured() {
	return numberOfCarsInsured;
}
public void setNumberOfCarsInsured(int numberOfCarsInsured) {
	this.numberOfCarsInsured = numberOfCarsInsured;
}
public boolean isVeteran() {
	return isVeteran;
}
public void setVeteran(boolean isVeteran) {
	this.isVeteran = isVeteran;
}
public int getCommuteMiles() {
	return commuteMiles;
}
public void setCommuteMiles(int commuteMiles) {
	this.commuteMiles = commuteMiles;
}
public boolean isGoodStudent() {
	return isGoodStudent;
}
public void setGoodStudent(boolean isGoodStudent) {
	this.isGoodStudent = isGoodStudent;
}
public String getTotalDiscount() {
	return totalDiscount;
}
public void setTotalDiscount(String totalDiscount) {
	this.totalDiscount = totalDiscount;
}
public String getRecommend() {
	return recommend;
}
public void setRecommend(String recommend) {
	this.recommend = recommend;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}

}
