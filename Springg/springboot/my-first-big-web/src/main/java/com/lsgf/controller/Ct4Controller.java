package com.lsgf.controller;


import com.lsgf.mapper.Ct4Mapper;
import com.lsgf.pojo.Ct4Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ct4Controller {

    @Autowired
    private Ct4Mapper ct4Mapper;

    @GetMapping("queryCt4WordList")
    public List<Ct4Word> queryCt4WordList(){
        List<Ct4Word> ct4WordList=ct4Mapper.queryCt4WordList();
        return ct4WordList;
    }


}
