package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {

}
