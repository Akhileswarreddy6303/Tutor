package com.akhil.tutorRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.tutorEntity.TutorEntity;
@Repository
public interface TutorRepo extends JpaRepository<TutorEntity, Integer>{

}
