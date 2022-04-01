package phase1;

	import java.util.Scanner;
	public class ArithmaticOperator {
		
	        public static void main(String[] args){
		 
	        char operator;
	         Double number1, number2, result;
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Choose an operator: +, -, *, /");
	         operator = sc.next().charAt(0);
	         System.out.println("Enter First digit: ");
	         number1 = sc.nextDouble();
	         System.out.println("Enter Second digitr: ");
	         number2 = sc.nextDouble();
	         switch (operator){
	 
	        case '+':
	        result = number1 + number2;
	        System.out.println(result);
	        break;
	 
	        case '-':
	        result = number1 - number2;
	        System.out.println(result);
	        break;
	 
	        case '*':
	         result = number1 * number2;
	         System.out.println(result);
	         break;
	 
	         case '/':
	         result = number1 / number2;
	         System.out.println(result);
	         break;
	 
	         default:
	         System.out.println("Invalid operator!");
	         break;
	 
	      }
	    }
	   }


