package restfulvoimysql.com.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restfulvoimysql.com.restful.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
