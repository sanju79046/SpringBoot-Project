package com.example.Project.repository;

import com.example.Project.model.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Integer> {
}