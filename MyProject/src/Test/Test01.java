package Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		System.out.print(">");
		int kor = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		System.out.print(">");
		int mat = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		System.out.print(">");
		int eng = scan.nextInt();
		System.out.println("사회 점수를 입력하세요.");
		System.out.print(">");
		int soc = scan.nextInt();
		System.out.println("과학 점수를 입력하세요.");
		System.out.print(">");
		int sci = scan.nextInt();
		System.out.println("국어 점수:" + kor);
		System.out.println("수학 점수:" + mat);
		System.out.println("영어 점수:" + eng);
		System.out.println("사회 점수:" + soc);
		System.out.println("과학 점수:" + sci);
		int total = kor + mat + eng + soc + sci;
		
	}
}
