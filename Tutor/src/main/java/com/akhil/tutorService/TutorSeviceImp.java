package com.akhil.tutorService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.tutorEntity.TutorEntity;
import com.akhil.tutorRepo.TutorRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TutorSeviceImp implements TutorService {
	
	@Autowired
	private TutorRepo tutorRepo;
	
	@Override
	public TutorEntity saveTutor(TutorEntity tutorEntity) 
	{
		return tutorRepo.save(tutorEntity);
	}

	@Override
	public TutorEntity updateTutor(Integer id, TutorEntity tutorEntity) 
	{
		Optional<TutorEntity> tutor= tutorRepo.findById(id);
		if(tutor.isPresent())
		{
			return tutorRepo.save(tutorEntity);
		}
		return null;
	}

	@Override
	public List<TutorEntity> getAllTutor() 
	{
		return tutorRepo.findAll();
	}

	@Override
	public String deteleById(Integer id) 
	{
		if(tutorRepo.existsById(id)) {
			tutorRepo.deleteById(id);
			return "Tutor id "+id +" is deleted successfully";
		}
		else {
			throw new EntityNotFoundException("Tutor with ID " + id + " not found");
		}
	}

	@Override
	public TutorEntity getById(Integer id) 
	{
		return tutorRepo.findById(id).orElse(null);
	}

}
