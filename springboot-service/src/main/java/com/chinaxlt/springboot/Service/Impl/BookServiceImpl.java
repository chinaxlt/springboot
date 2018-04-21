package com.chinaxlt.springboot.Service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chinaxlt.springboot.Mapper.BookMapper;
import com.chinaxlt.springboot.Pojo.Book;
import com.chinaxlt.springboot.Service.BookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Resource
    private BookMapper bookMapper;

    @Override
    public Book getBookById(Book book) {
        Integer id = book.getId();
        if (id == null) {
            logger.error("Book id is null");
            return null;
        }
        return bookMapper.getBookByPK(id);
    }
}
