package com.tehtava.openshift.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
public class Office extends AbstractPersistable<Long> {
	
	private String street;
	
	private String city;
	
	private String postCode;
	
	private String photoUrl;
	
	@ManyToOne
	private Company company;
	
	@OneToMany(mappedBy="office")
	private List<Advert> adverts = new ArrayList<>();

}
