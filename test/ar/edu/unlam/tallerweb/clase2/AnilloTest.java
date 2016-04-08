package ar.edu.unlam.tallerweb.clase2;

import org.junit.Assert;
import org.junit.Test;


public class AnilloTest {

	@Test
	public void perimetroExt() {
		
		Anillo anillito = new Anillo();
		Double perimetroEsperado = 6.28;
		
		Double PerimetroObtenido = anillito.calculoPerimetro(1.00);
		
		Assert.assertEquals(perimetroEsperado, PerimetroObtenido);
		
		
	}
	
	@Test
	public void perimetroInt() {
		
		Anillo anillito = new Anillo();
		Double perimetroEsperado = 1.884;
		
		Double PerimetroObtenido = anillito.calculoPerimetro(0.30);
		
		Assert.assertEquals(perimetroEsperado, PerimetroObtenido);
		
		
	}
	
	@Test
	public void areaAnillo() {
		
		Anillo anillito = new Anillo();
		Double areaEsperada = 5.7148;
		
		Double areaObtenida = anillito.calculoArea(1.00);
		Double areaObtenida2 = anillito.calculoArea(0.30);
	
		Double areaFinalAnillo = anillito.calculoAreaAnillo(areaObtenida,areaObtenida2);
		Assert.assertEquals(areaEsperada, areaFinalAnillo);
		
		
	}
	
	
	

}
