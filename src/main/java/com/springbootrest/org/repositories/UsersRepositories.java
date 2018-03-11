package com.springbootrest.org.repositories;

import com.springbootrest.org.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepositories extends JpaRepository<Users,Long> {
}
