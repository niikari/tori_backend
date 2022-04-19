package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
