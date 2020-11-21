package com.example.demoproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tvshow {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String tvshowName;
	int yearOfRelease;
	private String imageLink;
}
