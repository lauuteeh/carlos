package ar.edu.unlam.tallerweb.clase2;

public class Anillo {
	
	public Double calculoPerimetro (Double radio){
		Double pi= 3.14;
		Double resultado = 2*pi*radio;
		
		return resultado;
	}
	
	
	public Double calculoArea (Double radio){
		Double pi = 3.14;
		
		Double resultado = (2*pi)*(radio*radio);
		
		return resultado;
		
	}
	
	public Double calculoAreaAnillo(Double a, Double b){
		
		Double resultado = a - b;
		
		return resultado;
	}
	
}
