package com.chinaxlt.springboot.Book;

import com.chinaxlt.springboot.Base.BaseController;
import com.chinaxlt.springboot.Service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping("/shop")
public class BookController extends BaseController {

    @Resource
    private BookService bookService;

    @GetMapping("/index")
    public ModelAndView ShowIndex() {
        return new ModelAndView("index");
    }
}
