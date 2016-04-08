package ar.edu.unlam.tallerweb.clase2;




import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testQueSume(){
		Calculadora miCalculo = new Calculadora();
		Integer cantidadEsperada = 4;
		
		Integer cantidadObtenida = miCalculo.sumar(3,1);
		
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		
	}
	
	@Test
	public void testQueMultiplique(){
		Calculadora miCalculo = new Calculadora();
		Integer cantidadEsperada = 9;
		
		Integer cantidadObtenida = miCalculo.multiplicar(3,3);
				
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	}
	@Test
	public void testMostrarResultado(){
		Calculadora miCalculo = new Calculadora();
		Integer cantidadEsperada = 9;
		
		Integer cantidadObtenida = miCalculo.multiplicar(3,1);
		 cantidadObtenida = miCalculo.multiplicar(3,2);
		 cantidadObtenida = miCalculo.multiplicar(3,3);
		
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		
	}
	
	@Test
	public void testMostrarResultado2s(){
		Calculadora miCalculo = new Calculadora();
		Integer cantidadEsperada = 18;
		
		Integer cantidadObtenida = miCalculo.multiplicar(3,1);
		 cantidadObtenida = miCalculo.multiplicar(cantidadObtenida,2);
		 cantidadObtenida = miCalculo.multiplicar(cantidadObtenida,3);
		
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		
	}

}
