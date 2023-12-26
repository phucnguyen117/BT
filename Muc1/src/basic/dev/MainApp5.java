package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so chu dien tieu dung");
		int sochudien = sc.nextInt();
		int dongia = 0;
		if (sochudien <= 100) {
			dongia = 1800;
		} else if (sochudien >= 200) {
			dongia = 2500;
		} else {
			dongia = 3000;
		}
		int sotien = sochudien * dongia;
		System.out.println("So tien phai tra:" + sotien + "VND");
	}

}
