package com.example.demo.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ocVO;

@Repository
public class ocRepositoryImpl implements ocRepository{
    @Inject
    private SqlSession sql;

    private static String namespace = "com.example.demo.mappers.ocMapper";

    @Override
    public List<ocVO> getlist() {
        return sql.selectList(namespace+".alllistoc");
    }
    
}
