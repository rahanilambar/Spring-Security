/**
 * @Author Nilambar Raha
 */

package com.antech.springsecurity.security;

import com.antech.springsecurity.repository.UserMasterRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author nilambar
 */

@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    UserMasterRepository userMasterRepository;
        
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        
        Optional<List> user = userMasterRepository.findLoginDetails(string);
//        System.out.println(user.get().getAccountLockedList().get(0).getIsLocked());
        user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        Object[] obj = (Object[]) user.get().get(0);
//        System.out.println(obj[0].toString());
//        System.out.println(obj[1].toString());
//        System.out.println(obj[2].toString());
//        System.out.println(obj[3].toString());
        return new MyUserDetails((Object[]) user.get().get(0));
        
    }
    
}
