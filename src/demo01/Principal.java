package demo01;

public class Principal {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		int valor = 0;
		
		num1 = 5;
		num2 = 3;
		num3 = 7;
		
		valor = Ops.suma(num1, num2);
		System.out.println("\nLa suma de 2 números es: " + valor);
		
		valor = Ops.suma(num1,  num2,  num3);
		System.out.println("\n\nLa suma de 3 números es: " + valor);
		
		valor = Ops.suma(num1, -num2);
		System.out.println("\n\nLa resta de 2 números es: " + valor);
	
		valor = Ops.suma(10, -3, -1);
		System.out.println("\n\nLa resta de 3 números es: " + valor);
		
	}

}
