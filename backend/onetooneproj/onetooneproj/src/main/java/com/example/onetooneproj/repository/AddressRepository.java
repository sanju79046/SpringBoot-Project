package com.example.onetooneproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetooneproj.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}