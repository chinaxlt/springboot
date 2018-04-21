package com.chinaxlt.springboot.Mapper;

import com.chinaxlt.springboot.Pojo.Book;
import org.springframework.stereotype.Component;

@Component
public interface BookMapper {

    Book getBookByPK(Integer id);

}
