import java.util.Scanner;

public class Answer3 {
	
	
	public static void PrintNumberInWord (int number) {

		switch(number) {
		
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			
			default:
				System.out.println("OTHER");
		
		}

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		if(number == 1) {
			PrintNumberInWord (number);
			
		}else if(number == 2) {
			PrintNumberInWord (number);
			
		}else if(number == 3) {
			PrintNumberInWord (number);
			
		}else if(number == 4) {
			PrintNumberInWord (number);
			
		}else if(number == 5) {
			PrintNumberInWord (number);
			
		}else if(number == 6) {
			PrintNumberInWord (number);
			
		}else if(number == 7) {
			PrintNumberInWord (number);
			
		}else if(number == 8) {
			PrintNumberInWord (number);
			
		}else if(number == 9) {
			PrintNumberInWord (number);
			
		}else {
			PrintNumberInWord (number);
		}

	}

}
