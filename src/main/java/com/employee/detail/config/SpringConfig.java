package com.employee.detail.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception
	{
		auth.inMemoryAuthentication().withUser("sanjeeth").password("password").roles("USER");
		
	}
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        //http
	                //HTTP Basic authentication
	                //.httpBasic()
	                //.and()
	               // .authorizeRequests()
	               // .antMatchers(HttpMethod.GET, "/getallempvalues").hasRole("USER")
	               // .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
	               // .antMatchers(HttpMethod.PUT, "/books/**").hasRole("ADMIN")
	             //   .antMatchers(HttpMethod.PATCH, "/books/**").hasRole("ADMIN")
	               // .antMatchers(HttpMethod.DELETE, "/books/**").hasRole("ADMIN")
	              //  .and()
	              //  .csrf().disable()
	              //  .formLogin().disable();
	        
		/*
		 * http .authorizeRequests() .antMatchers("/getallempvalues").permitAll()
		 * .antMatchers("/insertEmpDetails").permitAll() .anyRequest().authenticated()
		 * .and() .formLogin() .loginPage("/insertempdetails") .permitAll() .and()
		 * .logout() .permitAll();
		 */
	    }
}
