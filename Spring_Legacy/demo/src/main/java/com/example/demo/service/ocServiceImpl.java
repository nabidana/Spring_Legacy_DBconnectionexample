package com.example.demo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.demo.domain.ocVO;
import com.example.demo.repository.ocRepository;

@Service
public class ocServiceImpl implements ocService{
    @Inject
    private ocRepository ocRepository;

    @Override
    public List<ocVO> getlist() throws Exception {
        return ocRepository.getlist();
    }


}
