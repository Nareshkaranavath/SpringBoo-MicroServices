package com.jackcon;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackcon.binding.Customer;

public class App {

	public static void main(String[] args) throws Exception {
		App a = new App();
		//a.convertJavaToJson();
		a.convertJsonToJava();
	}

	public void convertJavaToJson() throws Exception {

		Customer c = new Customer(101, "john", (long) 798454555);

		// convert java obj to json
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Serialization completed...");

	}

	public void convertJsonToJava() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(new File("customer.json"), Customer.class);
		System.out.println(c);
	}
}