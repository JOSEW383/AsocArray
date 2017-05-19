package test;

import static org.junit.Assert.*;

import org.junit.Test;

import asocArray.AsocArray;

public class AsocArrayTest {

	@Test
	public void creacionDelArray() {
		AsocArray array = new AsocArray();
		assertEquals(0, array.size());
	}

}
