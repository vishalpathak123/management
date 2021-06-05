package com.library.management.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.model.Book;
import com.library.management.model.BookHistory;
import com.library.management.model.BorrowHistory;

@RestController
public class BorrowHistoryController {

	@RequestMapping(value = "/myBorrowedHistory", method = RequestMethod.GET, 
			  headers = "Accept=application/json")
	public ResponseEntity<Object> myBorrowedHistory(@RequestParam(name = "id", required = true) int id,
			@RequestParam int year) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(BorrowHistory.class).addAnnotatedClass(Book.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String hqlQuery = "SELECT b.uuId, b.title, h.borrowedDate FROM Book b INNER JOIN BorrowHistory h ON b.uuId=h.uuId Where h.memberId=? and year(h.borrowedDate)=?";
		Query<Object[]> query1 = session.createQuery(hqlQuery, Object[].class).setParameter(0, id).setParameter(1,
				year);
		List<Object[]> list1 = query1.getResultList();
		System.out.println("Size of resultList :" + list1.size());
		List<BookHistory> bookList = new ArrayList<BookHistory>();
		for (Object[] object : list1) {
			System.out.println(" Book ID : " + object[0] + " Title : " + object[1] + " Borrowed Date " + object[2]);
			BookHistory bh = new BookHistory((int) object[0], (String) object[1], (Date) object[2]);
			bookList.add(bh);

		}
		if (bookList.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(bookList);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body("You haven't borrowed any Book yet.");

		}
	}

}
