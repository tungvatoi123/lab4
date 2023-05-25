package com.example.lab3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab3.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
