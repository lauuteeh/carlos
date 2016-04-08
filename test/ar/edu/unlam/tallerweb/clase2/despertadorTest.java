package ar.edu.unlam.tallerweb.clase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class despertadorTest {

	@Test
	public void test() {
		
		Despertador despertadorcito;
		despertadorcito = new Despertador(); //New invoca al constructor de la clase
		
		despertadorcito.programar(6, 20);
		
	}

}
