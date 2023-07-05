package com.example.demoProject.repository;

import com.example.demoProject.model.TestModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    TestModel getTestModel(int id);

    List<TestModel> getTestModelList();

    int createTestModel(TestModel testModel);

    int updateTestModel(TestModel testModel);

    int deleteTestModel(int id);
}
