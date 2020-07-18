package com.southwind.controller;

import java.util.Collection;

import com.southwind.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southwind.entity.Student;

@RestController //在Spring中@RestController的作用等同于@Controller + @ResponseBody。
@RequestMapping("/student")
public class StudentHandler {

      @Autowired
      private FeignProviderClient feignProviderClient;

      @Value("${server.port}")
      private String port;

      @GetMapping("/findAll")
      public Collection<Student> findAll(){
          return feignProviderClient.findAll();
      }
      @GetMapping("/findById/{id}")
      public Student findById(@PathVariable("id") long id) {
          return feignProviderClient.findById(id);
      }
      @DeleteMapping("/deleteById/{id}")
      public void deleteById(@PathVariable("id") long id) {
          feignProviderClient.deleteById(id);
      }
      @GetMapping("/index")
      public String index() {
          return "当前端口：" + this.port;
      }
}
