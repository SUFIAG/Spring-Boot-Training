package com.example.easynotes.repository;

import com.example.easynotes.model.Note;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	public List<Note> findAll();
	
}