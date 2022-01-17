package com.example.springbootrestapi.Repository;

import com.example.springbootrestapi.Entity.Interviewer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewerRepository extends JpaRepository<Interviewer, Integer> {
}
