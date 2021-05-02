package oopintrohomework1;

public class CourseManager {

	public void AddToCart(Course course)

	{
		System.out.println(course.name + " sepete eklendi.");
	}

	public void TakeOutOfCart(Course course) {
		System.out.println(course.name + " sepetten çıkarıldı.");
	}

}
