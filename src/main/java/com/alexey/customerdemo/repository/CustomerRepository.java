package com.alexey.customerdemo.repository;

import com.alexey.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository interface for customer {@link Customer} class.
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
