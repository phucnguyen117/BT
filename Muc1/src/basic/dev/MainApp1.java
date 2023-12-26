package basic.dev;

import java.util.Scanner;

public class MainApp1 {

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
		} else {
			System.out.println("ko phai tam giac");
		}

	}

}
