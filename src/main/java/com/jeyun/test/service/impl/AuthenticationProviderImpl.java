package com.jeyun.test.service.impl;

import javax.annotation.Resource;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.jeyun.test.vo.UserDetailsVo;

public class AuthenticationProviderImpl implements AuthenticationProvider {
	
	@Resource(name="UserDetailsServiceImpl")
    private UserDetailsServiceImpl userDetail;
 
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    	
    	//사용자가 화면에서 입력한 정보가져오기
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        //디비 정보가져오기
        UserDetailsVo user = (UserDetailsVo) userDetail.loadUserByUsername(username);
        
        if(!matchPassword(password, user.getPassword())) {
            //화면에서 입력한 비밀번호와 디비비밀번호 비교
        	throw new BadCredentialsException(username);
        }

        if(!user.isEnabled()) {
           //활성화 체크
        	throw new BadCredentialsException(username);
        }
        //인증되면 입력된정보와 디비에서 가져온 권한을 담아서 아이디랑 비밀번호랑 함꼐 리턴
        return new UsernamePasswordAuthenticationToken(user, user, user.getAuthorities());
    }
 
    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
    
    private boolean matchPassword(String loginPwd, String password) {
        return loginPwd.equals(password);
    }
    
}
