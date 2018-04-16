package Progect.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Getter @Setter
public class Teacher extends BaseEntity{

	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name", length = 50) // varchar(50)
	private String lastNam;
	
	@Column(name = "age")
	private int age;
	
	@OneToMany(mappedBy = "teacher")
	private List<Course> courses = new ArrayList<>();

	public List<Course> getCourses() {
		return courses;
	}
	
	@OneToOne
	@JoinColumn(name = "teacher_details_id")
	private TeacherDetails teacherDetails;

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	
	
}
