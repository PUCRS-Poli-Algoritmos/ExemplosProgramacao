package br.pucrs.exerprog.dicionariosArquivos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestaTabelaPalavras {

	private TabelaPalavras tab;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tab = new TabelaPalavras(20000);
	}

	@Test
	public void testGetAndAddOcorrencias() {
		int res;
		boolean flag;
		
		res = tab.getNroOcorrencias("casa");
		assertEquals(0, res);
		
		flag = tab.addPalavra("casa");
		assertEquals(true, flag);
		res = tab.getNroOcorrencias("casa");
		assertEquals(1, res);
		flag = tab.addPalavra("casa");
		assertEquals(true, flag);
		res = tab.getNroOcorrencias("casa");
		assertEquals(2, res);
		flag = tab.addPalavra("casa");
		assertEquals(true, flag);
		res = tab.getNroOcorrencias("casa");
		assertEquals(3, res);

		
		res = tab.getNroOcorrencias("mesa");
		assertEquals(0, res);
		
		flag = tab.addPalavra("mesa");
		assertEquals(true, flag);
		res = tab.getNroOcorrencias("mesa");
		assertEquals(1, res);
		flag = tab.addPalavra("mesa");
		assertEquals(true, flag);
		res = tab.getNroOcorrencias("mesa");
		assertEquals(2, res);
		flag = tab.addPalavra("mesa");
		assertEquals(true, flag);
		res = tab.getNroOcorrencias("mesa");
		assertEquals(3, res);
	}

}
