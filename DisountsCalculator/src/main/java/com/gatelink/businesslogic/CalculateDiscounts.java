package com.gatelink.businesslogic;

import com.gatelink.dtos.Customer;

public class CalculateDiscounts {
	
	/**Main method to get all discounts
	 * This method calls the individual methods below to calculate the actual discounts allowed. 
	 * the total discounts are summed up and results returned to user as a % .
	 * */
		
	public Customer getAllDiscounts(Customer customer) {
		//String recommendation is the text message that the user will see depending on the discounts they quslified for. 
		
		String recommendation = "Good job "+customer.getFirstName() +" You qualified for 5% or more discounts";		
		int totalDiscount = 0;
		//call methods below, increment the value of totalDiscount as per the results.
		totalDiscount += getSeniorCitizen(customer.getAge());
		totalDiscount += ownsHome(customer.isHomeOwner());
		totalDiscount += recentAccidents(customer.getRecentAccidents());
		totalDiscount += carsInsured(customer.getCommuteMiles());
		totalDiscount += isVeteran(customer.isVeteran());
		totalDiscount += commuteMiles(customer.getCommuteMiles());
		totalDiscount += goodStudent(customer.isGoodStudent());
		
		if(totalDiscount < 5) {
			recommendation = customer.getFirstName() +", You could qualify for more discounts in the future if "
					+ "you meet any of these criteria: have no accident in 3 years, buy a home, commute less than 26 miles per day"
					+ "or if you are a student and submit proof of good grades";
		}
		
		customer.setTotalDiscount(String.valueOf(totalDiscount)+"%");
		customer.setRecommend(recommendation);
		
		return customer;
		
	}
	
	/**worker methods to get individual discounts
	 * Each method returns an int result
	 * we add up the total from all methods to determine the % discount customer qualifies
	 * if the discount is less than 5%, we make one or two recommendations for the customer
	 * */
	
	/**You have to be older than 65 to get this discount*/
	private int getSeniorCitizen(int age) {
		if (age >= 65) {
			return 1;
		}else return 0;
	}
	
	/**You have to own a home to get this discount*/
	private int ownsHome(boolean owns) {
		if (owns){
			return 1;
		}else return 0;		
	}
	
	/**You have to have been accident free in the past 3 years to get this discount*/
	private int recentAccidents(int accidents) {
		if(accidents > 0) {
			return 0;
		}else return 1;
		
	}
	
	/**You have to have more than one car to get this discount*/
	private int carsInsured(int cars) {
		if(cars>1) {
			return 1;
		}else return 0;
	}
	
	/**You need to be a US Military veteran to get this discount*/
	private int isVeteran(boolean isVet) {
		if(isVet) {
			return 1;
		}else return 0;
	}
	
	/**Your one way commute has to be below 26 miles to get this discount*/
	private int commuteMiles(int commute) {
		if(commute < 26) {
			return 1;
		}else return 0;
	}
	
	/**You need to be a Student with good grades to get this discount*/
	private int goodStudent(boolean student) {
		if(student) {
			return 1;
		}else return 0;
	}

}
