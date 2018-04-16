package Progect.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "course")
@NoArgsConstructor
@Getter @Setter
public class Course extends BaseEntity{
	
	@ManyToMany
	@JoinTable(name = "student_course",
	joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "student_id")
	)
	
	private List<Student> student = new ArrayList<>();
	
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Column(name = "title", length = 120)
	private String title;
	
	@Column(name = "description", length = 1000)
	private String description;

	@Column(name = "price", columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;
	


	

	

	
	
	
}
