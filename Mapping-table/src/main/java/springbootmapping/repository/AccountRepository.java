package springbootmapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootmapping.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

         	List<Account> findByOrderByIdDesc();


}
