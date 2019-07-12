package com.mortagage.mortagage.repository;

import org.springframework.stereotype.Repository;

import com.mortagage.mortagage.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RegistrationRepository extends JpaRepository<User,Integer>{

}
