
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJUnit {
	
	String marca = "Seat";
	String color = "Blanco";
	int anio = 2019;
	int precio = 10000;
	
	Coche coche = new Coche(marca,color,anio,precio);
	Coche coche2 = new Coche(marca,color,anio,precio);
	
	@Test		//ASSERT EQUALS
	public void test1() {
		
		assertEquals(coche.toString(), coche2.toString());
		System.out.println("Test1: Test de assertEquals: ---> OK");
	}
	
	@Test		//ASSERT TRUE
	public void test2() {
		
		assertTrue(coche.esSeat(marca));
		System.out.println("Test2: Test de assertTrue: ---> OK");
	}
	@Test		//ASSERT FALSE
	public void test3() {
		
		String marca2 = "Audi";
		assertFalse(coche.esSeat(marca2));
		System.out.println("Test3: Test de assertFalse: ---> OK");
	}
	
	@Test		//ASSERT NOT NULL
	public void test4() {
		
		assertNotNull(coche);
		System.out.println("Test4: Test de assertNotNull: ---> OK");
	}
	
	@Test		//ASSERT NULL
	public void test5() {
		
		assertNull(coche);
		System.out.println("Test5: Test de assertNull: ---> OK");
	}
	
	@Test		//ASSERT SAME
	public void test6() {
		
		assertSame(coche, coche2);
		System.out.println("Test6: Test de assertSame: ---> OK");
	}
	
	@Test	@Ignore	//ASSERT NOT SAME Y ANOTACION IGNORE
	public void test7() {
		
		assertNotSame(coche, coche2);
		System.out.println("Test7: Test de assertNotSame: ---> OK");
	}
	
	@Test		//ASSERT ARRAY EQUALS
	public void test8() {
		
		Coche [] coches = new Coche [] {coche};
		Coche [] coches2 = new Coche [] {coche2};
		
		assertArrayEquals(coches, coches2);
		System.out.println("Test8: Test de assertArrayEquals: ---> OK");
	}
	
	@Before		//BEFORE	
	public  void before(){
		System.out.println("ANOTACION BEFORE");
	}
	
	@After		//AFTER
	public  void after(){
		System.out.println("ANOTACION AFTER");
	}
	
	
	@BeforeClass		//BEFORE CLASS
	public static void beforeClass(){
		System.out.println("ANOTACION BEFORE CLASS");
	}
	
	@AfterClass		//AFTER CLASS
	public static void afterClass(){
		System.out.println("ANOTACION AFTER CLASS");
	}


}
