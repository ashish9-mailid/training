package com.training.service;



import com.training.entity.MyUserDetails;
import com.training.entity.User;
import com.training.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       System.out.println("Username:"+username);
    	User user = repository.findByUsername(username);
    	
    	System.out.println(user.getUsername()+" "+user.getPassword());
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
        
    	//User user=new User(1, "user1", "user1", "user1@gmail.com");
    	//return new MyUserDetails(user);		
        		
    }
    
    
}
