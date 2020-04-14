package edu.miu.obs.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import edu.miu.obs.builder.CustomerBuilder;
import edu.miu.obs.domain.Customer;
import edu.miu.obs.service.CustomerService;

/**
 * The Class Main.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Component
public class Main {

	/** The customer service. */
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context/applicationContext.xml");

		applicationContext.getBean(Main.class).mainInternal(applicationContext);

	}

	public void mainInternal(ApplicationContext applicationContext) {

		Customer customer = new CustomerBuilder().withFirstName("Jackob").withLastName("Jetis").build();
		customerService.saveCustomer(customer);
		Customer savedCustomer = customerService.findCustomerByName("Jackob");
		System.out.println("Customer name :" + savedCustomer.getFirstName());
		customer = new CustomerBuilder().withFirstName("Elene").withLastName("Petete").build();
		customerService.saveCustomer(customer);
		List<Customer> customerList = customerService.findAllCustomers();
		// List of all customers
		System.out.println("List of all customers");
		for (Customer cust : customerList) {
			System.out.println("Name :" + cust.getFirstName());
		}

	}
}