import java.util.*;
public class Calcular {


	public static void main(String[] args) {
	int n1;
	int n2;
	
	String operacao = "";
	int control=0;
	
	Scanner entrada = new Scanner(System.in);
	
	while(true) {
		System.out.println("Menu da Calculadora\n1-Calcular\n2-Encerrar");
		String opcao = input.nextLine();
		if(opcao.isEmpty()==false ) {
		if(opcao.equals("1")) {
			System.out.println("Inicie os calculos");
		}
		}
		
	
	
	System.out.println("Digite a operação que deseja usar ()+,-,*,/): ");
	operacao = entrada.nextLine();
	
	System.out.println("Digite um valor: ");
	n1 = Integer.parseInt(entrada.nextLine());
	
	System.out.println("Digite um valor: ");
	n2 = Integer.parseInt(entrada.nextLine());
	
	if(operacao.equals("+")) {
		System.out.println("O resultado da soma é:  "+(n1 + n2));
		control++;
		}

	if(operacao.equals("-")) {
		System.out.println("O resultado da subtração é: "+(n1 - n2));
		control++;
		}
	if(operacao.equals("*")) {
		System.out.println("O resultado da multiplicação é: "+(n1 * n2));
		control++;
		}
	if(operacao.equals("/")) {
		System.out.println("O resultado da divisão é: "+(n1 / n2));
		control++;
		}
	if(control == 0) {
		System.out.println("Operação invalida, tente novamente");
	}
	
		}

			}
					}
