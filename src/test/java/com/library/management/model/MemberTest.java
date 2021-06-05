package com.library.management.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MemberTest {

	@Test
	void test() {
		Member member = new Member(null, null, null, null);
		Assert.assertNull(member.getEmail());
		Assert.assertNull(member.getMemberId());
		Assert.assertNull(member.getMemberName());
		Assert.assertNull(member.getRole());
		Assert.assertNotNull(member.toString());

	}

}
