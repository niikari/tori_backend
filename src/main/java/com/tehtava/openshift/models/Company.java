package com.tehtava.openshift.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

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

	@OneToMany(mappedBy="company")
	private List<UserCompany> userCompanies = new ArrayList<>();
	
	@OneToMany(mappedBy="company")
	private List<Office> offices = new ArrayList<>();
}
