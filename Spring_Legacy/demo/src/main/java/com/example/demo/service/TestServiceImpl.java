package com.example.demo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.demo.domain.TestVO;
import com.example.demo.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService{
    @Inject
    private TestRepository testRepository;

    @Override
    public List<TestVO> getlist() throws Exception {
        return testRepository.getlist();
    }
    
}
