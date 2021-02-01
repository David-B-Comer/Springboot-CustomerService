package com.davec.customerservice.repository;

import com.davec.customerservice.domain.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Page<Account> findByCustomerCustomerId(Integer customerId, Pageable pageable);
}