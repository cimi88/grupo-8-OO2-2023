package com.unla.grupo8.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.unla.grupo8.services.implementations.UserService;

<<<<<<< HEAD
=======
<<<<<<< HEAD
import com.unla.grupo8.services.UserService;
=======
import com.unla.grupo8.services.implementations.UserService;
>>>>>>> rama_salgueiro
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration{

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
	}


<<<<<<< HEAD
=======
	@SuppressWarnings("removal")
>>>>>>> rama_salgueiro
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
				.requestMatchers("/css/*", "/image/*", "/js/*", "/vendor/bootstrap/css/*",
						"/vendor/jquery/*", "/vendor/bootstrap/js/*").permitAll()
				.anyRequest().authenticated()
			.and()
				.formLogin().loginPage("/login").loginProcessingUrl("/loginprocess")
				.usernameParameter("username").passwordParameter("password")
				.defaultSuccessUrl("/loginsuccess").permitAll()
			.and()
				.logout().logoutUrl("/logout").logoutSuccessUrl("/logout").permitAll();
		return http.build();
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD

	/* No usado en este ejemplo
	@Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/images/**", "/js/**", "/webjars/**");
    }*/
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
}
=======
}
 
>>>>>>> rama_salgueiro
