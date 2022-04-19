package com.tehtava.openshift.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usertable")
public class User extends AbstractPersistable<Long> {

	private String username;
	
	private String email;
	
	@ManyToMany
	@JsonIgnore
	private List<Company> companies = new ArrayList<>();
}
