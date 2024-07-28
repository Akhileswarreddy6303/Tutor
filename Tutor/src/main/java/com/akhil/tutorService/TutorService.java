package com.akhil.tutorService;

import com.akhil.tutorEntity.TutorEntity;

import java.util.List;

public interface TutorService 
{
	public TutorEntity saveTutor(TutorEntity tutorEntity);

	public TutorEntity updateTutor(Integer id,TutorEntity tutorEntity);

	public List<TutorEntity> getAllTutor();
	
	public String deteleById(Integer id);

	public TutorEntity getById(Integer id);





	
}
