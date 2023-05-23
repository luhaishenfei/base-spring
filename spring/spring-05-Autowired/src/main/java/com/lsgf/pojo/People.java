package com.lsgf.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {
    //@Autowired 可直接在属性上使用(且可以省略掉set方法，因为是反射实现） 或 在set方法上使用
//    @Autowired(required = false);如果显示定义了AutoWired的required属性为false,说明这个对象可以为null，否则不允许为空  默认为true
//    @Nullable
    @Autowired
    //显示的指定一个beanid
    @Qualifier(value = "cat")
    private Cat cat;
//    @Resource(name = "cat")
    @Resource
    private Dog dog;
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

//    byname自动装配 查找 cat
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    //    byname自动装配 测试
//    public void setCatTest(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
