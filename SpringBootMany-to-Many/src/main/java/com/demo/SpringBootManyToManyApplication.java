package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.demo.pojo.Book;
import com.demo.pojo.Publisher;
import com.demo.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan("com.demo*")
@Slf4j
public class SpringBootManyToManyApplication implements CommandLineRunner{
	
	
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootManyToManyApplication.class, args);
	}
	
	@Override
	public void run(String...args)
	{
		bookRepository.save(new Book("book1",new Publisher("publisher A"),new Publisher("Publisher B")));
	}

}
