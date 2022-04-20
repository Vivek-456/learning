package com.learning.AdvanceProject.repositories;

import com.learning.AdvanceProject.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, String> {
}
