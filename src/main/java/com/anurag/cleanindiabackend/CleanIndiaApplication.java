package com.anurag.cleanindiabackend;

import com.anurag.cleanindiabackend.models.Role;
import com.anurag.cleanindiabackend.repositories.RoleRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CleanIndiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanIndiaApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer(RoleRepository roleRepository) {
        return args -> roleRepository.saveAll(Arrays.asList(
                Role.builder().roleName("NORMAL_USER").roleDescription("User who will upload the location").build(),
                Role.builder().roleName("DRIVER_USER").roleDescription("User who will pickup the garbage from location").build()));
    }
}
