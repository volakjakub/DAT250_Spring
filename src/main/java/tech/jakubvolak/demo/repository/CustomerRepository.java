package tech.jakubvolak.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tech.jakubvolak.demo.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
