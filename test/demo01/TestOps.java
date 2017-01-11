package demo01;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestOps {

	@Test
	public void testResTresNumeros() {
		assertEquals(9, Ops.suma(14, -1, -4));
	}
	
	@Test
	public void testResDosNumeros() {
		assertEquals(8, Ops.suma(14, -6));
	}
	
	@Test
	public void testSumTresNumeros() {
		assertEquals(12, Ops.suma(8, 1, 3));
	}
	
	
	@Test
	public void testSumDosNumeros() {
		assertEquals(14, Ops.suma(8, 6));
	}

}
