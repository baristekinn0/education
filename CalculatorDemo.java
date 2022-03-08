package deneme;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Hesap makineme hoþgeldiniz");
		System.out.println("Ýþlem yapmak istediðiniz iki sayýyý giriniz");
		int num1 = okuyucu.nextInt();
		int num2 = okuyucu.nextInt();
		System.out.println("Hangi iþlemi yapmak istersiniz?");
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
			
			default: System.out.println("Geçerli işlemlerden seçiniz: + , - , * , /");
			
		
		}
		okuyucu.close();
	}

}
