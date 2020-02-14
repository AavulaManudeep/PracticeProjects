package com.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.demo.model.JWTAuthenticationToken;
import com.demo.model.JWTUser;
import com.demo.model.JWTUserDetails;
;


@Component
public class JWTAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider{

	@Autowired
	private JWTValidator jwtvalidator;

	
	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return JWTAuthenticationToken.class.isAssignableFrom(authentication); 
	}

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authenticationToken)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		JWTAuthenticationToken jwtAuthenticationToken = (JWTAuthenticationToken)authenticationToken;
		
		String token = jwtAuthenticationToken.getToken();
		JWTUser jwtUser= jwtvalidator.validate(token);
		
		if(jwtUser==null)
		{
			throw new RuntimeException("JWT Token Not Valide");
		}
		
		java.util.List<GrantedAuthority> grantedAuthorities= AuthorityUtils.commaSeparatedStringToAuthorityList(jwtUser.getRole());
		
		 return new JWTUserDetails(jwtUser.getUsername(),jwtUser.getId(),token,grantedAuthorities);
	}

}
