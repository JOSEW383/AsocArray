package test;

import static org.junit.Assert.*;

import org.junit.Test;

import asocArray.AsocArray;

public class asocArrayTest {

	@Test
	public void creacionDelArray() {
		AsocArray array = new AsocArray();
		assertEquals(0, array.size());
	}
	
	@Test
	public void anadoValoresYClaves(){
		AsocArray array = new AsocArray();
		array.put("nombre","luis");
		array.put("apellidos","martin");
		assertEquals("luis", array.get("nombre"));
		assertEquals(2,array.size());
	}

}
