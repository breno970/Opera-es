import java.util.Scanner;

public class DiferentesOperações {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
        Scanner leitor = new Scanner(System.in);
        
		System.out.println("Olá, seja bem vindo. digite dois numeros para descobrir como eles são resolvidos em diferentes operações.");
		
		System.out.println("Digite o primeiro número:");
		num1 = leitor.nextInt();
		
		System.out.println("Agora digite o segundo:");
		num2 = leitor.nextInt();
		
		int soma =num1+num2;
		int subtracao =num1-num2;
		int multiplicacao = num1*num2;
		int divisao =num1/num2;
		int resto = num1%num2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtraçao: "+subtracao);
		System.out.println("Multiplicação: "+multiplicacao);
		System.out.println("Divisão: "+divisao);
		System.out.println("Resto da Divisão: "+resto);
			
		
		
		
		
		
		
		
		
		
		
		

	}

}