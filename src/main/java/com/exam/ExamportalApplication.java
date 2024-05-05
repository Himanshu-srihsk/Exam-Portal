package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {
    @Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("starting code");
//		
//		User user = new User();
//		user.setFirstName("Himanshu");
//		user.setLastName("kumar");
//		user.setUsername("hukr0032");
//		user.setPassword("abc");
//		user.setEmail("abc@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role = new Role();
//		role.setRoleId(44L);
//		role.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleset = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoleset.add(userRole);
//		
//	User createdUser=this.userService.createUser(user, userRoleset);
//	System.out.println(createdUser.getUsername());
		
	}

}
