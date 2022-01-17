package com.example.springbootrestapi.Repository;

import com.example.springbootrestapi.Entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {
}
