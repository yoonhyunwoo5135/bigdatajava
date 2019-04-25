package array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] name = {"김아무개", "박아무개" , "송아무개", "정아무개", "장아무개"};
		int [] cla = {1, 2, 3, 1, 1};
		String [] grade = {"A", "B", "C", "A", "D"};
		String [] cla2 = {"1학년", "2학년", "3학년", "4학년"};
		String [] grade2 = {"A", "B", "C", "D", "F"};
		int j;
		int k;
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		int gnum = 0;
		int gnum2 = 0;
		int gnum3 = 0;
		int gnum4 = 0;
		int gnum5 = 0;
		
		int result = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		
		int gresult = 0;
		int gresult2 = 0;
		int gresult3 = 0;
		int gresult4 = 0;
		int gresult5 = 0;
		
		System.out.println("동아리 명단의 이번 학기 성적입니다.");
		System.out.println();
		System.out.println("이름" + "\t" + "학년" + "\t" + "성적");
		System.out.println("-------------------------");
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + cla[i] + "\t" + grade[i]);
		}
		
		System.out.println();
		System.out.print("전체 인원은? " );
		System.out.println(name.length + " 명");
		System.out.println("전체 명단 프린트");
		System.out.println();
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름: " + name[i] + "  학년: " + cla[i] + "  성적:  " + grade[i]);
		}
		
		System.out.println();
		System.out.println("학년별 인원 수");
		for (int i = 0; i < cla.length; i++) {
			
			if(cla[i] == 1) {
				result = num++;
			}
			else if(cla[i] == 2) {
				result2 = num2++;
			}
			else if(cla[i] == 3) {
				result3 = num3++;
			}
			else if(cla[i] == 4){
				result4 = num4++;
			}
			
		}//for end
		System.out.println("1학년: " + num);
		System.out.println("2학년: " + num2);
		System.out.println("3학년: " + num3);
		System.out.println("4학년: " + num4);
		System.out.println();
		System.out.println("학점별 인원 수");
		for (int i = 0; i < grade.length; i++) {
			
			if(grade[i].equals("A")) {
				gresult = gnum++;
			}
			else if(grade[i].equals("B")) {
				gresult2 = gnum2++;
			}
			else if(grade[i].equals("C")) {
				gresult3 = gnum3++;
			}
			else if(grade[i].equals("D")){
				gresult4 = gnum4++;
			}
			else if(grade[i].equals("F")){
				gresult5 = gnum5++;
			}
			
		}//for end
		System.out.println("A학점: " + num);
		System.out.println("B학점: " + num2);
		System.out.println("C학점: " + num3);
		System.out.println("D학점: " + num4);
		System.out.println("F학점: " + num4);
		System.out.println();
		
		int[] max = {result, result2, result3, result4};
		int max2 = max[0];
		for (j = 0; j < max.length; j++) {
			if(max2 < max[j]) {
				max2 = max[j];
			}//if end
			System.out.println("이 동아리에 가장 많은 학년은? " + cla2[j]);
			break;
		}//for end
		
		int[] gmax = {gresult, gresult2, gresult3, gresult4, gresult5};
		int gmax2 = gmax[0];
		for (k = 0; k < gmax.length; k++) {
			if(gmax2 < gmax[k]) {
				gmax2 = gmax[k];
			}//if end
			System.out.println("이 동아리에 가장 많은 학점은? " + grade2[k] + "학점");
			break;
		}//for end
		
		System.out.print("위치를 찾고 싶은 이름을 입력하세요>> ");
		String name2 = sc.next();
		for (int l = 0; l < name.length; l++) {
			if(name[l].equals(name2)) {
				System.out.println("입력한 이름 " + name2 + "의 위치는 " + (l+1) + "입니다.");
			}
			
		}
		System.out.print("정보를 알고 싶은 이름을 입력하세요>> ");
		String name3 = sc.next();
		for (int m = 0; m < name.length; m++) {
			if(name[m].equals(name3)) {
				System.out.println("입력한 이름 " + name3 + "의 위치는 " + (m+1) + "입니다.");
				System.out.println("입력한 이름의 학년은: " + cla[m]);
				System.out.println("입력한 이름의 학년은: " + grade[m]);
			}
			
		}
		
		
	}//main end

}//class end
