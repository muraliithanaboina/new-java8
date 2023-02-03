package java8.streams.java8.streamspractice.dao;

import java8.streams.java8.streamspractice.models.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentjpa extends JpaRepository<students,Integer> {
}
