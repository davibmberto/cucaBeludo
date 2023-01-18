package com.peepeepoopoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peepeepoopoo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
