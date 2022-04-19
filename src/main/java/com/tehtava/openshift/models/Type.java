package com.tehtava.openshift.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Type extends AbstractPersistable<Long> {
	
	@Column(nullable=false)
	private String type;
	
	@OneToMany(mappedBy="type", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Advert> adverts = new ArrayList<>();

}
