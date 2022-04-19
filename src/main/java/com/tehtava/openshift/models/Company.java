package com.tehtava.openshift.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

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
		
	private String nimi;
	
	private String webUrl;

	@OneToMany(mappedBy="company", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<UserCompany> userCompanies = new ArrayList<>();
	
	@OneToMany(mappedBy="company", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Office> offices = new ArrayList<>();
}
