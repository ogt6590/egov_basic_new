package com.jeyun.test.service.impl;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jeyun.test.mapper.UserAuthMapper;
import com.jeyun.test.vo.UserDetailsVo;

public class UserDetailsServiceImpl implements UserDetailsService {

		@Resource(name="UserAuthMapper")
	    private UserAuthMapper userAuthmapper;
	 
	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        UserDetailsVo user = userAuthmapper.user(username);
	        if(user==null) {
	            throw new UsernameNotFoundException(username);
	        }
	        return user;
	    }
	
}

