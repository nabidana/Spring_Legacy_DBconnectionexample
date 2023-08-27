package com.example.demo.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.TestVO;

@Repository
public class TestRepositoryImpl implements TestRepository{
    @Inject
    private SqlSession sql;

    private static String namespace = "com.example.demo.mappers.Mapper";

    @Override
    public List<TestVO> getlist() {
        return sql.selectList(namespace+".alllist");
    }
    
}
