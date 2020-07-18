package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

//implements FeignHttpClientProperties
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public String index() {
        return "服务维护中。。。。。";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
