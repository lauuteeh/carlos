package ar.edu.unlam.tallerweb.clase1;

import org.junit.Assert;
import org.junit.Test;


public class contadorDeGanadoTest {

	@Test
	public void testQuePuedaContar() {
		
		//Preparación
		contadorDeGanado miContador = new contadorDeGanado();
		Integer cantidadEsperada=1;
		
		//Ejecución
		miContador.contar();
		Integer cantidadObtenida = miContador.mostrarCantidad();
		
		//Validación
		Assert.assertEquals(cantidadEsperada,cantidadObtenida);
		
		//Limpieza
		miContador = null;
	}

	@Test
	public void testQuePuedaContar2() {
		
		contadorDeGanado miContador = new contadorDeGanado();
		Integer cantidadEsperada=0;
		
		Integer cantidadObtenida = miContador.mostrarCantidad();
		
		Assert.assertEquals(cantidadEsperada,cantidadObtenida);
		
		miContador = null;
	}
	
}
