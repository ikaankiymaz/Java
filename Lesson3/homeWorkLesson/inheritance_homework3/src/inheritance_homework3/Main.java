package inheritance_homework3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();

		student1.userId = 100001;
		student1.firstName = "Ilteris Kaan";
		student1.lastName = "Kiymaz";
		student1.userNumber = "1030225444";
		student1.userPassword = "123456789A.";
		student1.studentOption = "2th grade student";

		Student student2 = new Student();

		student2.userId = 100002;
		student2.firstName = "Halit";
		student2.lastName = "Cetin";
		student2.userNumber = "1030225474";
		student2.userPassword = "123456789B.";
		student2.studentOption = "4th grade student";

		Insructor insructor1 = new Insructor();

		insructor1.userId = 100003;
		insructor1.firstName = "Engin";
		insructor1.lastName = "Demirog";
		insructor1.userNumber = "1030227479";
		insructor1.userPassword = "123456789C.";
		insructor1.bankAccount = "TR 5001 4145 8785 7848 12";
		insructor1.instructorOption = "Professional";

		Insructor insructor2 = new Insructor();

		insructor2.userId = 100004;
		insructor2.firstName = "Mbwana";
		insructor2.lastName = "Samatta";
		insructor2.userNumber = "1030225474";
		insructor2.userPassword = "123456789B.";
		insructor2.bankAccount = "TR 5001 4145 7456 4774 72";
		insructor2.instructorOption = "Semi-Professional";
		
		StudentManager studentManager = new StudentManager();
		InsructorManager insructorManager = new InsructorManager();
		
		studentManager.Add(student1);
		studentManager.Add(student2);
		insructorManager.Add(insructor1);
		insructorManager.Add(insructor2);
		
		studentManager.Remove(student1);
		studentManager.Remove(student2);
		insructorManager.Remove(insructor1);
		insructorManager.Remove(insructor2);
		
		
	}

}
