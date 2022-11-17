package com.gjx.service.Impl;

import com.gjx.controller.Code;
import com.gjx.dao.BookDao;
import com.gjx.domain.Book;
import com.gjx.exception.BusinessException;
import com.gjx.exception.SystemException;
import com.gjx.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
       return bookDao.save(book)>0;


    }

    @Override
    public boolean update(Book book) {
       return bookDao.update(book)>0;

    }

    @Override
    public boolean delete(Integer id) {
       return bookDao.delete(id)>0;

    }

    @Override
    public Book getById(Integer id) {
        //异常处理
       /* if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "傻逼中的沙扎比");
        }
        try {
            int i=1/0;
        } catch (Exception e) {
            throw new SystemException(999, "服务器错误",e);
        }*/


        return bookDao.geyById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
