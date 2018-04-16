package Progect;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Progect.entity.Teacher;
import Progect.entity.TeacherDetails;

public class App {
    public static void main( String[] args ) {
       
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager em = entityManagerFactory.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	TeacherDetails teacherDetails = new TeacherDetails();
    	teacherDetails.setEmail("teacher@gmail.com");
    	teacherDetails.setHobby("Programming");
    	System.out.println("Teacher id1: " + teacherDetails.getId());
    	em.persist(teacherDetails);
    	System.out.println("Teacher id2: " + teacherDetails.getId());
    	
//    	Teacher teacher = new Teacher();
//    	teacher.setFirstName("Jonn");
//    	teacher.setLastNam("Doe");
//    	teacher.setAge(25);
//    	teacher.setTeacherDetails(teacherDetails);
//    	em.persist(teacher);
    	
    	Teacher teacher = em.find(Teacher.class, 1);
    	System.out.println("Teacher: " + teacher.getId() + " " + teacher.getFirstName());
    	
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	entityManagerFactory.close();
    }
    
}
