package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class employee1 {
@GetMapping("/employee1")
public List<employee> getrestController()
{
List<employee>employee1=new ArrayList<>();
employee1.add(new employee(1,"Anitha","Coimbatore"));
employee1.add(new employee(2,"Kavitha","Kerala"));
employee1.add(new employee(3,"Chithra","Chennai"));
employee1.add(new employee(4,"Priya","Trichy"));
employee1.add(new employee(5,"Meena","Erode"));
return employee1;
}

}
