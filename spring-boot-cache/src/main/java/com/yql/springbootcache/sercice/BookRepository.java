package com.yql.springbootcache.sercice;

import com.yql.springbootcache.po.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
