package com.studies.boot.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@GenericGenerator(name = "uuid-gen", strategy = "uuid2")
	private Long id;
	
	
	@OneToMany(mappedBy="book")
	@JsonManagedReference
	private Set<Page> pages;
	
	private String name;
	
	
}
