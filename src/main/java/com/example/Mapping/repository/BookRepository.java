package com.example.Mapping.repository;

import com.example.Mapping.model.Book;
import com.example.Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {


    List<Book> findAllBookByStudent(Student student);

}
