package a;

public class Matematicas {
	 public boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 public  boolean esDivisible(int numero, int divisor) {
	        // Si el divisor es 0, se retorna false para evitar una excepción
	        if (divisor == 0) {
	            return false;
	        }
	        // El resto de la división es 0 si y solo si el número es divisible
	        return numero % divisor == 0;
	    }

	    public  boolean esCapicua(int numero) {
	        String numeroString = String.valueOf(numero); // Convertir el número a String
	        int longitud = numeroString.length();

	        // Si el número tiene 1 dígito, es capicúa por definición
	        if (longitud == 1) {
	            return true;
	        }

	        // Comparar los dígitos de izquierda a derecha y de derecha a izquierda
	        for (int i = 0; i < longitud / 2; i++) {
	            if (numeroString.charAt(i) != numeroString.charAt(longitud - 1 - i)) {
	                return false; // Si algún dígito no coincide, no es capicúa
	            }
	        }
	        return true; // Si todos los dígitos coinciden, es capicúa
	    }
}
