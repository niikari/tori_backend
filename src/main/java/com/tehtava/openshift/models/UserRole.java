package com.tehtava.openshift.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRole extends AbstractPersistable<Long> {
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Role role;

}
