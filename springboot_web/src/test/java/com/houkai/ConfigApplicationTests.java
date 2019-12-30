package com.houkai;

import com.houkai.entity.My;
import com.houkai.entity.Person1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigApplicationTests {

    @Autowired
    Person1 person;
    @Test
    void contextLoads1() {
        System.out.println(person);
    }
    @Autowired
    My my;
    @Test
    void contextLoads2() {
        System.out.println(my);
    }

}
