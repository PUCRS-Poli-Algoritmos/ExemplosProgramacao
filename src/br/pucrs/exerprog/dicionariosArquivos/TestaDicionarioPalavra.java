package br.pucrs.exerprog.dicionariosArquivos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestaDicionarioPalavra {

	private DicionarioPalavras dic;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dic = new DicionarioPalavras();
	}

	@Test
	public void testGetAndAddPalavra() {
		int res;
		boolean flag;
		
		res = dic.getNroOcorrencias("casa");
		assertEquals(0, res);
		
		flag = dic.addPalavra("casa");
		assertEquals(true, flag);
		res = dic.getNroOcorrencias("casa");
		assertEquals(1, res);
		flag = dic.addPalavra("casa");
		assertEquals(true, flag);
		res = dic.getNroOcorrencias("casa");
		assertEquals(2, res);
		flag = dic.addPalavra("casa");
		assertEquals(true, flag);
		res = dic.getNroOcorrencias("casa");
		assertEquals(3, res);

		
		res = dic.getNroOcorrencias("mesa");
		assertEquals(0, res);
		
		flag = dic.addPalavra("mesa");
		assertEquals(true, flag);
		res = dic.getNroOcorrencias("mesa");
		assertEquals(1, res);
		flag = dic.addPalavra("mesa");
		assertEquals(true, flag);
		res = dic.getNroOcorrencias("mesa");
		assertEquals(2, res);
		flag = dic.addPalavra("mesa");
		assertEquals(true, flag);
		res = dic.getNroOcorrencias("mesa");
		assertEquals(3, res);

	}


}
