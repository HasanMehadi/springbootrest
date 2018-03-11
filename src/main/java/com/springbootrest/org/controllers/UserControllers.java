package com.springbootrest.org.controllers;

import com.springbootrest.org.entities.Users;
import com.springbootrest.org.repositories.UsersRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class UserControllers {

    @Autowired
    private UsersRepositories usersRepositories;

    @GetMapping(value = "/users")
    public List<Users> getAllUsers(){
        return usersRepositories.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public Optional<Users> getUserById(@PathVariable Long id){
        return usersRepositories.findById(id);
    }

    @DeleteMapping(value = "/user/{id}")
    public Boolean deleteUser(@PathVariable Long id){
         usersRepositories.deleteById(id);
         return true;
    }

    @PostMapping(value = "/users")
    public Users createUsers(@RequestBody Users user){
        return usersRepositories.save(user);
    }

    @PutMapping(value = "/users")
    public Users updateUsers(@RequestBody Users user){
        return usersRepositories.save(user);
    }

}
