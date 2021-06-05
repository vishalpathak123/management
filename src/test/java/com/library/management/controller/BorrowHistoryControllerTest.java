package com.library.management.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BorrowHistoryControllerTest {

	@Test
	void test() {
		BorrowHistoryController bh=new BorrowHistoryController();
		Assert.assertNotNull(bh.myBorrowedHistory(100, 2021));
	}

}
