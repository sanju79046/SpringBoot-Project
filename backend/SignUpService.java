package com.example.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.model.SignUp;
import com.example.Project.repository.SignUpRepo;

@Service
public class SignUpService {
    @Autowired
    SignUpRepo repo;

    public SignUp create(SignUp j) {
        return repo.save(j);
        // return true;
    }

    public SignUp find(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<SignUp> findA() {
        return repo.findAll();
    }

    public SignUp update(int id, SignUp j) {
        SignUp p1 = repo.findById(id).orElse(null);
        if (p1 != null) {
            p1.setName(j.getName());
            repo.save(p1);
            return p1;
        } else {
            return j;
        }
    }

    public void delete(int id) {
        repo.deleteById(id);

    }

}