package com.library.repository;

import com.library.model.Book;  // ✅ Make sure it points to model, not entity
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
