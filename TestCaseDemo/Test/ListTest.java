
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListTest {
    static ListClass lc=new ListClass();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		lc.add("abc");
		lc.add("def");
		lc.add("ghi");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
		assertEquals("Size of list is 3",3,lc.size());
	}
	
	@Test
	public void testadd() {
		lc.add("jkl");
		assertEquals("Size after adding new element",3,lc.size());
	}
	@Test
	public void testremove() {
		lc.remove("ghi");
		assertEquals("afterRemove size 3",2,lc.size());
	}

}
