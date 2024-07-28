package com.akhil.tutorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.response.ApiResponse;
import com.akhil.tutorEntity.TutorEntity;
import com.akhil.tutorService.TutorService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
public class TutorController 
{
	@Autowired
	private TutorService tutorService;
	
	@PostMapping("/save")
	public ResponseEntity<ApiResponse<TutorEntity>> saveTutor(@Valid @RequestBody TutorEntity tutorEntity) 
	{
		TutorEntity tutor= tutorService.saveTutor(tutorEntity);
		return ResponseEntity.ok(new ApiResponse<>("Tutor created successfully", tutor));
	}
	
	@PutMapping("/tutor/{id}")
	public ResponseEntity<ApiResponse<TutorEntity>> updateTutor(@PathVariable Integer id,@Valid @RequestBody TutorEntity tutorEntity)
	{
		TutorEntity tutor=tutorService.updateTutor(id, tutorEntity);
		return ResponseEntity.ok(new ApiResponse<>("Tutor update successfully", tutor));
	}
	
	@GetMapping("/tutor/{id}")
	public ResponseEntity<ApiResponse<TutorEntity>> getById(@PathVariable Integer id)
	{
		TutorEntity tutor = tutorService.getById(id);
		return ResponseEntity.ok(new ApiResponse<>("Tutor retrieved successfully", tutor));
	}
	
	@GetMapping("/allTutors")
	public ResponseEntity<ApiResponse<List<TutorEntity>>> getAllTutor()
	{
		List<TutorEntity> tutor = tutorService.getAllTutor();
		return ResponseEntity.ok(new ApiResponse<>("All tutor retrieved successfully", tutor));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ApiResponse<String>> deteleById(@PathVariable Integer id)
	{
		String tutor = tutorService.deteleById(id);
		return ResponseEntity.ok(new ApiResponse<>(tutor, null));
	}
}
