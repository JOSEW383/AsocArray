package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import asocArray.AsocArray;
import asocArray.UndefinedKeyException;

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

	@Test(expected = UndefinedKeyException.class)
	public void elevoExcepcionClaveNoEncontrada(){
		array.get("nombre");
	}
	
	@Test
	public void devuelveValorPorDefecto(){
		array.put("nombre","luis");
		assertEquals("luis", array.getOrElse("nombre","nulo"));
		assertEquals("nulo", array.getOrElse("apellidos","nulo"));
		
	}
	
	@Test
	public void keyExiste(){
		array.put("nombre","luis");
		assertEquals(true, array.containsKey("nombre"));
	}
	
	@Test
	public void keyNoExiste(){
		assertEquals(false, array.containsKey("nombre"));
	}
	
	@Test
	public void eliminacionDePares(){
		array.put("nombre","luis");
		assertEquals(true,array.remove("nombre"));
		assertEquals(false,array.remove("nombre"));
	}
	
}
