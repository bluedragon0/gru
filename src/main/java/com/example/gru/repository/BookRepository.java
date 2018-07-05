package com.example.gru.repository;

import com.example.gru.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {


}
