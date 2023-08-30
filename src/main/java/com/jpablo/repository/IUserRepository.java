package com.jpablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpablo.model.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
