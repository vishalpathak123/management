package com.library.management.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BookHistoryTest {

	@Test
	void test() {
		BookHistory bh=new BookHistory(0, null, null);
		Assert.assertNotNull(bh.toString());
		
	}

}
