
package com.antech.springsecurity.repository;

import com.antech.springsecurity.models.AccountLocked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountLockedRepository extends JpaRepository<AccountLocked, Integer>{
}
