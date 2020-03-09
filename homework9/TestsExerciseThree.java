package homework9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import fmi.informatics.extending.Student;
import junit.framework.Assert;

class TestsExerciseThree {

	@Test
	void test() {
		
		List<Student> studs = new ArrayList<>();

		for (int i = 0; i < 5; ++i)
			studs.add(Student.StudentGenerator.make());
		String studNames = studs.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).map(s -> s.getName())
				.reduce((s1, s2) -> {
					if (s2 != null)
						return s1 + ", " + s2;
					return s1;
				}).get();
		System.out.println(studNames);
		
		Assert.assertEquals(studNames, "Lilly","Petyr");
		
		
		
		
		
		
		
		
	}

}
