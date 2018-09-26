package com.example.springdatajpa.service;

import com.example.springdatajpa.dao.InformationRepository;
import com.example.springdatajpa.entity.Information;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HP on 2018/9/20.
 */
@Service
public class InformationServiceImpl implements InformationService {
    @Resource
    private InformationRepository informationRepository;
    @Override
    public List<Information> getAll() {
        return informationRepository.findAll();
    }

    @Override
    public Information get(int id) {
        return informationRepository.findById(id).get();
    }
}
