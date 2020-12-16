package com.jeyun.test.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public class UserDetailsVo implements UserDetails {
	
	  private String ID;
	    private String PASSWORD;
	    private String AUTHORITY;
	    private boolean ENABLED;
	    private String NAME;
	    
	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
	        auth.add(new SimpleGrantedAuthority(AUTHORITY));
	        return auth;
	    }
	 
	    @Override
	    public String getPassword() {
	        return PASSWORD;
	    }
	 
	    @Override
	    public String getUsername() {
	        return ID;
	    }
	 
	    @Override
	    public boolean isAccountNonExpired() {
	       // 계정이 만료되지 않았는 지 리턴한다
	    	return true;
	    }
	 
	    @Override
	    public boolean isAccountNonLocked() {
	    	 // 계정이 잠겨있지 않았는지 리턴한다 
	    	return true;
	    }
	 
	    @Override
	    public boolean isCredentialsNonExpired() {
	       //비밀번호가 만료되지 않았는지 리턴한다
	    	return true;
	    }
	 
	    @Override
	    public boolean isEnabled() {
	        //계정이 활성화(사용가능)인지 리턴한다
	    	return ENABLED;
	    }
	    
	    public String getNAME() {
	        return NAME;
	    }
	 
	    public void setNAME(String name) {
	        NAME = name;
	    }
	
}
