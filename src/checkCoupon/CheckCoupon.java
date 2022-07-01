package checkCoupon;

import java.util.Scanner;

public class CheckCoupon {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un cupon");
		int enteredCode = sc.nextInt();
		sc.nextLine();

		String currentDate = "July 9, 2015";
		int correctCode = enteredCode;
		String expirationDate = "July 2, 2015";
		System.out.println(checkCoupon(enteredCode, correctCode, currentDate, expirationDate));

	}

	public static boolean checkCoupon(int enteredCode, int correctCode, String currentDate, String expirationDate) {
		boolean result = false;

		if (enteredCode == correctCode) {
			String mes = "";
			String fecha = "";
			int i = 0;
			while (i < currentDate.length() && currentDate.charAt(i) != ' ') {
				mes += currentDate.charAt(i);
				i++;
			}
			while (i < currentDate.length()) {
				if (!(currentDate.charAt(i) == ' ' || currentDate.charAt(i) == ',')) {
					fecha += currentDate.charAt(i);
				}
				i++;
			}

			int fecha1 = Integer.parseInt(fecha);
			int mes1 = mesToInt(mes);

			i = 0;
			mes = "";
			fecha = "";
			while (i < expirationDate.length() && expirationDate.charAt(i) != ' ') {
				mes += expirationDate.charAt(i);
				i++;
			}
			while (i < expirationDate.length()) {
				if (!(currentDate.charAt(i) == ' ' || currentDate.charAt(i) == ',')) {
					fecha += expirationDate.charAt(i);
				}
				i++;
			}

			fecha.replace(", ", "");
			int fecha2 = Integer.parseInt(fecha);
			int mes2 = mesToInt(mes);
			if (mes1 <= mes2 && fecha1 <= fecha2) {
				result = true;
			}
		}
		return result;

	}

	private static int mesToInt(String mes) {
		int mes1 = 0;
		switch (mes) {
		case "January":
			mes1 = 1;
			break;
		case "February":
			mes1 = 2;
			break;
		case "March":
			mes1 = 3;
			break;
		case "April":
			mes1 = 4;

			break;
		case "May":
			mes1 = 5;

			break;
		case "June":
			mes1 = 6;

			break;
		case "July":
			mes1 = 7;

			break;
		case "August":
			mes1 = 8;

			break;
		case "September":
			mes1 = 9;

			break;
		case "October":
			mes1 = 10;

			break;
		case "November":
			mes1 = 11;

			break;
		case "December":
			mes1 = 12;

			break;
		default:
			System.out.println("Introduce a correct month.");
		}
		return mes1;
	}

}
