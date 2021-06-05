package com.library.management.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BorrowHistoryTest {

	@Test
	void test() {
		BorrowHistory bh = new BorrowHistory(0, 0, 0, null, null, null, null, 0);
		Assert.assertNotNull(bh.toString());
	}

}
