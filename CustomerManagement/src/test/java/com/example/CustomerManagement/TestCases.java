package com.example.CustomerManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.CustomerManagement.model.CommunicationAddress;
import com.example.CustomerManagement.model.Customers;
import com.example.CustomerManagement.model.PermanentAddress;
import com.example.CustomerManagement.service.CustomerService;

@SpringBootTest
public class TestCases {
	
	@Autowired
    private CustomerService customerService;
    @Test
    public void testCreateCustomer() {
    	
    	PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");

    	CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");
    	
        Customers customerToAdd = new Customers(10, "A", "B","c","F",55, "B.Tech",p,c,"notes");


        Customers addedCustomer = customerService.createCustomer(customerToAdd);
        assertNotNull(addedCustomer.getCid());
        assertEquals(customerToAdd.getFirstname(), addedCustomer.getFirstname());
    }
    
    @Test
    public void testSearchCustomer() {
    	

    	PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");

    	CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");

        Customers customerToAdd = new Customers(10, "A", "B","c","F",55, "B.Tech",p,c,"notes");
                
        Customers addedCustomer = customerService.createCustomer(customerToAdd);

        Customers customers = customerService.searchCustomer(customerToAdd.getCid());

        assertNotNull(addedCustomer.getCid());
        assertEquals(10,customers.getCid());


        // another condition
      String firstCustomer = customers.getFirstname();
      assertEquals("A", firstCustomer);
    }
    @Test
    public void testUpdateCustomer() {
        // Given
    	
    	PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");

    	CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");
        Customers customerToAdd = new Customers(10, "A", "B","c","F",55, "B.Tech",p,c,"notes");
        // When
        Customers addedCustomer = customerService.createCustomer(customerToAdd);
        assertNotNull(addedCustomer.getCid());
        // Modify some attributes of the customer
        addedCustomer.setFirstname("UpdatedName");
        addedCustomer.setAge(50);
        // Update the customer
        Customers updatedCustomer = customerService.updateCustomer(addedCustomer.getCid(), addedCustomer);

        // Then
        assertNotNull(updatedCustomer.getCid());
        assertEquals("UpdatedName", updatedCustomer.getFirstname());
        assertEquals(50, updatedCustomer.getAge());
    }

    @Test
    public void testDeleteCustomer() {
        // Given
    	PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");

    	CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");
    	
        Customers customerToAdd = new Customers(10, "A", "B","C","F",55, "B.Tech",p,c,"notes");

        Customers addedCustomer = customerService.createCustomer(customerToAdd);
        // When
        boolean isDeleted = customerService.deleteCustomer(addedCustomer.getCid());
        // Then
        assertTrue(isDeleted);      
    }

}
