import java.util.Scanner;

public class DiferentesOpera��es {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
        Scanner leitor = new Scanner(System.in);
        
		System.out.println("Ol�, seja bem vindo. digite dois numeros para descobrir como eles s�o resolvidos em diferentes opera��es.");
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = leitor.nextInt();
		
		System.out.println("Agora digite o segundo:");
		num2 = leitor.nextInt();
		
		int soma =num1+num2;
		int subtracao =num1-num2;
		int multiplicacao = num1*num2;
		int divisao =num1/num2;
		int resto = num1%num2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtra�ao: "+subtracao);
		System.out.println("Multiplica��o: "+multiplicacao);
		System.out.println("Divis�o: "+divisao);
		System.out.println("Resto da Divis�o: "+resto);
			
		
		
		
		
		
		
		
		
		
		
		

	}

}