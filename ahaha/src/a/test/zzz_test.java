package a.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import a.zzz;

class zzz_test {

	@Test
	void test() {
		System.out.println(zzz.aaa(1, 2));
		System.out.println("D");
		assertEquals(3, zzz.aaa(1, 2));
		assertEquals(5, zzz.aaa(2, 3));
		assertEquals(6, zzz.aaa(3, 3));
		assertEquals(8, zzz.aaa(4, 4));
		assertEquals(10, zzz.aaa(5, 5));
		assertEquals(12, zzz.aaa(6, 6));
		assertEquals(14, zzz.aaa(7, 7));
	}

}
