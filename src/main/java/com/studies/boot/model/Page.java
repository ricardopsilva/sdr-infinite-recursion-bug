package com.studies.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Page {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@GenericGenerator(name = "uuid-gen", strategy = "uuid2")
	private Long id;


	@ManyToOne
	@JsonBackReference
	private Book book;

	private Integer number;
	
}
