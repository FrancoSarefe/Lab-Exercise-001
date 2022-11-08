import java.util.Scanner;

public class Answer4 {
	
	public static void PrintDayInWord(int number) {

		switch(number) {

			case 0:
				System.out.println("MONDAY");
				break;
			case 1:
				System.out.println("TUESDAY");
				break;
			case 2:
				System.out.println("WEDNESDAY");
				break;
			case 3:
				System.out.println("THURSDAY");
				break;
			case 4:
				System.out.println("FRIDAY");
				break;
			case 5:
				System.out.println("SATURDAY");
				break;
			case 6:
				System.out.println("SUNDAY");
				break;
			
		}

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		if(number == 0) {
			PrintDayInWord(number);
			 
		}else if(number == 1) {
			PrintDayInWord(number);
			
		}else if(number == 2) {
			PrintDayInWord(number);
			
		}else if(number == 3) {
			PrintDayInWord(number);
			
		}else if(number == 4) {
			PrintDayInWord(number);
			
		}else if(number == 5) {
			PrintDayInWord(number);
			
		}else if(number == 6) {
			PrintDayInWord(number);
				
		}

	}

}
