package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
