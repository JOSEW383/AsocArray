package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class asocArrayTest {

	@Test
	public void creacionDelArray() {
		AsocArray array = new AsocArray();
		assertEquals(0, array.size());
	}

}
