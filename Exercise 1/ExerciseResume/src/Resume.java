import java.util.*;
public class Resume {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	printName();
	printGender();
	printBirthday();
	printAge();
	printMarital();
	printCitizenship();
	printAddress();
	printHP();
	printGrade();
	printCGPA();
	printWork();
	printLanguage();
	printAwards();
	
	in.close();

	}
	
	public static void printName() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your name :");
		String name = in.next();
		System.out.println("Name :" + name);
		
	}
	
	public static void printGender() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter you gender :");
		char gender = in.next().charAt(0);
		System.out.println("Gender :" + gender);
	}
	
	public static void printBirthday() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your birthday :");
		String birthday = in.next();
		System.out.println("Birthday :" + birthday);
	}
	
	public static void printAge() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your age :");
		int age = in.nextInt();
		System.out.println("Age :" + age);
		
	}
	
	public static void printMarital() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your marital :");
		String marital = in.next();
		System.out.println("Marital status :" + marital);
	}
	
	public static void printCitizenship() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your citizenship :");
		String citizenship = in.next();
		System.out.println("Citizenship :" + citizenship);
	}
	
	public static void printAddress() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter home address :");
		String address = in.next();
		System.out.println("Home address :" + address);
	}
	
	public static void printHP() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your No. H/P :");
		String hp = in.next();
		System.out.println("No. H/P :" + hp);
	}
	
	public static void printGrade() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter Grade STIA 1113 :");
		String str = in.next();
		char grade = str.charAt(0);
		System.out.println("Grade :" + grade);
	}
	
	public static void printCGPA() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your CGPA (STPM) :");
		double cgpa = in.nextDouble();
		System.out.println("CGPA (STPM) : " + cgpa);
		
	}
	
	public static void printWork() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter work 1 :");
		String work1 = in.next();
		System.out.print("Enter work 2 :");
		String work2 = in.next();
		
		System.out.println("Work experience : 1." + work1 +"\n\t\t  2." + work2);
	}
	
	public static void printLanguage() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter language 1 :");
		String language1 = in.next();
		System.out.print("Enter language 2 :");
		String language2 = in.next();
		System.out.print("Enter language 3 :");
		String language3 = in.next();
		
		System.out.println("Language : 1." + language1 + "\n\t   2." + language2 + "\n\t   3." + language3);
	}
	
	public static void printAwards() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter awards and certificates :");
		String awards = in.next();
		System.out.println("Awards and certificates :" + awards);
	}
	
}