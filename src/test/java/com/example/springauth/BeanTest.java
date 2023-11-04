package com.example.springauth;

import com.example.springauth.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    Food pizza;

    @Autowired
    Food chicken;
}