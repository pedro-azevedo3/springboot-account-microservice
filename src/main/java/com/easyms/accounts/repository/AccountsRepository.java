package com.easyms.accounts.repository;

import com.easyms.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository <Customer, Long> {
}
