package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.dao.BookDao;
import study.entity.BookEntity;

@Controller
public class BookController {

	@Autowired
	BookDao dao;
	
	
	@GetMapping("/index")
	public String fun1()
	{
		return "index";
	}
	
	@GetMapping("/addbook")
	public String f2()
	{
		return "addbook";
	}
	
	@PostMapping("/addbooktbl")
	public String addBook( @RequestParam int cost, @RequestParam String name)
	{
		BookEntity book = new BookEntity();
		book.setCost(cost);
		book.setName(name);
		dao.addBook(book);
		return "index";
	}
	
	@GetMapping("/getNames")
	public ModelAndView showAllBooks()
	{
		ModelAndView mav = new ModelAndView();
		List<BookEntity> list = dao.getAllBooks();
		
			mav.addObject("showall", list);  
			mav.setViewName("showbooks");  
			return mav;
		}
	
	@GetMapping("/deletebook")
	public ModelAndView deleteBook()
	{
		ModelAndView mav = new ModelAndView();
		List<BookEntity> list = dao.getAllBooks();
		
		mav.addObject("deletebook", list);  
		mav.setViewName("showbooks");  
		return mav;
	}
	
	
	@PostMapping("/deletebook1")
	public String deleteBook(@RequestParam int id)
	{
		dao.deleteById(id);
		return "index";
	}
	
	
}
