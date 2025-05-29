package a;

public class Calculadora {
	public int Sumar(int a, int b) {
		return a+b;
	}
	
	public int Restar(int a, int b) {
		return a-b;
	}
	
	public int Multiplicar(int a, int b) {
		return a*b;
	}
	
	public int Dividir(int a, int b) {
		if(b==0) {
			return 0;
		}else {return a/b;
		}
	}

}
