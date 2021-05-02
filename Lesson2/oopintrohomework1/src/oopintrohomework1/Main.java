package oopintrohomework1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Java", "2 ay s�recektir.", "Engin Demiro�", 0);

		Course course2 = new Course();

		course2.id = 2;
		course2.name = "Phyton";
		course2.description = "3 ay s�recektir.";
		course2.insructor = "�lteri� Kaan K�ymaz";
		course2.price = 0;

		Course course3 = new Course(3, "C#", "4 ay s�recektir.", "Halit �etin", 0);

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.insructor);
		}

		Category category1 = new Category(1, "Kurslar�m");

		Category category2 = new Category(2, "T�m Kurslar");

		Category category3 = new Category(3, "Kampa Haz�rl�k");

		Category category4 = new Category(4, "S�k sorulan sorular");

		Category[] categories = { category1, category2, category3, category4 };

		for (Category category : categories) {
			System.out.println(category.name);
		}

		CourseManager courseManager = new CourseManager();

		courseManager.AddToCart(course1);
		courseManager.AddToCart(course2);
		courseManager.AddToCart(course3);
		courseManager.TakeOutOfCart(course1);
		courseManager.TakeOutOfCart(course2);
		courseManager.TakeOutOfCart(course3);

	}

}
