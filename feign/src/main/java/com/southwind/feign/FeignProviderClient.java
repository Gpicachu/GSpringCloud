package com.southwind.feign;


import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @RequestMapping("/student/index")
    public String index();

    @RequestMapping("/student/findAll")
    public Collection<Student> findAll();

    @RequestMapping("/student/findById/{id}")
    public Student findById(@PathVariable("id") long id);

    @RequestMapping("/student/save")
    public void save(@RequestBody Student student);

    @RequestMapping("/student/update")
    public void update(@RequestBody Student student);

    @RequestMapping("/student/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}