package com.springbootrest.org;

import com.springbootrest.org.entities.Users;
import com.springbootrest.org.repositories.UsersRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootrestApplication implements CommandLineRunner {

    @Autowired
    private UsersRepositories usersRepositories;

    public static void main(String[] args) {

        SpringApplication.run(SpringbootrestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Users users = new Users();
        users.setFname("Mehadi");
        users.setLname("Hasan");
        users.setPassword("123123");
        users.setCustomId("wheal");

        System.out.println(usersRepositories.save(users));

        users = new Users();
        users.setPassword("21254");
        users.setLname("Baba");
        users.setFname("Dorbes");
        users.setCustomId("seal");
        System.out.println(usersRepositories.save(users));
    }
}
