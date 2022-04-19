package com.tehtava.openshift.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company extends AbstractPersistable<Long> {
	
	private String yNumber;
	
	@ManyToMany(mappedBy="companies")
	@JsonIgnore
	private List<User> users = new ArrayList<>();
	
	private String nimi;
	
	private String webUrl;
	

}
