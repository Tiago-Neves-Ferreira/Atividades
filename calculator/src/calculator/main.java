package calculator;

import java.util.List;
import java.util.Scanner;
import calculator.calc;

public class main 
{
public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int x = 0;
		while(x<=4)
		{
			System.out.printf("CAlculadora\n");
			System.out.printf("1 - Soma\n");
			System.out.printf("2 - Subtraçao\n");
			System.out.printf("3 - Divisão\n");
			System.out.printf("4 - Multiplicação\n");
			System.out.printf("5 - Sair\n");
			
			x = a.nextInt();
			
			calc calc = new calc();
			
			switch(x) {
			
				case 1:
					System.out.println("Soma: 9 + 2: " + calc.sum(9, 2));
				break;
				case 2:
					System.out.println("Sub: 9.5 - 2.5: " + calc.sub(9.5, 2.5));
				break;	
				case 3:
					System.out.println("Div: 9 / 2: " + calc.div(9, 2));
				break;
				case 4:
					System.out.println("Mult: 9 * 2: " + calc.mult(9, 2));
				break;
				case 5:
					List<String> operations = calc.getLastOperations();
					System.out.println("Operações realizadas");
					for (String operation : operations) {
					System.out.println(operation);
					}
				break;	
				}
			}
		}
	}


