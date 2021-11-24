/*
	Программа позволяет по указанному номеру узнать название соответствующего дня недели.
	Version 0.9
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class WeekDay {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

		while(true) {
			System.out.print("Введите номер дня недели от 1 до 7 или 0 для выхода: ");
			int day = scanner.nextInt();

			if(day == 0) {
				System.out.println("Выход");
				scanner.close();
				break;

			} else if((day >= 1) && (day <= 7)) {
				System.out.print("	" + day + "-й день недели - это ");
				System.out.println(days[day - 1] + ".");

			} else {
				System.out.println("	Вы ввели неподходящие данные!");
			}
		}
	}
}
