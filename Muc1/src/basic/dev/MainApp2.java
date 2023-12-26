package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double dientich, canhDay, chieuCao, Chuvi;
		System.out.println("Nhap so de xem co phai tam giac ko");
		System.out.println("nhap so a");
		Double a = sc.nextDouble();
		System.out.println("nhap so b");
		Double b = sc.nextDouble();
		System.out.println("nhap so c");
		Double c = sc.nextDouble();
		if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
			System.out.println("la tam giac");

			Chuvi = a + b + c;
			System.out.println("Va chu vi tam giac" + Chuvi);

			System.out.println("Nhập chiều dài cạnh đáy: ");
			canhDay = sc.nextDouble();
			System.out.println("Nhập chiều cao: ");
			chieuCao = sc.nextDouble();
			dientich = canhDay * chieuCao / 2;
			System.out.println("Diện tích hình tam giác là: " + dientich);

		} else {
			System.out.println("ko phai tam giac");
		}

	}

}
