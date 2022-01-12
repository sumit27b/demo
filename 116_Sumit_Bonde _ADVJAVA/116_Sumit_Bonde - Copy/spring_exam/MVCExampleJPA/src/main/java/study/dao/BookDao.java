package study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.entity.BookEntity;
import study.repository.BookRepository;

@Service
public class BookDao {


	@Autowired
	BookRepository repo;
	
	public void addBook(BookEntity book)
	{
		repo.save(book);
	
	}
	
	public List<BookEntity> getAllBooks()
	{
		return repo.findAll();
	}
	
	public void deleteById(int id)
	{
		repo.deleteById(id);
	}
	
}
