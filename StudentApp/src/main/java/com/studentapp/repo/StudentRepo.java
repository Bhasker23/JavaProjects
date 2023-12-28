package com.studentapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("select s from Student s where s.name = :param1 OR s.standard = :param2 OR s.roll = :param4")
//	@Query("SELECT s FROM Student s WHERE s.name = 'Manav Tyagi' OR s.standard = ''  OR s.roll = 4")
	List<Student> findStudent(@Param("param1") String name, @Param("param2") String standard,
			@Param("param4") Integer roll);
}
