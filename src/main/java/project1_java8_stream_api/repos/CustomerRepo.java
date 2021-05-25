package project1_java8_stream_api.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project1_java8_stream_api.models.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

	List<Customer> findAll();
}
