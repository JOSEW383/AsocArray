package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import asocArray.AsocArray;

public class asocArrayTest {
	private AsocArray array;
	
	@Before
	public void before(){
		array = new AsocArray();
		
	}
	
	@After
	public void after(){
		
		
	}

	@Test
	public void creacionDelArray() {
		assertEquals(0, array.size());
	}
	
	@Test
	public void anadoValoresYClaves(){
		array.put("nombre","luis");
		array.put("apellidos","martin");
		assertEquals("luis", array.get("nombre"));
		assertEquals(2,array.size());
	}

}
