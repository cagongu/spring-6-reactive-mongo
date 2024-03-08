package guru.springframework.spring6reactivemongo.repositories;

import guru.springframework.spring6reactivemongo.domain.Beer;
import guru.springframework.spring6reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
