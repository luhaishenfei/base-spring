package com.lsgf;

import com.lsgf.pojo.Dog;
import com.lsgf.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudy2configApplicationTests {
    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Test
    void contextLoads() {

        System.out.println(dog);
        System.out.println(person);
    }

}
