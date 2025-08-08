package org.example.springdeployment.repository;

import org.example.springdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    @Modifying
//    @Query("update Customer c set c.name = ?1, c.email = ?2 where c.id = ?3")
//    void update(String name, String email, Long id);
}
