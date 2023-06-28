package com.lsgf.mapper;


import com.lsgf.pojo.Ct4Word;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Ct4Mapper {
    List<Ct4Word> queryCt4WordList();
}
