package Problem;

import Problem.Student;

public class Student {
		static int countStudents;
		int sid;
		String name;
		String city;

		public Student() {
			this(202300);
		}

		public Student(int sid) {
			this(sid, "");
		}

		public Student(int sid, String name) {
			this(sid, name, "");
		}

		public Student(int sid, String name, String city) {
			this.sid = sid;
			this.name = name;
			this.city = city;
			countStudents++;
		}

		public String toString() {
			return sid + ":" + name + ":" + city;
		}

		void showStudent() {
			System.out.print("객체: ");
			System.out.println(this.toString());
		}

		static void showNumberObjects() {
			System.out.println(countStudents);

		}

		public static void main(String[] args) {
			int[] a = new int[5];
			Student arry[] = new Student[5];
			showNumberObjects(); //현재 만들어진 객체수를 출력
			arry[0] = new Student();
			arry[1] = new Student(202301);
			arry[2] = new Student(202302, "Hong");
			arry[3] = new Student(202303, "Lee", "Busan");
			arry[4] = new Student(202304, "Na", "jeju");
			showNumberObjects(); //생성 후 객체수를 출력
			
			for (int i = 0; i < 5; i++) {
				arry[i].showStudent();
			}

			}
		}
