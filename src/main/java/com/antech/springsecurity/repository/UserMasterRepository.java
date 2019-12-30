/**
 * @Author Nilambar Raha
 */

package com.antech.springsecurity.repository;

import com.antech.springsecurity.models.UserMaster;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, Integer> {
    Optional<UserMaster> findByUserName(String userName);
    
    @Query(value="SELECT um.user_name, um.password, al.is_locked, ur.user_role FROM user_master um JOIN account_locked al ON um.user_id=al.user_id JOIN user_role_map urm ON urm.user_id=um.user_id JOIN user_roles ur ON urm.user_role_id=ur.user_role_id where um.user_name=?1", nativeQuery = true)
    Optional<List> findLoginDetails(String userName); 
}
