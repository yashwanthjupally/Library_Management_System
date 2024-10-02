package com.example.Library.Management.System.Repository;

import com.example.Library.Management.System.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
