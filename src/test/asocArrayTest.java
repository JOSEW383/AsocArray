package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import asocArray.AsocArray;
import asocArray.UndefinedKeyException;

public class asocArrayTest {
	private AsocArray array;
	private static final String KEY1="Nombre",VALUE1="Luis",KEY2="Apellidos",VALUE2="Martin";
	
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
		array.put(KEY1,VALUE1);
		array.put(KEY2,VALUE2);
		assertEquals(VALUE1, array.get(KEY1));
		assertEquals(2,array.size());
	}

	@Test(expected = UndefinedKeyException.class)
	public void elevoExcepcionClaveNoEncontrada(){
		array.get(KEY1);
	}
	
	@Test
	public void devuelveValorPorDefecto(){
		array.put(KEY1,VALUE1);
		assertEquals(VALUE1, array.getOrElse(KEY1,"nulo"));
		assertEquals("nulo", array.getOrElse(KEY2,"nulo"));
		
	}
	
	@Test
	public void keyExiste(){
		array.put(KEY1,VALUE1);
		assertEquals(true, array.containsKey(KEY1));
	}
	
	@Test
	public void keyNoExiste(){
		assertEquals(false, array.containsKey(KEY1));
	}
	
	@Test
	public void eliminacionDePares(){
		array.put(KEY2,VALUE2);
		array.put(KEY1,VALUE1);
		assertEquals(true,array.remove(KEY1));
		assertEquals(false,array.remove(KEY1));
	}
	
}
