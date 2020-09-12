import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test case");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After class");
	}

	@Test
	public void testMax() {
		 assertEquals(4,Calculation.max(new int[]{1,3,4,2}));
	
		 assertEquals(-2,Calculation.max(new int[] {-2,-4,-5}));
	}
	@Test
	public void testCube() {
		assertEquals(8,Calculation.cube(2));
		
	}
	@Test
	public void reverse() {
		assertEquals("ym",Calculation.reverse("my"));
	}
	@Test
	public void dublicate() {
		assertEquals("j",Calculation.dublicate("jajv"));
	}

}
