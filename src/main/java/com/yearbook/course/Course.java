package com.yearbook.course;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import school.School;

import com.yearbook.student.Student;

@Entity
@Data
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String name;

	
	
	


	
}
