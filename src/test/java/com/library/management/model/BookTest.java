package com.library.management.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BookTest {

	@Test
	void test() {
		Book book=new Book(0, null, null, null, 0);
		Assert.assertNotNull(book.toString());
	}

}
