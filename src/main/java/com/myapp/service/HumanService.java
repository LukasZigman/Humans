package com.myapp.service;

import com.myapp.domain.Human;
import com.myapp.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {

    private HumanRepository humanRepository;

    @Autowired
    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public List<Human> findAll() {
        return humanRepository.findAll();
    }

    public boolean checkIfSiblings(Human human1, Human human2) {

        return false;
    }

}
