import java.util.Scanner;
import java.util.InputMismatchException;

public class WeekDay {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Введите номер дня недели от 1 до 7 или 0 для выхода: ");
			int day = scanner.nextInt();
			
			if(day == 0) {
				System.out.println("Выход");
				scanner.close();
				break;
				
			} else if((day >= 1) && (day <= 7)) {
				System.out.print("	" + day + "-й день недели - это ");
				
				if(day == 1) {
					System.out.println("понедельник.");
				} else if(day == 2) {
					System.out.println("вториник.");
				} else if(day == 3) {
					System.out.println("среда.");
				} else if(day == 4) {
					System.out.println("четверг.");
				} else if(day == 5) {
					System.out.println("пятница.");
				} else if(day == 6) {
					System.out.println("суббота.");
				} else if(day == 7) {
					System.out.println("воскресенье.");
				}
				
			} else {
				System.out.println("	Вы ввели неподходящие данные!");
			}
		}
	}
}
