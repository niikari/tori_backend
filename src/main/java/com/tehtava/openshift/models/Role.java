package com.tehtava.openshift.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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
public class Role extends AbstractPersistable<Long> {
	
	@Column(nullable=false)
	private String role;
	
	@OneToMany(mappedBy="role")
	private List<UserRole> userRoles = new ArrayList<>();

}
