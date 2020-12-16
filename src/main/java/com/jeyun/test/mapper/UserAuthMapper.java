package com.jeyun.test.mapper;

import com.jeyun.test.vo.UserDetailsVo;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("UserAuthMapper")
public interface UserAuthMapper {
	
	public UserDetailsVo user (String username);
	
}
