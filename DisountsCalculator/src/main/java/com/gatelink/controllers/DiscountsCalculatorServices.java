package com.gatelink.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gatelink.businesslogic.CalculateDiscounts;
import com.gatelink.dtos.Customer;

@RestController
public class DiscountsCalculatorServices {
	
	/**This web service will call the calculateDiscounts business logic
	 * and get the discounts that the user qualifies for based on the parameters passed by the user.
	 * This is a REST GET service
	 * The service returns an object of type Customer with the discounts allowed, and a recommendation for other
	 * discounts that the customer may qualify for in the future
	 * */

	@RequestMapping("/getDiscounts")
	public Customer getDiscounts (@RequestParam(value="firstName") String firstName,
									@RequestParam(value="lastName") String lastName,
									@RequestParam(value="age") int age,
									@RequestParam(value="isHomeOwner") boolean isHomeOwner,									
									@RequestParam(value="accidents") int accidents,
									@RequestParam(value="carsInsured") int carsInsured,
									@RequestParam(value="isVeteran") boolean isVeteran, 
									@RequestParam(value="commuteMiles") int commuteMiles,
									@RequestParam(value="isGoodStudent") boolean isGoodStudent)
			 {		
		Customer customer = new Customer();
		Customer results = new Customer();
		//assign user input to customer Object
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setAge(age);
		customer.setHomeOwner(isHomeOwner);
		customer.setRecentAccidents(accidents);
		customer.setNumberOfCarsInsured(carsInsured);
		customer.setVeteran(isVeteran);
		customer.setCommuteMiles(commuteMiles);
		customer.setGoodStudent(isGoodStudent);
		
		//call business logic to calculate discounts
		try {
		CalculateDiscounts cd = new CalculateDiscounts();
		results = cd.getAllDiscounts(customer);	
		}
		catch(Exception ex) {
			String error = "An error ocurred during the operation. Please try again later. The error is : "+ex.getMessage();
			results.setResult(error);
			return results;
		}
		
		return results;
	}
		
}