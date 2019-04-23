package array;

public class Test {

	public static void main(String[] args) {
		/*배열에 저장하고 출력
		 * 친구 5명의 시력을 알고 있습니다.
		 * 친구 5명의 성별을 알고 있습니다.
		 * 친구 5명의 학점을 알고 있습니다.
		 * 친구 5명의 이름을 알고 있습니다.
		 * 
		 */
		double [] eye = {1.0, 2.0, 0.5, 0.7, 25.0};
		char [] jender = {'남','여','남','여','남'};
		char [] grade = {'F','D','B','C','A'};
		String [] name = {"철수","영희","바둑","희연","조타"};
		
		System.out.println("이름: " + name[0] + " 성별: " + jender[0] + " 성적: " + grade[0] + " 시력: " + eye[0]);
		System.out.println("이름: " + name[1] + " 성별: " + jender[1] + " 성적: " + grade[1] + " 시력: " + eye[1]);
		System.out.println("이름: " + name[2] + " 성별: " + jender[2] + " 성적: " + grade[2] + " 시력: " + eye[2]);
		System.out.println("이름: " + name[3] + " 성별: " + jender[3] + " 성적: " + grade[3] + " 시력: " + eye[3]);
		System.out.println("이름: " + name[4] + " 성별: " + jender[4] + " 성적: " + grade[4] + " 시력: " + eye[4]);
		
		
		
	}
}
