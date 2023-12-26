package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao diem dtb cua sinh vien");
		double dtb = sc.nextDouble();
		if (dtb >= 8) {
			System.out.println(" hoc luc gioi");
		} else if (dtb >= 6.5) {
			System.out.println("hoc luc kha");
		} else if ((dtb < 6.5) && (dtb >= 3.5)) {
			System.out.println("hoc luc trung binh");
		} else {
			System.out.println("hoc luc yeu");
		}
	}

}
