package deneme;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Hesap makineme ho�geldiniz");
		System.out.println("��lem yapmak istedi�iniz iki say�y� giriniz");
		int num1 = okuyucu.nextInt();
		int num2 = okuyucu.nextInt();
		System.out.println("Hangi i�lemi yapmak istersiniz?");
		char islem = okuyucu.next().charAt(0);
		double sonuc;
		switch(islem) {
		
		case '+':
			
			sonuc = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + sonuc);
			break;
		
		case '-':
			
			sonuc = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + sonuc);
			break;
			
		case '*':
				
				sonuc = num1 * num2;
				System.out.println(num1 + "*" + num2 + "=" + sonuc);
				break;
		case '/':
			
			sonuc = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + sonuc);
			break;
			
			default: System.out.println("Ge�erli i�lemlerden se�iniz: + , - , * , /");
			
		
		}
		okuyucu.close();
	}

}
