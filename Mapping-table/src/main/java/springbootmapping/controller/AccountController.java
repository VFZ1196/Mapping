package springbootmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springbootmapping.model.Account;
import springbootmapping.repository.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository repo;
	@GetMapping("/account")
	public List<Account> getAll(){
		return repo.findByOrderByIdDesc();
	}
	
	@PostMapping("/account")
	public Account add(@RequestBody Account account) {
		return repo.save(account);
	}
	@DeleteMapping("/account/{id}")
	public void deleteOneRecord(@PathVariable long id) {
		repo.deleteById(id);
	
	}
}
