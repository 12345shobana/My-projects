package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rst1controller {
@GetMapping("/students")
public List<restController> getrestController()
{
List<restController> students=new ArrayList<>();
students.add(new restController("praveen","raj"));
students.add(new restController("sowmya","kannan"));
students.add(new restController("shobana","priya"));
students.add(new restController("partha","sarathy"));
students.add(new restController("barath","r"));
students.add(new restController("dinesh","kumar"));
students.add(new restController("Guna","varma"));
return students;
}
}
