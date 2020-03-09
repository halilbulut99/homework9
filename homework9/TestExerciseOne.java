package homework9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import fmi.informatics.extending.Student;

class TestExerciseOne {

	@Test
	void test() {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		
		Stream.of(Student.StudentGenerator.make(), Student.StudentGenerator.make(), Student.StudentGenerator.make(),
				Student.StudentGenerator.make(), Student.StudentGenerator.make()).filter(s -> s.getName().length() >= 5)
				.sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).forEach(System.out::println);
		
		Assert.assertEquals(students.get(2).toString(), "Stoyan");
		
		
		
		
	}

}
