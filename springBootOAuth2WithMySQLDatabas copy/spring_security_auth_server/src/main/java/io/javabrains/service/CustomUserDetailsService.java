package io.javabrains.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.javabrains.model.CustomUserDetails;
import io.javabrains.model.Users;
import io.javabrains.repository.UsersRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Users> usersOptional=usersRepository.findByName(username);
		
		usersOptional.orElseThrow(()->new UsernameNotFoundException("Username not found"));
		return usersOptional.map(users->new CustomUserDetails(users)).get();
	}

}
