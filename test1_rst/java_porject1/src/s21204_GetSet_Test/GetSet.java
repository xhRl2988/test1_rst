package s21204_GetSet_Test;

import java.util.Scanner;

class People{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int rank; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return getKor() + getEng() +getMath();
	}
	public double getAvg() {
		return (double)getSum() / 3;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	void printScore() {
		System.out.printf(" %3s %3d %3d %3d %3d %3.2f %3d \n",
						name,kor,eng,math,getSum(),getAvg(),rank);
	}	
}

public class GetSet {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("성적처리 인원을 입력하세요: ");
		int num=input.nextInt();
		
		People stu[]=new People[num]; //인스턴스 생성
		//처리할 인원에 대한 성명 및 점수 입력
		for(int i=0; i<stu.length; i++) {
			stu[i] = new People();
			
			System.out.print("성명을 입력하세요: ");
			stu[i].setName(input.next());
			
			System.out.print("국어 점수를 입력하세요: ");
			stu[i].setKor(input.nextInt());
			System.out.print("영어 점수를 입력하세요: ");
			stu[i].setEng(input.nextInt());
			System.out.print("수학 점수를 입력하세요: ");
			stu[i].setMath(input.nextInt());
		}
		//성적 합산 후 석차 부여
		for(int i=0; i<stu.length; i++) {
			int rank=1;
			for(int j=0; j<stu.length; j++) {
				if(stu[i].getSum() < stu[j].getSum()) rank++;
			}
			stu[i].setRank(rank);
		}
		//전체 출력
		System.out.println("================================");
		System.out.printf(" 성명  국어  영어  수학  합계  석차 \n");
		System.out.println("================================");
		for(int i=0; i<stu.length; i++) {
			stu[i].printScore();
		}
	}
}
