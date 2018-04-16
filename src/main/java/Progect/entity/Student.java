package Progect.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter @Setter
public class Student extends BaseEntity {

	@Column(name = "full_name", length = 80)
	private String fullName;
	
	private int age;

	@ManyToMany
	@JoinTable(name = "student_course",
	joinColumns = @JoinColumn(name = "stident_id"), inverseJoinColumns = @JoinColumn(name = "course_id")
	)
	
	
	
	private List<Course> courses = new ArrayList<>();

	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	


	
	
	
}
