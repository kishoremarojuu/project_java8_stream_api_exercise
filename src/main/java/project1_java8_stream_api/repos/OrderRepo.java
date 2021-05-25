package project1_java8_stream_api.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project1_java8_stream_api.models.Order;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {

	List<Order> findAll();
}
