package com.kodilla;

import com.kodilla.records.Book;
import com.kodilla.records.BookRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaCourseApplication.class, args);

		BookRecord book = new BookRecord("John Novak", "Algorithms and other nightmares", 2018);
		int year = book.year();
		System.out.println(year);
		System.out.println(book);

		Calk calk = new Calk();

		System.out.println("Transformed string: "+calk.TransformStrToInt("2"));

	}

}
