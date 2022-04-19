package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.UserCompany;

public interface UserCompanyRepository extends JpaRepository<UserCompany, Long> {

}
