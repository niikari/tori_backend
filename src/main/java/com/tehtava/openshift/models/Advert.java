package com.tehtava.openshift.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advert extends AbstractPersistable<Long> {
	
	@Column(nullable=false)
	private String header;
	
	private String description;
	
	@CreationTimestamp
	@Column(nullable=false, updatable=false, insertable=false)
	private Timestamp timestamp;
	
	@ManyToOne
	private Office office;
	
	@ManyToOne
	private Type type;
	
	private String photoUrl;

}
